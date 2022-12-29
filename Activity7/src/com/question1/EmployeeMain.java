package com.question1;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1=new Employee(1,"Vaishnavi",19,50000);
		Employee e2=new Employee(3,"Sadhana",20,60000);
		Employee e3=new Employee(5,"Anuja",18,30000);
		Employee e4=new Employee(4,"Shivani",19,20000);
		
		ArrayList<Employee> el=new ArrayList<>();
		el.add(e1);				//adding the element to the list
		el.add(e2);
		el.add(e3);
		el.add(e4);
		
		Collections.sort(el);		//sorting the element in ascending order
		for(Employee o:el)
		{
			System.out.println(o.id+" "+o.name+" "+o.age+" "+o.salary);
		}

	}

}