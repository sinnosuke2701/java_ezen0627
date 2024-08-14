package com.mycompany.ch12;

import java.awt.Toolkit;

public class BeepPrintEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
//		for(int i=0; i<5; i++) {
//			toolkit.beep();
//			try {
//				Thread.sleep(500);//오류 발생 F2 ㅇㅇ...
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		for(int i=0; i<=5; i++) {
			System.out.println("12");
			try {
				Thread.sleep(500);//오류 발생 F2 ㅇㅇ...
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
