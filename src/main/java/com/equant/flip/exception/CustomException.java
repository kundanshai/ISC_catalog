package com.equant.flip.exception;

import org.springframework.http.HttpStatus;

public class CustomException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private HttpStatus status;
	private final Integer errorCode;
	private final String exceptionMessage;
	private final String errorDescription;
	
	public CustomException(Integer errorCode, String exceptionMessage, String errorDescription) {
		super();
		this.errorCode = errorCode;
		this.exceptionMessage = exceptionMessage;
		this.errorDescription = errorDescription;
	}
	
	public CustomException(HttpStatus status, Integer errorCode, String exceptionMessage, String errorDescription) {
		super();
		this.status = status;
		this.errorCode = errorCode;
		this.exceptionMessage = exceptionMessage;
		this.errorDescription = errorDescription;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public String getErrorDescription() {
		return errorDescription;
	}
	
	
	
}
