package com.question2;

import java.util.Iterator;

public class StateMain {

	public static void main(String[] args) {
		State a=new State();
		a.addState("Maharshatra");			//adding sate name
		a.addState("Karnataka");
		a.addState("Kerla");
		a.addState("Gujarat");
		
		System.out.println("Retrive the details of state:"+a.retriveState("Kerla"));		//Retrieves the specific state name 

	}

}