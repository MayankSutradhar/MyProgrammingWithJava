package com.msd.multithreading;

class ThreadTest extends Thread{
	@Override
	public void run() {
		System.out.println("thread is running");
		System.out.println("Maximum :" + Thread.MAX_PRIORITY);
		System.out.println("Minimum :" + Thread.MIN_PRIORITY);
		System.out.println("Normal :" + Thread.NORM_PRIORITY);
		System.out.println("Thread Id :"+Thread.currentThread().getId());
		System.out.println("Thread Name :"+Thread.currentThread().getName());
		System.out.println("IsAlive :"+Thread.currentThread().isAlive());
		System.out.println("Count :"+Thread.activeCount());
		System.out.println("Priority :"+Thread.currentThread().getPriority());
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		ThreadTest t=new ThreadTest();
		t.start();
		
		System.out.println("________________________________________________________________________");
		ThreadTest t1=new ThreadTest();
		t1.start();
		
		System.out.println("________________________________________________________________________");
		ThreadTest t2=new ThreadTest();
		t2.start();
	}

}
