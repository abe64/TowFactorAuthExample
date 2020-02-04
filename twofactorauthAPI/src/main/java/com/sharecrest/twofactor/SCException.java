package com.sharecrest.twofactor;

import org.springframework.http.HttpStatus;

public class SCException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public SCException(String error, String domain, String message) {
		super(message);
		this.status = HttpStatus.BAD_REQUEST;
		this.error = error;
		this.domain = domain;
	}
	
	public SCException(HttpStatus status, String error, String domain, String message) {
		super(message);
		this.status = status;
		this.error = error;
		this.domain = domain;
	}
	
	private HttpStatus status;
	public HttpStatus getStatus() {
		return status;
	}
	
	private String error;
	public String getError() {
		return error;
	}

	private String domain;
	public String getDomain() {
		return domain;
	}
}
