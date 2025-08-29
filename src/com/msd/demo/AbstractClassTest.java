package com.msd.demo;


abstract class Calculate{
	abstract int multiply(int a,int b);
}
public class AbstractClassTest {

	public static void main(String[] args) {
		int result=new Calculate() {
			
			@Override
			int multiply(int a, int b) {
				return a*b;
			}
		}.multiply(20, 50);
		
		System.out.println("Result="+result);
	}

}
