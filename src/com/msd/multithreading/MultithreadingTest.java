package com.msd.multithreading;

class MyThread2 implements Runnable
{

	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Thread1-"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class MultithreadingTest {

	public static void main(String[] args) {
		Runnable obj=new MyThread2() {
			public void run() {
				for(int i=0;i<=5;i++) {
					System.out.println("Thread2-"+i);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			
			}
		};
		
		Runnable obj1=new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<=5;i++) {
					System.out.println("Annonymous Thread-"+i);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		Thread th=new Thread(obj);
		th.start();
		
		Thread th1=new Thread(obj1);
		th1.start();
	}

}
