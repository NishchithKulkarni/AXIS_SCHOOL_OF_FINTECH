package com.manipal.day7;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Exception Demo Starting...");
		int i=10;
		int j=10;
		String str=null;
		try {
		int k=i/j;
		//if there is an error prior to this code further lines of code doesn't gets executed  
		System.out.println(str.length());
		System.out.println(k);
	}
		//Exception is thrown to JVM So next block doesn't get executed 
		catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
		catch(NullPointerException npe) {
			npe.printStackTrace();
		}
		System.out.println("Exception demo ending....");
	}
}

