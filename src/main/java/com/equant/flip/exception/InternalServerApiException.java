package com.equant.flip.exception;

public class InternalServerApiException extends ApiException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3913848661681678921L;
	
	private int code;
	
    public InternalServerApiException (int code, String msg) {
        super(code, msg);
        this.code = code;
    }
}