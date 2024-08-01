package com.mycompany.ch04.tr;

public class For3tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 10*5 별 찍기
		// **********

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("----------------");

		// 2. 1,10 번째 별 찍기
		// **********
		// * *
		// * *
		// * *
		// **********

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i == 1 || i == 5) {
					System.out.print("*");
				} else {
					if (j == 1 || j == 10) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
		}
		System.out.println("----------------");
		// 3.
		// 1
		// 12
		// ...
		// 123456789
		// 1 3 5 7 9 0

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				if (i == 10) {
					if (j % 2 == 1) {
						System.out.print(j);
					} else if (j == 10) {
						System.out.println("0");
					} else {
						System.out.print(" ");
					}
				} else {
					System.out.print(j);
				}
			}
			System.out.println("");
		}
	}

}
