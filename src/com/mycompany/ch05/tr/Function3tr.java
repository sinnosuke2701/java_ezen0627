package com.mycompany.ch05.tr;

public class Function3tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 세 수를 주면 최대값을 반환하는 함수
		
		int result = max(1,4,3);
		System.out.println(result);
		
	}
	
	public static int max(int a , int b , int c) {
		int max = 0;
		if(a != 0 && b != 0 && c != 0) {
			if(a > b && a > c) {
				max = a;
			} else if (b > a && b > c) {
				max = b;
			} else if (c > a && c > b) {
				max = c;
			} else {
				
			}
		}
		return max;
	}
	
}
