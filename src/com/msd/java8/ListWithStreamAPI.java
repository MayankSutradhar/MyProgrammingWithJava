package com.msd.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListWithStreamAPI {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(4,3,7,6,8,9);
		//int sum=0;
		nums.forEach(n->System.out.println(n));
		
		Stream<Integer> s1=nums.stream();
		Stream<Integer> s2=s1.filter(n->n%2==0);
		Stream<Integer> s3=s2.map(n->n*2);
		int result=s3.reduce(0, (i,j)->i+j);
		System.out.println("result--"+result);
		
		int result1=nums.stream()
					.filter(n->n%2==0)
					.map(n->n*2)
					.reduce(0,(i,j)->i+j);
		
		System.out.println("result2--"+result1);
		
//		for(int i=0;i<nums.size();i++) {
//			System.out.println(nums.get(i));
//		}
		
//		for(int n:nums) {
//			System.out.println(n);
//		}
		
//		for(int n:nums) {
//			if(n%2==0) {
//				n=n*2;
//				sum=sum+n;
//				System.out.println(n);
//			}
//			
//		}
//		
//		System.out.println("Sum--"+sum);
	}

}
