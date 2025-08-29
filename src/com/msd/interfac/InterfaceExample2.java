package com.msd.interfac;

interface InterfaceNew{
	int a = 100;
	void m1();
	void m2();
	void m3();
}
interface Interface2 extends InterfaceNew{
	void m4();
}
interface Interface3 extends Interface2{
	void m5();
}
class TestIt implements Interface3{

	@Override
	public void m4() {
		System.out.println("method m4 called");
	}

	@Override
	public void m1() {
		System.out.println("method m1 called");
	}

	@Override
	public void m2() {
		System.out.println("method m2 called");
	}

	@Override
	public void m3() {
		System.out.println("method m3 called");
	}

	@Override
	public void m5() {
		System.out.println("method m5 called");
	}
	
}
public class InterfaceExample2 {
	public static void main(String[] args) {
		TestIt test=new TestIt();
		System.out.println(test.a);
		test.m1();
		test.m2();
		test.m3();
		test.m4();
		test.m5();
	}

}

