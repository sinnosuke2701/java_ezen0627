package com.mycompany.ch04;

public class For1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=3; i++) {
			System.out.println("i : " + i);
		}
		System.out.println("--------------------");
		for(int i=1; i<=3; i++) {
			System.out.println("i : " + i);
		}
		System.out.println("--------------------");
		
		//2단 부터 출력 되는 구구단 프로그램을 출력하시요
		//각 단계 마다 구분선을 넣어 주세요.
		//2 * 1 = 2
		
//		for(int i=1; i<=9; i++) {
//			System.out.println(2*i);
//		}
//		System.out.println("--------------------");
//		
//		for(int i=1; i<=9; i++) {
//			System.out.println(3*i);
//		}
//		System.out.println("--------------------");
//		
//		for(int i=1; i<=9; i++) {
//			System.out.println(4*i);
//		}
//		System.out.println("--------------------");
//		
//		for(int i=1; i<=9; i++) {
//			System.out.println(5*i);
//		}
//		System.out.println("--------------------");
//		
//		for(int i=1; i<=9; i++) {
//			System.out.println(6*i);
//		}
//		System.out.println("--------------------");
//		
//		for(int i=1; i<=9; i++) {
//			System.out.println(7*i);
//		}
//		System.out.println("--------------------");
//		
//		for(int i=1; i<=9; i++) {
//			System.out.println(8*i);
//		}
//		System.out.println("--------------------");
//		
//		for(int i=1; i<=9; i++) {
//			System.out.println(9*i);
//		}
//		System.out.println("--------------------");
		
		
		
		
		
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			if(i != 9) {
				System.out.println("--------------------");
			}
		}
		
			
	}

}
