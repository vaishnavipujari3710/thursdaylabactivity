package com.question3;

public class StringBufferOperations {

	public static void main(String[] args) {
		
		StringBuffer s=new StringBuffer("Ankita ");
		System.out.println(s);
		
		System.out.println(s.append("galgalikar "));		//adding the string at end of the string
			
		System.out.println(s.insert(18,"is a good girl"));		//inserting the characters
		
		System.out.println(s.reverse());		//reversing the characters
		
		s.replace(6, 17, " Atulkar");  //replacing the characters
		
		
	}

}
