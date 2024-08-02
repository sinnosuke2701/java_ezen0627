package com.mycompany.ch05;

public class Function4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정수
		// 100 이내의 자연수에서 선택된 수만큼 합산

		int result = sum(10);
		System.out.println(result);
	}

	public static int sum(int a) {
		int num = 0;
		if (a >= 1 && a <= 100) {
			for (int i = 1; i <= a; i++) {
				num += i;
			}
		} else {
//			by pass
		}
		return num;
	}

}
