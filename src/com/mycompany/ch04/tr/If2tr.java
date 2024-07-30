package com.mycompany.ch04.tr;

public class If2tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//일반:1, 5% 할인적용
		//브론즈:2, 10% 할인적용
		//실버:3, 15% 할인적용
		//골드:4, 20% 할인적용
		//플레티넘:5, 47% 할인적용
		
		//정가가 32000원인 실버 등급의 할인가는 : 10200원 입니다.
		
		int grade = 3;
		int cost = 32000;
		
		if (grade == 1) {
			System.out.println("정가가 " + cost + "원인 실버등급의 할인가는 " + (int)(cost * 0.95) + "원 입니다.");
		} else if (grade == 2 ) {
			System.out.println("정가가 " + cost + "원인 브론즈등급의 할인가는 " + (int)(cost * 0.9) + "원 입니다.");
		} else if (grade == 3 ) {
			System.out.println("정가가 " + cost + "원인 실버등급의 할인가는 " + (int)(cost * 0.85) + "원 입니다.");
		} else if (grade == 4 ) {
			System.out.println("정가가 " + cost + "원인 골드등급의 할인가는 " + (int)(cost * 0.8) + "원 입니다.");
		} else{
			System.out.println("정가가 " + cost + "원인 플레티넘등급의 할인가는 " + (int)(cost * 0.53) + "원 입니다.");
		}
		
	}

}
