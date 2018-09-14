package com.equant.flip.exception;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-04T17:17:15.390+05:30")

public class ApiException extends Exception{
    private int code;
    private String message;
    
    public ApiException (int code, String msg) {
        super(msg);
        this.code = code;
        this.message = msg;
    }

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}
    
     
}
