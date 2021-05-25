package com.star.sud.threads.creation;

public class ThreadWithClass extends Thread {

	@Override
	public void run() {
		System.out.println("Executing thread from exteding thread class");
	}
	
}
