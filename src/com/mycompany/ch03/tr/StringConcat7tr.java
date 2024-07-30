package com.mycompany.ch03.tr;

public class StringConcat7tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문자열 연산자 (+)
		
		String string1 = "sinnosuke";
		String string2 = " 7337";
		String string3 = "10";
		
		String string4 = string1 + string2;
			System.out.println("string4 : " + string4);
			System.out.println("짱구의 숫자는 "  + string3);
			
		int a = 1;
		String string5 = string1 + a ;
			System.out.println("string5 : " + string5);
			
		String string6 = string3 + a;
		String string7 = string2 + a;
			System.out.println("string6 : " + string6);
			System.out.println("string7 : " + string7);
	}

}
