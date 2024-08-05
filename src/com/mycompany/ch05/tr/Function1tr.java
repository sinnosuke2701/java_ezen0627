package com.mycompany.ch05.tr;

public class Function1tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a = 5;
//		int b = 10;
		
		int result = sum(1,2);
		System.out.println(result);
		
		say();
		
		String happy = Function1tr.good();
		System.out.println(happy);
		
	}
	
	public static int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}
	public static void say() {
		System.out.println("nice");
	}
	public static String good() {
		
		return "good";
	}
}
