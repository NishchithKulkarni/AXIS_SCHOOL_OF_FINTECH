package com.bloodbank.exceptions;

public class RequestNotFoundException extends RuntimeException{
	
		
		public RequestNotFoundException() {}
		
	   public RequestNotFoundException( String message) {
		        super(message);
		        
   }

}

