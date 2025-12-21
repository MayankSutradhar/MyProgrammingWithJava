package com.msd.java8;

sealed class A permits B,C
{
	
}
final class B extends A
{
	
}
non-sealed class C extends A
{
	
}
class D extends C
{
	
}
public class SealedClassesDemo {

	public static void main(String[] args) {
		
	}

}
