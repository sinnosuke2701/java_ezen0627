package com.mycompany.ch07.third;

public class CalculatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calculator = new Calculator();//객체
		
		System.out.println("calculator.pi: " + calculator.pi);
		 
		add(1,2);
		
		int result = Calculator.addStatic(1, 2);
		System.out.println(result);
	}

	public static int add(int a, int b) {
		return a+b;
	}
	
	public int minus(int a, int b) {
		int result = a - b ;
		return a- b;
	}
	
}
