package com.question1;

import java.util.Comparator;

public class ProductNamecomparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Product p1=(Product) o1;
		Product p2=(Product) o2;
		//comparing product name using CompareTo method and returning value
		return p1.name.compareTo(p2.name);			
				
				
		
	}

}