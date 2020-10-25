package com.manipal.day7;

public class VotingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=15;
		if(age<18) {
			throw new NotEligibleException();
			
		}
		else {
			System.out.println("Congrats !! Eligible");
		}
	}

}
