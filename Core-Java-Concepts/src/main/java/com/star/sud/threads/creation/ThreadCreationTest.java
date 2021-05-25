package com.star.sud.threads.creation;

public class ThreadCreationTest {

	public static void main(String[] args) {

		// Using class
		ThreadWithClass th = new ThreadWithClass();
		th.start();

		// Using Interface
		ThreadWithInt thI = new ThreadWithInt();
		Thread thDefault = new Thread(thI);
		thDefault.start();

	}

}
