package com.msd.multithreading;

class A{
	synchronized static void msg(String str) {
		for(int i=0;i<5;i++) {
			System.out.println("Hi "+str);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class MyThreadDemo extends Thread{
	@Override
	public void run() {
		A.msg("Mayank");
	}
}
class MyThreadDemo1 extends Thread{
	@Override
	public void run() {
		A.msg("Sachin");
	}
}
class MyThreadDemo2 extends Thread{
	@Override
	public void run() {
		A.msg("Virat ");
	}
}
public class SynchronousClassDemo {
	public static void main(String[] args) {
		new MyThreadDemo().start();
		new MyThreadDemo1().start();
		new MyThreadDemo2().start();
	}

}
