package com.exception.ExceptionHandling.Exceptions;

public class CustomerExists extends RuntimeException{
	
	public CustomerExists(String str)
	{
		super(str);
	}

}
