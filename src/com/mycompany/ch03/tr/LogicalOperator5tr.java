package com.mycompany.ch03.tr;

public class LogicalOperator5tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//논리 연산자(&, &&, |, ||, ^)
		//^ : 베타적 논리합 : 연산 참 참 폴스, 폴스 폴스 폴스, 참 폴스 참, 폴스 참 참
		int a = 95;
		
		if (a >= 80 && a < 100) { // 참 참 참
			System.out.println("&& : true");
		}
		
		if (a > 90 & a <= 95) { //참 참 참
			System.out.println("& : true");
		}
		
		if (a >96 || a <100) { // 거짓 참 참
			System.out.println("|| : true");
		}
		
		if (a >90 | a <50) { // 참 거짓 참
			System.out.println("|| : true");
		}
		
		if (a >=80 ^ a<= 90) { //참 거짓 참
			System.out.println("^ : true");
		}
	}

}
