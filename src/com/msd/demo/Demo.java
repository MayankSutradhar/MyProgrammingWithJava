package com.msd.demo;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Hello");
		int a = 10;
		int b = 20;
		int c = a > b ? a++ : b++;
		System.out.println(a + "," + b + "," + c);
		int age = 0;
		age = age + 1;
		System.out.println("The age is " + age);
		String s = "t";
		s.concat("str");
		s.concat("_");
		System.out.println(s);
		String str = "Hello this is evagator";
		boolean var;
		var = str.startsWith("hello");
		System.out.println(var);
		// System.out.println("Result="+getValue());
		int x = 10;
		int y = 5;
		int result = (x > y) ? x++ : y++;
		System.out.println("Result--" + result + "," + x + "," + y);
	}

	private static int getValue() {
		return (true ? null : 1);
	}
}
