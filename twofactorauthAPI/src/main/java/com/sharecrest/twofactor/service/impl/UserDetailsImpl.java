package com.sharecrest.twofactor.service.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import com.sharecrest.twofactor.dbflute.exentity.TblUser;

/**
 * ログインユーザー情報実装
 * ログイン認証時に AuthenticationProviderImple 内で生成されセッション内に保存されます。
 */
public class UserDetailsImpl implements UserDetails {
	
	private static final long serialVersionUID = 1L;
	
	private Integer userId;
	private String account;
	private String password;
	private boolean unlocked;
	private Collection<GrantedAuthority> authorityList;
	private boolean _isLogin;
	
	private String preSecret;		// 変更予定秘密コード

	// 現在ログインしているユーザーを返します
	public static UserDetailsImpl getLoginUser() {
		return (UserDetailsImpl)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	}
	
	/**
	 * コンストラクタ。<br/>
	 * userテーブルから初期化します。<br/>
	 * @param user
	 */
	public UserDetailsImpl(TblUser user) {
		userId = user.getUserId();
		account = user.getAccount();
		password = user.getPassword();
		unlocked = user.getUnlocked();
		// 権限データの変換 user.roleにはカンマ区切りで"ROLE_A,ROLE_B"のように入っている
		this.authorityList = new ArrayList<>();
		for(String role : user.getRole().split(",")) {
			this.authorityList.add(new SimpleGrantedAuthority(role.trim()));
		}
		if (user.getTwoFactorUse()) {
			// 2段階認証あり
			this.authorityList.add(new SimpleGrantedAuthority("ROLE_PRE_AUTH_USER"));
		} else {
			// 2段階認証なし
			this.authorityList.add(new SimpleGrantedAuthority("ROLE_AUTH_USER"));
		}
		_isLogin = false;
	}
	
	public Integer getUserId() {
		return userId;
	}
	
	public boolean isLogin() {
		return _isLogin;
	}
	
	public void setIsLogin(boolean value) {
		_isLogin = value;
		update();
	}
	
	public String getPreSecret() {
		return preSecret;
	}
	
	public void setPreSecret(String secret) {
		preSecret = secret;
		update();
	}

	/**
	 * 権限リスト
	 */
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorityList;
	}

	/**
	 * 権限を追加します
	 * @param role "ROLE_USER"などを指定
	 */
	public void addAuthority(String role) {
		this.authorityList.add(new SimpleGrantedAuthority(role.trim()));
		update();
	}
	
	/**
	 * 権限を削除します
	 * @param role "ROLE_USER"などを指定
	 */
	public void removeAuthority(String role) {
		for(GrantedAuthority grant : this.authorityList) {
			if (grant.getAuthority().equals(role.trim())) {
				this.authorityList.remove(grant);
				update();
				break;
			}
		}
	}
	
	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return account;
	}

	/**
	 * アカウントの有効期限の状態を判定。有効期限内の場合はtrue。
	 * 有効期間とか設けないので常にtrue。
	 */
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	/**
	 * アカウントのロック状態を判定。ロックされていない場合はtrue。
	 */
	@Override
	public boolean isAccountNonLocked() {
		return unlocked;
	}

	/**
	 * 資格情報の有効期限の状態を判定する。有効期限内の場合はtrue。
	 * 有効期間とか以下略。
	 */
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	/**
	 * 有効なユーザーかを判定する。有効な場合はtrue。
	 * 有効かどうか管理しないので常にtrue。
	 */
	@Override
	public boolean isEnabled() {
		return true;
	}

	private void update() {
		// 権限の再設定
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		Authentication newAuth = new UsernamePasswordAuthenticationToken(this, auth.getCredentials(), this.getAuthorities());
		SecurityContextHolder.getContext().setAuthentication(newAuth);
	}
}
