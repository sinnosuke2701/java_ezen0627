package com.mycompany.ch07;

public class Suvtr {

	int engine = 8;
	String name = "펠리세이드";
	String color = "흰색";
	String company = "현대";
	String price = "200,000,000,000,000 원 원 원원우너우너우너우너우너";

	void auto() {
		System.out.println("오토");
	}

	void go() {
		System.out.println("앞으로 간다잉");
	}

	int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public String member(String position) {
	    String money;
	    switch (position) {
	        case "사원":
	        	money = position + "의 연봉은 5,000 입니다.";
	            break;
	        case "주임":
	        	money = position + "의 연봉은 6,000 입니다.";
	            break;
	        case "대리":
	        	money = position + "의 연봉은 7,000 입니다.";
	            break;
	        case "과장":
	        	money = position + "의 연봉은 8,000 입니다.";
	            break;
	        case "부장":
	        	money = position + "의 연봉은 9,000 입니다.";
	            break;
	        default:
	        	money = position + "의 연봉은 10,000 입니다.";
	            break;
	    }
	    return money;
	}

}
