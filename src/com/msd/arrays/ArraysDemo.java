package com.msd.arrays;
class Test1{
	int[] m1(){
		System.out.println("m1 method");
		int a[]= {10,20,30,40};
		return a;
	}
	
	void m2(double[] d) {
		System.out.println("m2 method");
		for(double dd:d) {
			System.out.println(dd);
		}
	}
}
public class ArraysDemo {

	public static void main(String[] args) {
		int a[]= new int[5];
		System.out.println(a.length);
		
		String str="mayank";
		System.out.println(str.length());
		
		Test1 t=new Test1();
		int[] x=t.m1();
		for(int xx:x) {
			System.out.println(xx);
		}
		
		double[] d= {2.2,3.3,4.4};
		t.m2(d);
	}
}
