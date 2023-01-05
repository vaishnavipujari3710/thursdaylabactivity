package com.question3;

public class StringBuilderOperations {

	public static void main(String[] args) {
		
		StringBuilder s=new StringBuilder("India");
		System.out.println(s);
		
		System.out.println(s.append(" is my Country"));		//adding string at the end of the string 
		System.out.println(s.substring(6));			//prints the charcters from the given position		
		System.out.println(s.length());			//prints the length of the string
		
	}

}