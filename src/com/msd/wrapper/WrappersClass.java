package com.msd.wrapper;

public class WrappersClass {

	public static void main(String[] args) {
		Integer i=new Integer(100);
		System.out.println(i);
		
		Integer i1=new Integer("100");
		System.out.println(i1);
		System.out.println(i1.toString());
		System.out.println(i1.valueOf(10000));
		
		Integer i2=new Integer("ONE");
		System.out.println(i2);
	}

}
