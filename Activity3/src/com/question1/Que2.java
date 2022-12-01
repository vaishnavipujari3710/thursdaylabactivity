package com.question1;

import java.util.Scanner;

class ReverseNo {
	
	public void reverseNumber()
	{
		System.out.println("enter the number to reverse:"); //enter the number for reverse
		      Scanner sc=new Scanner(System.in);
		      int number=sc.nextInt();
		      int reverse=0;
		      
		      while(number!=0)
		      {
		    	  int remainder=number%10;          //logic for reverse of given number
		    	  reverse=reverse*10+remainder;
		    	  number=number/10;
		      }
		      System.out.println("the reverse of the given no is:"+reverse);
		
	}	
}
	class SumOfDigits extends ReverseNo
	{
		public void SumOfDigit()
		{
			System.out.println("enter the number to find sum of digits:");
			Scanner sc=new Scanner(System.in);
			int number=sc.nextInt();
			
			int sum=0,digit;
			
			while(number>0)
			{
				digit=number%10;           //logic for sum
				sum=sum+digit;
				number=number/10;
			}
			System.out.println("sum of digits is"+sum);
		}
		
	}
	public class Que2 extends SumOfDigits
	{

	   public static void main(String[] args) {
		
		   SumOfDigits s=new SumOfDigits(); //creating the object
		   
		   s.SumOfDigit();   //sumofDigit method
		   s.reverseNumber();  //calling the reverse number 
		
		
	}

}


