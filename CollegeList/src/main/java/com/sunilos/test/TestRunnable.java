package com.sunilos.test;

public class TestRunnable extends Thread implements Runnable {

	private String name;

	public TestRunnable() {

	}

	public TestRunnable(String n) {

		name = n;

	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + name);
		}

	}

	public static void main(String[] args) {

		TestRunnable tr = new TestRunnable("Pratik");
		tr.start();
		TestRunnable tr1 = new TestRunnable("Arun");
		tr1.start();
		TestRunnable tr2 = new TestRunnable("Araynt");
		tr2.start();

	}

}
