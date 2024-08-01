package com.mycompany.ch04.tr;

public class While1tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1부터 10까지 더하는 프로그램 작성
		
		int sum = 0;
		int a = 1;
		
		while(a <= 10) {
			sum += a;
			a++;
		}
		System.out.println("sum: " + sum);
		
	}

}
