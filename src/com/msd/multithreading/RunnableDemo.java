package com.msd.multithreading;

class MyRunnable implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("User Thread - "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class RunnableDemo {

	public static void main(String[] args) {
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
	}

}
