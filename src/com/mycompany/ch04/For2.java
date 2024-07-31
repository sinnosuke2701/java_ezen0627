package com.mycompany.ch04;

public class For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1부터 10까지 더하는 프로그램 작성
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i;
//			System.out.println(i + " : sum: " + sum);
		}
			System.out.println("sum: " + sum);
			
			System.out.println("-------------------------");
		//11~50까지 짝수의 합을 구하시요
			
		int num = 0;
		
		for(int i=11; i<=50 ; i++) {
			if (i % 2 == 0) {
				num += i;
			}
		}
			System.out.println("11~50 까지 짝수의 합은 " + num);
	}

}
