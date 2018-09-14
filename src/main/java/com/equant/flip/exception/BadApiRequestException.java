package com.equant.flip.exception;

public class BadApiRequestException extends Exception {
	private static final long serialVersionUID = -2448104628561163790L;

	public BadApiRequestException(String msg) {
		super(msg);
	}

}
