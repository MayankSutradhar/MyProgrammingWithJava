package com.msd.string;

class Emp{
	int id;
	String name;
	public Emp(int id,String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name;
	}
}
public class StringEx {
	public static void swap(int a,int b) {
		System.out.println("Before swap : a = "+a+",b = "+b);
		int c = 0;
		c=a;
		a=b;
		b=c;
		System.out.println("After swap : a = "+a+",b = "+b);
	}
	public static void main(String[] args) {
		String s = "mayank";
		s.concat("sutradhar");
		System.out.println(s);
		
		String s1=new String("mayank");
		s1.concat("sutradhar");
		System.out.println(s1);
		
		//s1=s;
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		
		StringBuffer sb=new StringBuffer("mayank");
		sb.append("sutradhar");
		System.out.println(sb);
		
		System.out.println(s.toString());
		System.out.println(s1.toString());
		System.out.println(sb.toString());
		
		Emp e=new Emp(1, "mayank");
		System.out.println(e);
		System.out.println(e.toString());
		
		String str="virat";
		StringBuffer sb1=new StringBuffer(str);
		System.out.println(sb1);
		String st1=new String(sb1);
		System.out.println(st1);
		swap(10, 20);
	}

}
