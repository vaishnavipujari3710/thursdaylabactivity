package com.question3;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class ColorSet {

	public static void main(String[] args) {
		TreeSet<String> co=new TreeSet<>();
		co.add("Red");				//adding elements in tree set
		co.add("Blue");		//does not maintain insertion order
		co.add("Green");
		co.add("SkyBlue");
		for(String s:co)
		{
			System.out.println(s);
			
		}
		System.out.println("-----------------------------");
		
		TreeSet<String> co1=new TreeSet<>();
		co1.addAll(co);				//copying the element from 1st tree set to 2nd tree set
		Iterator<String> itr=co1.descendingIterator();    //reversing the elements in the tree set
		while(itr.hasNext())
		{
			System.out.println(itr.next());	
		}
		System.out.println("-----------------------------");
		System.out.println(co1.equals(co));		//comparing the 1st tree set second tree set
		
		System.out.println("-------------------------------------");
		System.out.println("to get first element "+co1.pollFirst());			//getting first element from the tree set
		System.out.println("To get Last element "+co1.pollLast());		 //getting last element from the tree set
	

	}

}