package com.msd.arrays;
class A{
	
}
class Emp{
	int eid;
	String name;
	public Emp(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	
}
public class ArraysTest {

	public static void main(String[] args) {
		int a[]=new int[5];
		for(int aa:a) {
			System.out.println(aa);
		}
		
		boolean b[]=new boolean[3];
		for(boolean bb:b) {
			System.out.println(bb);
		}
		
		A[] a1=new A[2];
		for(A aa:a1) {
			System.out.println(aa);
		}
		
		Emp e1=new Emp(111, "Mayank");
		Emp e2=new Emp(222, "Sachin");
		Emp e3=new Emp(333, "Virat");
		Emp[] emp=new Emp[5];
		emp[0]=e1;
		emp[1]=e2;
		emp[2]=e3;

		for(Object o:emp) 
		{
			if(o instanceof Emp) {
				Emp e=(Emp) o;
				System.out.println(e.eid+","+e.name); 
			}
			if(o==null) {
				System.out.println(o);
			}
	
		}
		 
		/*
		 * for(Emp emp1:emp) { System.out.println(emp1.eid+","+emp1.name); }
		 */
		
		
	}

}
