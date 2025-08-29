package com.msd.multithreading;
class MyThreadTest extends Thread{
	@Override
	public void run() {
		System.out.println("first approach to create thread.");
	}
}
class MyRunnableTest implements Runnable{
	@Override
	public void run() {
		System.out.println("second approach to create thread.");
	}
}
public class AnonymousClassDemo {

	public static void main(String[] args) {
		Thread t=new Thread() {
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("first thread");
				}
			}
		};
		
		Thread t1=new Thread() {
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("second thread");
				}
			}
		};
		t.start();
		t1.start();
		
		new Thread() {
			public void run() {
				System.out.println("first approach");
			};
		}.start();
		
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("second approach");
			}
		};
		new Thread(r).start();
		
		new MyThreadTest().start();
		new Thread(new MyRunnableTest()).start();
	}

}
