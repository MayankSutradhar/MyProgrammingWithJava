package com.msd.multithreading;

class HookThread extends Thread{
	@Override
	public void run() {
		System.out.println("Hook Thread Running");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class HookThreadDemo {

	public static void main(String[] args) {
		HookThread t=new HookThread();
		Runtime r=Runtime.getRuntime();
		r.addShutdownHook(t);
		t.start();
		
		for(int i=0;i<10;i++) {
			try {
				System.out.println("Main thread running");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i==5) {
				System.exit(0);
			}
		}
	}

}
