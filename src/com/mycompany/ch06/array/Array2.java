package com.mycompany.ch06.array;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ***********************************

		// kor,eng,math 과목별 총합과 평균
		// 사람별 총합과 평균

		String[] name = { "장동건", "오태식", "마동석", "마장동", "오해영" };

		int[][] score = { { 99, 88, 55 }, { 55, 77, 66 }, { 55, 55, 45 }, { 55, 65, 44 }, { 55, 55, 77 } };

//		score[0][0] = 100;

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.println("score[" + i + "][" + j + "]: " + score[i][j]);
			}
		}

	}

}
