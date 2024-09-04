package com.mycompany.ch06.array;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ***************************************

		// list를 이용한 배열 선언

		// 7칸의 배열에 데이터를 입력상태
		int[] scorechemistry = { 100, 99, 98, 97, 96, 95, 94 };

		int scorechemistry2[] = { 100, 99, 98, 97, 96, 95, 94 };

//		System.out.println("scorechemistry[0]: " + scorechemistry[0]);
//		System.out.println("scorechemistry[6]: " + scorechemistry[6]);

		for (int j = 0; j < scorechemistry.length; j++) {
			System.out.println("scorechemistry[" + j + "]: " + scorechemistry[j]);
		}
		System.out.println("scorechemistry.length: " + scorechemistry.length);

//		for (int i = 0; i <= 6; i++) {
//			System.out.println("scorechemistry[" + i + "]: " + scorechemistry[i]);
//		}

		// 7칸의 배열만 만든상태
		int[] scorechemistry3 = new int[7];

		int scorechemistry4[] = new int[7];

		scorechemistry3[0] = 100;
		scorechemistry3[1] = 99;
		scorechemistry3[2] = 98;
		scorechemistry3[3] = 97;
		scorechemistry3[4] = 96;
		scorechemistry3[5] = 95;
		scorechemistry3[6] = 94;

		System.out.println("scorechemistry3.length: " + scorechemistry3.length);

		for (int j = 0; j < scorechemistry3.length; j++) {
			System.out.println("scorechemistry3[" + j + "]: " + scorechemistry3[j]);
		}

		System.out.println("?---------------------");

		// 향상된 for 문

		int i = 0;
		for (int a : scorechemistry3) { // int a = scorechemistry3[0];
			System.out.println("scorechemistry3[" + i + "]: " + a);
			i++;
		}

	}
}
