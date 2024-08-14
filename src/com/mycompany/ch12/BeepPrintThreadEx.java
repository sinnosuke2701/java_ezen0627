package com.mycompany.ch12;

import java.awt.Toolkit;

public class BeepPrintThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//방법 1 
//		
//		Thread thread = new Thread();
//		
//		thread.start();
		
		//방법 2 
		Runnable runnable = new BeepRunnable();
		Thread thread = new Thread(runnable);
		
		thread.start();
		
		
		
		for(int i=0; i<=5; i++) {
			System.out.println("Tony");
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
		
	}

