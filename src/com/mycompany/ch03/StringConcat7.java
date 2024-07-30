package com.mycompany.ch03;

public class StringConcat7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문자열 연산자 (+)
		
		String stringva1 = "sinnosuke ";
		String stringval2 = "2701";
		String stringval5 = "10";
		
		String stringval3 = stringva1 + stringval2;
			System.out.println("stringval3 : " + stringval3);
			System.out.println("신짱구는 " + stringval3);
		
		int a = 1;
		
			String stringval4 = stringva1 + a;
			System.out.println("stringval4 : " + stringval4);
		
		String stringval6 = stringval5 + a;
//		int stringval6 = Integer.parseInt(stringval5) + a
			System.out.println("stringval6 : " + stringval6);
		
	}

}
