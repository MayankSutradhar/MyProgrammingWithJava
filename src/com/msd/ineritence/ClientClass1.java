package com.msd.ineritence;

import com.msd.messsage.Message;

public class ClientClass1 implements Message {

	public static void main(String[] args) {
		ClientClass1 c=new ClientClass1();
		c.morn();
		c.even();
		c.gn();
	}

	@Override
	public void morn() {
		System.out.println("message from client is good morning");
	}

	@Override
	public void even() {
		System.out.println("message from client is good evening");
	}

	@Override
	public void gn() {
		System.out.println("message from client is good night");
	}

}
