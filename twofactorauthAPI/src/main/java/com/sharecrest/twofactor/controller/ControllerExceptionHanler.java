package com.sharecrest.twofactor.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.validation.ValidationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sharecrest.twofactor.SCException;
import com.sharecrest.twofactor.SCUtil;
import com.sharecrest.twofactor.dto.ErrorInfo;

/**
 * 例外ハンドラ
 */
@RestControllerAdvice
public class ControllerExceptionHanler extends ResponseEntityExceptionHandler {
	
	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	MessageSource messages;
	
	public ControllerExceptionHanler() {
		super();
	}
	
	/**
	 * バリデーションエラー時。
	 */
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        FieldError fe = ex.getBindingResult().getFieldErrors().stream().findFirst().get();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return handleExceptionInternal(ex, 
        		SCUtil.getErrorInfo(status.value(), fe.getCode(), fe.getField(), fe.getDefaultMessage()), 
        		headers, status, request);
    }

    /**
     * JSONパース失敗時。
     */
    @Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(
			HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        headers.setContentType(MediaType.APPLICATION_JSON);
        return handleExceptionInternal(ex, 
        		SCUtil.getErrorInfo(status.value(), null, null, messages.getMessage("com.sharecrest.JSON", null, null)), 
        		headers, status, request);
	}
	
    /**
     * すべての例外をキャッチする
     * どこにもキャッチされなかったらこれが呼ばれる
     * @param ex
     * @param request
     * @return
     * @throws JsonProcessingException
     */
    @ExceptionHandler({Exception.class})
    public ResponseEntity<ErrorInfo> handleAllException(Exception ex, WebRequest request) throws JsonProcessingException {
    	HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
    	ErrorInfo err = null;
    	if (ex instanceof AccessDeniedException) {
    		// 認可エラー
    		status = HttpStatus.FORBIDDEN;
    		err = SCUtil.getErrorInfo(status.value(), null, null, messages.getMessage("com.sharecrest.sgj.FORBIDDEN", null, null));
    	} else if (ex instanceof ValidationException) {
    		// バリデーションエラー (@PathVariableなどパス上の変数をバリデーションチェックした場合にエラーの場合はこちらにきます
    		status = HttpStatus.BAD_REQUEST;
    		ValidationException vex = (ValidationException)ex;
    		err = SCUtil.getErrorInfo(status.value(), null, null, vex.getMessage());
    	} else if (ex instanceof SCException) {
    		SCException sce = (SCException)ex;
    		status = sce.getStatus();
    		err = SCUtil.getErrorInfo(status.value(), sce.getError(), sce.getDomain(), sce.getMessage());
    	}
    	if (err == null) {
    		// 予期しないエラー
    		status = HttpStatus.INTERNAL_SERVER_ERROR;
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    		err = SCUtil.getErrorInfo(status.value(), null, null, messages.getMessage("com.sharecrest.UnexpectedError", new Object[]{LocalDateTime.now().format(dateTimeFormatter)}, null));
    	}
    	System.out.println(ex.getMessage());
    	ex.printStackTrace();
		return new ResponseEntity<ErrorInfo>(err, status);
    }

    // すべてのハンドリングに共通する処理を挟みたい場合はオーバーライドする
    // ex) ログを吐くなど
    @Override
    protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {

    	
    	return super.handleExceptionInternal(ex, body, headers, status, request);
    }
}
