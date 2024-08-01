package com.mycompany.ch04.tr;

public class If5tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 세 수의 최소값과 최대값을 출력하시요

		int a = 5;
		int b = 2;
		int c = 2;

		if (a != b && a != c && b != c) {
			if (a > b && a > c) {
				System.out.println("최대값은: " + a + "입니다.");
			} else if (b > a && b > c) {
				System.out.println("최대값은: " + b + "입니다.");
			} else {
				System.out.println("최대값은: " + c + "입니다.");
			}
			if (a < b && a < c) {
				System.out.println("최소값은: " + a + "입니다.");
			} else if (b < a && b < c) {
				System.out.println("최소값은: " + b + "입니다.");
			} else if (c < a && c < b) {
				System.out.println("최소값은: " + c + "입니다.");
			}

		} else {
			System.out.println("2개 이상이 중복입니다. 수정해주세요.");
		}

	}

}
