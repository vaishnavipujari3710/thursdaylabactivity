package com.question1;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Product p1=(Product) o1;
		Product p2=(Product) o2;
		if(p1.price==p2.price) return 0;			//comparing the price and returns it
		else if(p1.price>p2.price) return 1;
		else return-1;
		
	}
}