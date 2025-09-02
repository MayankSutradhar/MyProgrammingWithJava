package com.msd.java8;

import java.util.ArrayList;

/*class var{
	//'var' is not a valid type name
}*/
public class LocalVariableTypeInference {
	//var p=20;//not allowed
	public static void main(String[] args) {
		int a = 0;
		//var a2;//error cannot use without initializer
		var a2=20;
		System.out.println(a+":"+a2);
		
		String var="mayank";//allowed
		var n2="mayank";
		System.out.println(var+":"+n2);
		
		int arr[]=new int[20];
		var arr2=new int[20];
		var list=new ArrayList<Integer>();
		//var arr3[]=new int[20];//error 'var' is not allowed as an element type of an array
		System.out.println(arr.length+":"+arr2.length);

	}

}
