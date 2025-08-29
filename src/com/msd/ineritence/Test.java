package com.msd.ineritence;

class Parent{
	int a=10;
	int b=20;
	
	public Parent(int x) {
		System.out.println("parent constructer 1-arg");
	}
	
	public Parent() {
		System.out.println("parent constructer 0-arg");
	}
	
	void m1() {
		System.out.println("parent method m1().");
		System.out.println(a+b);
	}
	
	void m2() {
		System.out.println("parent method m2().");
		System.out.println(a+b);
	}
	
	static{
		System.out.println("parent static block.....");
	}
	
	{
		System.out.println("parent instance block.");
	}
}
class Child extends Parent{
	int a=100;
	int b=200;
	
	public Child() {
		System.out.println("child constructer 0-arg");
	}
	public Child(int y) {
		this();
		System.out.println("child constructer 1-arg");
	}
	void m1() {
		System.out.println("child method m1().");
		System.out.println(a+b);
	}
	
	void m2() {
		System.out.println("child method m2().");
		System.out.println(a+b);
	}
	void display(int a,int b) {
		System.out.println(a+b);
		System.out.println(this.a+this.b);
		System.out.println(super.a+super.b);
		super.m1();m1();super.m2();m2();
	}
	
	static{
		System.out.println("child static block.....");
	}
	
	{
		System.out.println("child instance block.");
	}
}
public class Test {
	public static void main(String[] args) {
		//new Child(11).display(1000, 2000);
		new Child();
		new Child();
		new Child();
		new Child();
	}

}
