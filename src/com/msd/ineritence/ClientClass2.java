package com.msd.ineritence;

import com.msd.helper.Helper;

public class ClientClass2 extends Helper {

	public static void main(String[] args) {
		ClientClass2 c=new ClientClass2();
		c.morn();
		c.even();
		c.gn();
	}

	@Override
	public void morn() {
		System.out.println("message from helper is good morning");
	}

	@Override
	public void even() {
		System.out.println("message from helper is good evening");
	}

}
