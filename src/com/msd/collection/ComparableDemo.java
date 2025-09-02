package com.msd.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StudentNew implements Comparable<StudentNew>{
	int age;
	String name;
	
	
	public StudentNew(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(StudentNew that) {
		if(this.age>that.age)
			return 1;
		else
			return -1;
	}

	
}
public class ComparableDemo {

	public static void main(String[] args) {
		
		/*
		 * Comparator<StudentNew> comp=new Comparator<StudentNew>() { public int
		 * compare(StudentNew i, StudentNew j) { if(i.age>j.age) return 1; else return
		 * -1; } };
		 */
		
		List<StudentNew> obj = new ArrayList<StudentNew>();

		obj.add(new StudentNew(55, "Sachin"));
		obj.add(new StudentNew(35, "Rohit"));
		obj.add(new StudentNew(45, "Dhoni"));
		obj.add(new StudentNew(33, "Mayank"));
		obj.add(new StudentNew(38, "Virat"));

		Collections.sort(obj);
		
		for (StudentNew std : obj) {
			System.out.println(std);
		}
	}

}
