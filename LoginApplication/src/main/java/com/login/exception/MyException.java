package com.login.exception;

public class MyException extends Exception {
	private String message;

	public MyException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		
		return this.message;
	}

}
