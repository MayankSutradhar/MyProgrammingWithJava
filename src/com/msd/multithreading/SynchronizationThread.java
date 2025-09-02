package com.msd.multithreading;

class Counter
{
	int count=0;
	public synchronized void increment() {
		count++;
	}
}
public class SynchronizationThread {

	public static void main(String[] args) {
		Counter c=new Counter();
		Runnable obj=()->{
			for (int i = 1; i <= 10000; i++) {
				c.increment();
			}
		};
		
		Runnable obj2=()->{
			for (int i = 1; i <= 10000; i++) {
				c.increment();
			}
		};
		
		Thread t=new Thread(obj);
		Thread t2=new Thread(obj2);
		
		t.start();
		t2.start();
		
		try {
			t.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(c.count);
	}
}
