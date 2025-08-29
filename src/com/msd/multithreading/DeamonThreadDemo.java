package com.msd.multithreading;

class DeamonThread extends Thread{
	@Override
	public void run() {
		System.out.println("Deamon Thread Running");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class DeamonThreadDemo {

	public static void main(String[] args) {
		DeamonThread t=new DeamonThread();
		t.setDaemon(true);
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
