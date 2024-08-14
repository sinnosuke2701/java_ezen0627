package com.mycompany.ch12;

import java.awt.Toolkit;

public class BeepEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		//대문자에 오류발생시 ctrl + shift + o 를 누르면 import 생김
		//오류나면 module-info 에 들어가서 하단 코드 입력 
		//requires java.desktop;
		//requires java.sql;
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);//오류 발생 F2 ㅇㅇ...
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
