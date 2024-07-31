package com.mycompany.ch04.tr;

public class For1tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2단 부터 출력 되는 구구단 프로그램을 출력하시요
		// 각 단계 마다 구분선을 넣어 주세요.
		// 2 * 1 = 2

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			if (i != 9) {
				System.out.println("---------");
			}
		}

	}

}
