package com.jar.jam.exceptions;

public class JamException extends Exception {

	private static final long serialVersionUID = -5250152755526684414L;

	public JamException() {
		super();
	}

	public JamException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public JamException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public JamException(String arg0) {
		super(arg0);
	}

	public JamException(Throwable arg0) {
		super(arg0);
	}

}
