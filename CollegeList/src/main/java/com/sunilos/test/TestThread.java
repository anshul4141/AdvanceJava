package com.sunilos.test;

public class TestThread  extends Thread {
	
private String name;
	
	public TestThread() {
		
		
	}
	public TestThread(String n) {
		name = n;
		
	}
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
	} public static void main(String[] args) {
		
		TestThread t = new TestThread("Anshul");
		
		TestThread t1 = new TestThread("Naman");
		
		TestThread t2 = new TestThread("Suresh");
		
		t.start();
		t1.start();
		t2.start();
		
			}
	
	}


