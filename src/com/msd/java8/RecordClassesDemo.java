package com.msd.java8;

import java.util.Objects;

//class Person
//{
//	int id;
//	String name;
//	public Person(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
//	@Override
//	public String toString() {
//		return "Person [id=" + id + ", name=" + name + "]";
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, name);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Person other = (Person) obj;
//		return id == other.id && Objects.equals(name, other.name);
//	}	
//}
record Person(int id, String name)
{
	public Person//canonical constructor
	{
		if(id==0)
		{
			 throw new IllegalArgumentException("Id cannot be zero.");
		}
	}
}

record Product(String name,double price)
{
	
	public Product //canonical constructor
	{
		if(price<0)
		{
			 throw new IllegalArgumentException("Price cannot be negative");
		}
	}
}
public class RecordClassesDemo {
	public static void main(String[] args) {
		Person p1=new Person(1, "Mayank");
		Person p2=new Person(1, "Mayank");
		
		System.out.println(p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode()+":"+p2.hashCode());
		
		System.out.println("---------------------------------");
		Product pro1=new Product("Sony", 25000);
		Product pro2=new Product("Sony", 25000);
		
		System.out.println(pro1);
		System.out.println(pro1.equals(pro2));
		System.out.println(pro1.hashCode()+":"+pro2.hashCode());
		
		Product pro3=new Product("Sony", -5);
		System.out.println(pro3);
	}

}
