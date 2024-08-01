package com.mycompany.ch05Function;

public class Function2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//짝수인지 홀수 인지 구별 하는 함수
		
		String result = sin(7);
		System.out.println(result);
		
		String result3 = boo(4);
		System.out.println(result3);
	}
	
	public static String sin(int a) {
		int sin = a;
		String result2;
		if(sin % 2==0) {
			result2 = "짝수";
		} else {
			result2 = "홀수";
		}
		
		return result2;
	}
	
	
	public static String boo(int b) {
		int boo = b;
		String jjang;
		if(boo % 2 == 0) {
			jjang = "짝수";
		} else {
			jjang = "홀수";
		}
		
		return jjang;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
