package com.sahab.order.stream.exceptions;

public class OrderDoesNotExistException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public OrderDoesNotExistException() {
		super("User does not Exist.");
	}

}
