package com.msd.innerclass;

interface TestIt{
	void m1();
}
class Test{
	void m1() {}
	void m2() {}
}
abstract class Test1{
	abstract void m1();
}
public class TestClient {
	Test t=new Test() {
		   void m1() {
			   System.out.println("m1 method");
			   System.out.println(t.getClass().getName());
		   }
		   void m2() {
			  System.out.println("m2 method"); 
		   }
	};
	
	TestIt it=new TestIt() {
		
		@Override
		public void m1() {
			System.out.println("m1 method impl");
			System.out.println(it.getClass().getName());
		}
	};
	
	TestIt test=new TestIt() {
		
		@Override
		public void m1() {
			System.out.println("m1 method of abstract class");
			System.out.println(test.getClass().getName());
		}
	};
	public static void main(String[] args) {
		TestClient tt=new TestClient();
		tt.t.m1();
		tt.t.m2();
		tt.it.m1();
		tt.test.m1();
	}
}
