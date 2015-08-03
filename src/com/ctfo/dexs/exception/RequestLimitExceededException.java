package com.ctfo.dexs.exception;

public class RequestLimitExceededException extends java.lang.RuntimeException {

	private static final long serialVersionUID = 1L;

	public RequestLimitExceededException() {
		super();
	}

	public RequestLimitExceededException(String message, Throwable cause) {
		super(message, cause);
	}

	public RequestLimitExceededException(Throwable cause) {
		super(cause);
	}

	public RequestLimitExceededException(String message) {
		super(message);
	}
}