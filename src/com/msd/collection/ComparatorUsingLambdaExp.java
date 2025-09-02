package com.msd.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students{
	int age;
	String name;
	
	
	public Students(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	
}
public class ComparatorUsingLambdaExp {

	public static void main(String[] args) {
		
		Comparator<Students> comp=(i,j)->(i.age>j.age)?1:-1;
		
		List<Students> obj = new ArrayList<Students>();

		obj.add(new Students(55, "Sachin"));
		obj.add(new Students(35, "Rohit"));
		obj.add(new Students(45, "Dhoni"));
		obj.add(new Students(33, "Mayank"));
		obj.add(new Students(38, "Virat"));

		Collections.sort(obj,comp);
		
		for (Students std : obj) {
			System.out.println(std);
		}
	}

}
