package com.question3;

import java.util.ArrayList;
import java.util.Collections;

public class BasketFruits {

	public static void main(String[] args) {
		//adding fruits into the basket list1
		
		ArrayList<String> Fruitbasket1=new ArrayList<>();
		//adding fruits into the basket list1
		Fruitbasket1.add("Mango");
		Fruitbasket1.add("Dragon Fruit");
		Fruitbasket1.add("Pomegranate");
		Fruitbasket1.add("Peer");
		
		System.out.println("This is Fruitbasket1: "+Fruitbasket1);
		System.out.println("-------------------------------");
		
		//adding fruits into the basket list1
		
		ArrayList<String> Fruitbasket2=new ArrayList<>();
		Fruitbasket2.add("Orange");
		Fruitbasket2.add("Custard Apple");
		Fruitbasket2.add("Grapes");
		
		System.out.println("This is Fruitbasket2: "+Fruitbasket2);
		
		System.out.println("-------------------------------");
		Collections.sort(Fruitbasket1);			//sorting the 1st list in ascending order
		System.out.println("after sorting in ascending order:"+Fruitbasket1);
		
		//sorting the 2nd list in descending order
			Collections.sort(Fruitbasket2,Collections.reverseOrder()); 
			System.out.println("after sorting in descending order:"+Fruitbasket2);
			System.out.println("--------------------------------");

		
		//adding the 1st list into the 2nd list
		Fruitbasket2.addAll(Fruitbasket1);
System.out.println("after adding the elemets from Fruitbasket1 to Fruitbasket2 "+Fruitbasket2);
		System.out.println("--------------------------------");

		//checking the given fruit is available at the given position or not
System.out.println("whether the Pineapple is in the list: "+Fruitbasket2.contains("Pineapple"));
System.out.println("--------------------------------");
		
				Fruitbasket1.clear();		//making the 1st list empty
System.out.println("whether the list is empty or not:"+Fruitbasket1.isEmpty());

System.out.println("before removing the element from the specific position "+Fruitbasket2);

			Fruitbasket2.remove(0);      //removing the element from the given position
System.out.println("after removing the element from the specific position "+Fruitbasket2);

	}

}