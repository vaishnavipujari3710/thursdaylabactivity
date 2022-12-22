package com.question2;

public class OriginalAccount{
	
	public static void main(String[] args) {
		Account a=new Account();		//creating a object
		a.deposite();			//calling a method
		try
		{
			//if condition becomes the false throws the exception
			a.withdraw();		//calling a method
			
		}
		catch(Exception e)		//the exception throws by the try block catch block catch that exception
		{
			System.out.println(e);
		}
		 
	}

}