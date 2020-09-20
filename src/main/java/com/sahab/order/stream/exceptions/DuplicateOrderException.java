package com.sahab.order.stream.exceptions;

public class DuplicateOrderException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public DuplicateOrderException() {
		super("User Already Exist.");
	}

}
