package com.msd.demo;

public class Hello {

	public static void main(String[] args) {
		//System.out.println("Hello World...");
		try {
			int a = 20;
			a=a/0;
			System.out.println("try block");
			System.out.println(a);
		}
		/*
		 * catch (ArithmeticException e1) { System.out.println(e1);
		 * System.out.println("catch block"); }
		 */
		catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			System.out.println("String : "+e.toString());
			System.out.println("Msg : "+e.getMessage());
			System.out.println("catch block 1");
		}finally {
			System.out.println("finaly block");
		}
	}

}