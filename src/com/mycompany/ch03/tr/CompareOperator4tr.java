package com.mycompany.ch03.tr;

public class CompareOperator4tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//비교 연산자 (==, !=, < ,<= ,> ,>=)
		
		int a = 15;
		int b = 3;
		
		boolean result1 = (a == b); //false
		System.out.println("result1 : " + result1);
		
		boolean result2 = (a != b); //true
		System.out.println("result2 : " + result2);
		
		boolean result3 = (a < b); //false
		System.out.println("result3 : " + result3);
		
		boolean result4 = (a <= b); //false
		System.out.println("result4 : " + result4);
		
		boolean result5 = (a > b); //true
		System.out.println("result5 : " + result5);
		
		boolean result6 = (a >= b); //true
		System.out.println("result6 : " + result6);
	}

}
