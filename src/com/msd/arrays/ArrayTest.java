package com.msd.arrays;

class Animal{
	
}
class Dog extends Animal{
	
}
class Cat extends Dog{
	
}
class Student{
	int sid;
	String sname;
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	
}

public class ArrayTest {
	public static void main(String[] args) {
		int arr[][]= {{12,22,33},{33,44,11},{55,33,23}};
		System.out.println(arr[0][0]+","+arr[0][1]+","+arr[0][2]);
		System.out.println(arr[1][0]+","+arr[1][1]+","+arr[1][2]);
		System.out.println(arr[2][0]+","+arr[2][1]+","+arr[2][2]);
		System.out.println("-------------------------------------------");
		
		Object[] obj=new Object[3];
		obj[0]=new Emp(111, "mayank");
		obj[1]=new Student(222, "sachinn");
		obj[2]=new Integer(10);
		for(Object oo:obj) {
			if(oo instanceof Emp) {
				Emp e=(Emp) oo;
				System.out.println(e.eid+" "+e.name);
			}
			if(oo instanceof Student) {
				Student s=(Student) oo;
				System.out.println(s.sid+","+s.sname);
			}
			if(oo instanceof Integer) {
				System.out.println(oo);
			}
		}
		System.out.println("-------------------------------------------");
		Animal[] a=new Animal[3];
		a[0]=new Animal();
		a[1]=new Dog();
		a[2]=new Cat();
		for(Animal aa:a) {
			System.out.println(aa);
		}
	}

}
