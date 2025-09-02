package com.msd.java8;

class TestNew{
	public void name(String name) {
		System.out.println("Name----->>"+name);
	}
	
	public int sum(int a,int b) {
		return a+b;
	}
	
}
interface TestName{
	String name(String name);
}
interface Sum{
	int sum(int a,int b);
}
public class LambdaExpressionTest {

	public static void main(String[] args) {
		TestNew t=new TestNew();
		int result=t.sum(20, 30);
		
		t.name("Mayank");
		System.out.println("Result--->>"+result);
		
		Sum sum=(int a,int b)->{
			return a+b;
		};
		
		Sum sum1=(a,b)->{
			return a+b;
		};
		
		Sum sum2=(a,b)->a+b;
		
		TestName testName= name->name;
		
		System.out.println("Sum--->>"+sum.sum(20, 50));
		System.out.println("Sum1--->>"+sum1.sum(20, 50));
		System.out.println("Sum2--->>"+sum2.sum(20, 50));
		System.out.println("testName--->>"+testName.name("Virat"));
	}

}
