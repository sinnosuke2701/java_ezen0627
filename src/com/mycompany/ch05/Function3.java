package com.mycompany.ch05;

public class Function3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 세 수를 주면 최대값을 반환하는 함수

//		int result = max(1, 7, 5);
//		System.out.println("최대값은: " + result);
//		
//		int result2 = free(23, 23 , 16);
//		System.out.println("최대값은: " + result2);
		
		free(1, 3, 3);
	}

	public static int max(int a, int b, int c) {
		int max = 0;
		if (a != b && a != c && b != c) {
			if (a > b && a > c) {
				max = a;
			} else if (b > a && b > c) {
				max = b;
			} else {
				max = c;
			}
		}
		return max;
	}

	
	
	
	
	public static void free(int d, int e, int f) {
		int free = 0;
		if (d != e && d != f && e != f) {
			if (d > e && d > f) {
				free = d;
				System.out.println(free);
			} else if (e > d && e > f) {
				free = e;
				System.out.println(free);
			} else{
				free = f;
				System.out.println(free);
			}
		} else {
			System.out.println("같은 값이 2개 이상 존재합니다. 다시 입력하세요.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static int free(int d, int e, int f) {
//		int free = 0;
//		if (d != e && d != f && e != f) {
//			if (d > e && d > f) {
//				free = d;
//			} else if (e > d && e > f) {
//				free = e;
//			} else if (f > d && f > e) {
//				free = f;
//			} else {
//				
//			}
//		}
//		return free;
//	}

}
