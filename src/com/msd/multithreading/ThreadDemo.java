package com.msd.multithreading;

class MyThread extends Thread {
	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("User thread is running - " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		 //m1();m2();m3();
	}

	public void m1() {
		System.out.println("method called 1");
	}

	public void m2() {
		System.out.println("method called 2");
	}

	public void m3() {
		System.out.println("method called 3");
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		MyThread t1 = new MyThread();
		
		try {
			t.join();
			
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		t.interrupted();
		t1.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread is running - " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}

}
