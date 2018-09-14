package com.equant.flip.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomsExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionResponse> getException(Exception e, HttpServletRequest request)  {
		ExceptionResponse exceptionResponse = new ExceptionResponse();
		exceptionResponse.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		exceptionResponse.setErrorMessage(e.getMessage());
		exceptionResponse.setErrorUrl(request.getRequestURI());

		return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<ExceptionResponse> getCustomeException(RecordNotFoundException urException,
			HttpServletRequest request) {
		ExceptionResponse exceptionResponse = new ExceptionResponse();
		exceptionResponse.setErrorCode(HttpStatus.NOT_FOUND.value());
		exceptionResponse.setErrorMessage(urException.getMessage());
		exceptionResponse.setErrorUrl(request.getRequestURI());

		return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(Throwable.class)
	public ResponseEntity<ExceptionResponse> getThrowable(Throwable t, HttpServletRequest request) {
		ExceptionResponse exceptionResponse = new ExceptionResponse();
		exceptionResponse.setErrorCode(HttpStatus.BAD_GATEWAY.value());
		exceptionResponse.setErrorMessage(t.getMessage());
		exceptionResponse.setErrorUrl(request.getRequestURI());

		return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_GATEWAY);

	}
	@ExceptionHandler(BadApiRequestException.class)
	public ResponseEntity<ExceptionResponse> getThrowable(BadApiRequestException ex, HttpServletRequest request) {
		ExceptionResponse exceptionResponse = new ExceptionResponse();
		exceptionResponse.setErrorCode(HttpStatus.BAD_REQUEST.value());
		exceptionResponse.setErrorMessage(ex.getMessage());
		exceptionResponse.setErrorUrl(request.getRequestURI());

		return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);

	}
}
