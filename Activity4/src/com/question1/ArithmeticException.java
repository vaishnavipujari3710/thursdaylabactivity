package com.question1;

import java.io.IOException;
import java.util.Scanner;
	
class ArithmeticException1{
		
	}
public class ArithmeticException extends Exception{
	
		public static void main(String arg[])
	    {  
			// declare and initialize here.
			int a,b,c;
			Scanner sc=new Scanner(System.in);
			
			// input numbers here.
			System.out.print("Enter first number : ");
			a=sc.nextInt();
      
			System.out.print("Enter second number : ");
			b=sc.nextInt();
      
			//throw to catch
			c=a/b;
			System.out.println("Result:"+c);
			
			System.out.println("End of Program...");
		}

		
		}