package com.msd.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
	int age;
	String name;
	
	
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	
}
public class ComparatorDemo1 {

	public static void main(String[] args) {
		
		Comparator<Student> comp=new Comparator<Student>() {
			public int compare(Student i, Student j) {
				if(i.age>j.age)
					return 1;
				else
					return -1;
			}
		};
		
		List<Student> obj = new ArrayList<Student>();

		obj.add(new Student(55, "Sachin"));
		obj.add(new Student(35, "Rohit"));
		obj.add(new Student(45, "Dhoni"));
		obj.add(new Student(33, "Mayank"));
		obj.add(new Student(38, "Virat"));

		Collections.sort(obj,comp);
		
		for (Student std : obj) {
			System.out.println(std);
		}
	}

}
