package com.msd.multithreading;

public class MultithreadingUsingLambdaExp {

	public static void main(String[] args) {
		Runnable obj = ()-> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Lambda Exp Thread1-" + i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Runnable obj1 = () ->{
			for (int i = 0; i <= 5; i++) {
				System.out.println("Lambda Exp Thread2-" + i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Runnable obj2=() -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Lambda Exp Thread3-" + i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread th = new Thread(obj);
		th.start();

		Thread th1 = new Thread(obj1);
		th1.start();
		
		Thread th2 = new Thread(obj2);
		th2.start();
	}

}
