package com.exception.ExceptionHandling.Exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalHandler {
	
	

	@ExceptionHandler(CustomerExists.class)
	public  ResponseEntity<Map<String , String>> handleit(CustomerExists ex)
	{
		
		Map<String, String> mp=new HashMap();
		
		mp.put("conflict", ex.getMessage());
		return ResponseEntity.status(HttpStatus.CONFLICT).body(mp);
	}

}
