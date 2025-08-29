package com.msd.interfac;

interface Interface{
	int a = 10;
	void m1();
	void m2();
	void m3();
}
interface Interface1{
	void m4();
}
class Test implements Interface,Interface1{

	@Override
	public void m1() {
		System.out.println("m1 method called");
	}

	@Override
	public void m2() {
		System.out.println("m2 method called");
	}

	@Override
	public void m3() {
		System.out.println("m3 method called");
	}

	@Override
	public void m4() {
		System.out.println("m4 method called");
	}
	
}
public class InterfaceExample {
	public static void main(String[] args) {
		Test test=new Test();
		System.out.println(test.a);
		test.m1();
		test.m2();
		test.m3();
		test.m4();
	}

}
