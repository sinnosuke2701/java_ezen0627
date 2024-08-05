package com.mycompany.ch05.tr;

public class Function2tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//짝수인지 홀수 인지 구별 하는 함수
		String result2 = sum(2);
		System.out.println(result2);
	}
	public static String sum(int a) {
		int sum = a;
		String result;
		if(sum % 2 == 0) {
			result = "짝수";
		} else {
			result = "홀수";
		}
		return result;
	}
}
