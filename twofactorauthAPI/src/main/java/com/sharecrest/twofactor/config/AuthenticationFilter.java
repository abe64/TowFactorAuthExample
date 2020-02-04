package com.sharecrest.twofactor.config;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

import javax.servlet.FilterChain;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParseException;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sharecrest.twofactor.dto.Login;

import lombok.Data;

/**
 * SpringSecurityのデフォルトの/loginの代わりに使用されます。
 * ログイン時にJSON形式のパラメータを受けられるようにこのフィルタをSpringSecurityより先に通す形になります。
 * 
 * コンストラクタにログイン成功時/失敗時に呼び出されるコールバックを指定しています。
 * ログイン成功時/失敗時の処理は SecurityConfig 側で行われます。
 */
public class AuthenticationFilter extends UsernamePasswordAuthenticationFilter {
	
	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
    private AuthenticationManager authenticationManager;
    
    /** ログイン認証成功時のコールバック関数 */
    private BiConsumer<HttpServletRequest, HttpServletResponse> successFunction;
    /** ログイン認証失敗時のコールバック関数 */
    private BiConsumer<HttpServletRequest, HttpServletResponse> failedFunction;
	
    private GoogleRecaptcha googleRecaptcha;
    
	/**
     * コンストラクタ
     * @param authenticationManager
     * @param bCryptPasswordEncoder
     */
    public AuthenticationFilter(AuthenticationManager authenticationManager, 
    		BiConsumer<HttpServletRequest, HttpServletResponse> successFunction,
    		BiConsumer<HttpServletRequest, HttpServletResponse> failedFunction,
    		GoogleRecaptcha googleRecaptcha) {
        this.authenticationManager = authenticationManager;
        this.successFunction = successFunction;
        this.failedFunction = failedFunction;
        this.googleRecaptcha = googleRecaptcha;

        // ログイン用のpathをSpringSecurityデフォルトから変更する
        setRequiresAuthenticationRequestMatcher(new AntPathRequestMatcher("/api/login", "POST"));

        // ログイン用のID/PWのパラメータ名を変更する
        setUsernameParameter("account");
        setPasswordParameter("password");
    }

    /**
     * 認証処理
     * ログイン時のパラメータ(JSON) から Loginクラスにマッピングしてから認証マネージャーに渡します。
     * authenticationManager.authenticateの呼び出し時に独自認証の AuthenticationProviderImpl が呼び出され検証が行われます。
     */
    @Override
    public Authentication attemptAuthentication(HttpServletRequest req,
                                                HttpServletResponse res) throws AuthenticationException {
        try {
        	BufferedReader br = new BufferedReader(new InputStreamReader(req.getInputStream()));
        	String json = "";
        	String line = br.readLine();
        	while (line != null) {
        		json += line;
        		line = br.readLine();
        	}
        	br.close();
        	
            // requestパラメータ(JSON)からユーザ情報を読み取る
//            Login loginData = new ObjectMapper().readValue(req.getInputStream(), Login.class);
            Login loginData = new ObjectMapper().readValue(json, Login.class);
            
            if (!performRecaptchaSiteVerify(loginData.getGoogleCaptchaToken())) {
            	// 「わたしはロボットではありません」チェックに失敗
            	throw new AuthenticationCredentialsNotFoundException("reCaptcga challenge failed.");
            }

            UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(
            		loginData,
            		loginData.getPassword(),
                    new ArrayList<>());
            
            setDetails(req, authRequest);
                    
            return authenticationManager.authenticate(authRequest);
        } catch (IOException | JsonParseException e) {
        	throw new AuthenticationCredentialsNotFoundException("login faild - 0");
        }
    }
    
    private boolean performRecaptchaSiteVerify(String token) {
    	try {
        	Map<String, Object> map = new HashMap<String, Object>();
        	ObjectMapper mapper = new ObjectMapper();
        	
    		URL url = new URL("https://www.google.com/recaptcha/api/siteverify");
    		
    		HttpURLConnection uc = (HttpURLConnection)url.openConnection();
        	uc.setRequestMethod("POST");
        	uc.setUseCaches(false);
        	uc.setDoOutput(true);
        	String parameterString = String.format("secret=%s&response=%s", googleRecaptcha.getSecret(), token);
        	OutputStreamWriter out = new OutputStreamWriter(new BufferedOutputStream(uc.getOutputStream()));
        	out.write(parameterString);
        	out.close();
        	
        	BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
        	String line = in.readLine();
        	StringBuffer resultJson = new StringBuffer();
        	while(line != null) {
        		resultJson.append(line);
        		line = in.readLine();
        	}
			uc.disconnect();
			
			map = mapper.readValue(resultJson.toString(), new TypeReference<Map<String, Object>>(){});
			boolean result = (boolean)map.get("success");
	    	return result;
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	return false;
    }

    
    /**
     * 認証に成功した場合の処理
     */
    @Override
    protected void successfulAuthentication(HttpServletRequest req,
                                            HttpServletResponse res,
                                            FilterChain chain,
                                            Authentication auth) {
    	SecurityContextHolder.getContext().setAuthentication(auth);
    	this.successFunction.accept(req, res);
    }
    
    /**
     * 認証に失敗した場合の処理
     */
    @Override
	protected void unsuccessfulAuthentication(HttpServletRequest req,
												HttpServletResponse res, 
												AuthenticationException failed) {
    	SecurityContextHolder.getContext().setAuthentication(null);
    	this.failedFunction.accept(req, res);
	}
}
