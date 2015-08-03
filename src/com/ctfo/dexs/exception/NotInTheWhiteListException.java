package com.ctfo.dexs.exception;

public class NotInTheWhiteListException extends java.lang.RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public NotInTheWhiteListException() {
		super();
	}

	public NotInTheWhiteListException(String message, Throwable cause) {
		super(message, cause);
	}

	public NotInTheWhiteListException(String message) {
		super(message);
	}

	public NotInTheWhiteListException(Throwable cause) {
		super(cause);
	}
}
