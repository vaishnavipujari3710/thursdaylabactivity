//Written by-Vaishnavi Pujari
//Code to display sequences of lowercase letters joined with underscore.

package com.question2;

public class LowLetUnderscore {

	public static void main(String[] args) {
		 System.out.println(validate("vaishnavi_pujari"));
			System.out.println(validate("Vaishnavi_pujari"));
			System.out.println(validate("vaishnavi_Pujari"));		
			System.out.println(validate("Vaishnavi_Pujari"));	
	}
	 public static String validate(String text) {
		   if (text.matches("^[a-z]+_[a-z]+$"))
	                return "Found a match!";
	       else
	                return "Not matched!";
}
}