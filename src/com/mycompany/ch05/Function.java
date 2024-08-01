package com.mycompany.ch05;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//public 리턴자료형 메소드형 (입력자료형1 입력변수1, 입력자료형2 입력변수2, ...)	
	//return 리턴값; //리턴자료형이 void 인 경우네는 return 문이 필요없다.
	
		
	//***************************	
		 
	//void = return 값이 없을 때 사용	
//		int a = 5;
//		int b = 10;
		 
		int result = sum(5,10);
		int result2 = sum(8,46);
		System.out.println(result);
		System.out.println(result2);
		
		say();
		
		sayhello();
	}
	
	public static int sum (int a , int b) {
		int sum = a + b ;
//		System.out.println("sum: " + sum);
		return sum;
		
	}
	
	public static void say() {
		System.out.println("HI");
	}
	public static String sayhello() {
		return "Hello";
	}
	
	public static void sum2(int a ,int b) {
		int sum = a + b ;
		System.out.println(a + "+" + b + " = " + sum);
	}
	
}
