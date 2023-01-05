package com.question1;

import java.util.ArrayList;
import java.util.Collections;

public class ProductMain {

	public static void main(String[] args) {
		Product p1=new Product(1,"TV",30000);			
		Product p2=new Product(2,"Laptop",40000);
		Product p3=new Product(3,"Washing Machine",22000);
		Product p4=new Product(4,"Computer",25000);
		
		ArrayList<Product> pp=new ArrayList<>();
		pp.add(p1);			//adding product into the Arraylist
		pp.add(p2);
		pp.add(p3);
		pp.add(p4);
		
		Collections.sort(pp,new ProductPriceComparator());		//sorting the element based on the price
		System.out.println("Sorting based on price of  product");
		for(Product p:pp)
		{
			System.out.println(p.price+" "+p.id);
		}
		System.out.println("Sorting based on name of product");
		Collections.sort(pp, new ProductNameComparator());		//sorting the element based on the name
		for(Product p:pp)
		{
			System.out.println(p.name+" "+p.id);
		}
	}

}