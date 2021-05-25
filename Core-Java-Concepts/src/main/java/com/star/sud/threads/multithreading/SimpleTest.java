package com.star.sud.threads.multithreading;

public class SimpleTest {

	public static void main(String[] args) {

		Example01 ex01 = new Example01();
		ex01.start();

		Example02 ex02 = new Example02();
		Thread th = new Thread(ex02);
		th.start();

	}

}

class Example01 extends Thread {

	@Override
	public void run() {
		System.out.println("Executing thread from Thread class");
	}

}

class Example02 implements Runnable {

	@Override
	public void run() {
		System.out.println("Executing thread from Runnable Interface");
	}

}
