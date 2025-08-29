package com.msd.ineritence;

class Parent1{
	void m1() {
		System.out.println("parent m1 method.");
	}
}
class Child1 extends Parent1{
	  void m1() {
		System.out.println("child m1 method.");
	}
	void m2() {
		System.out.println("child m2 method.");
	}
}
public class MethoOverride {

	public static void main(String[] args) {
		Parent1 p=new Child1();
		p.m1();
		Child1 c=(Child1) p;
		c.m2();
	}

}
