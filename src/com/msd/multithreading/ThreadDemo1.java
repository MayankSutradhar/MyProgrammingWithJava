package com.msd.multithreading;

class MyThread1 extends Thread {
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

public class ThreadDemo1 {

	public static void main(String[] args) {
		MyThread1 t = new MyThread1();
		t.start();
		System.out.println("Thread Id :" + t.getId());
		System.out.println("Thread Name :" + t.getName());
		t.setName("mayank");
		System.out.println("Thread Name :" + t.getName());
		System.out.println("Current Thread Id :" + t.currentThread().getId());
		System.out.println("Current Thread Name :" + t.currentThread().getName());
		t.currentThread().setName("MAIN_THREAD");
		System.out.println("Current Thread Name :" + t.currentThread().getName());
		System.out.println(t.isAlive());
		System.out.println(t.activeCount());
		t.setPriority(2);
		System.out.println(t.getPriority());
		System.out.println(t.currentThread().getPriority());

		System.out.println("----------------------------------------------------------------------------------------------------");
		MyThread1 t1=new MyThread1();
		t1.start();
		System.out.println("Thread Id :" + t1.getId());
		System.out.println("Thread Name :" + t1.getName());
		t1.setName("mayank");
		System.out.println("Thread Name :" + t1.getName());
		System.out.println("Current Thread Id :" + t1.currentThread().getId());
		System.out.println("Current Thread Name :" + t1.currentThread().getName());
		//t1.currentThread().setName("MAIN_THREAD");
		System.out.println("Current Thread Name :" + t1.currentThread().getName());
		System.out.println(t1.isAlive());
		System.out.println(t1.activeCount());
		t1.setPriority(2);
		System.out.println(t1.getPriority());
		System.out.println(t1.currentThread().getPriority());
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		MyThread1 t2=new MyThread1();
		t2.start();
	}

}
