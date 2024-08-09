package com.mycompany.ch07.first.tr;

public class Suv {
	
	int wheels = 4;
	String name = "gv80";
	String company = "현대";
	String color = "흰색";
	
	void go() {
		System.out.println("앞으로 간다");
	}
	
	void back() {
		System.out.println("뒤로 간다");
	}

	int add(int a , int b) {
		int sum = a + b ;
		return sum;
	}
	
	//인풋 : 문자열(사장,부장,과장,대리,사원,나)
	//직급에 따른 연봉을 알려 주는 함수
	
	public String money (String position) {
		String money = "";
		
		switch(position) {
		case "사장":{
			money = "사장의 연봉은 5000 입니다.";
			break;
		}
		case "부장":{
			money = "부장의 연봉은 6000 입니다.";
			break;
		}
		case "과장":{
			money = "과장의 연봉은 7000 입니다.";
			break;
		}
		case "대리":{
			money = "대리의 연봉은 8000 입니다.";
			break;
		}
		case "사원":{
			money = "사원의 연봉은 9000 입니다.";
			break;
		}
		default :
			money = "나의 연봉은 1억 입니다";
			break;
		}
		return money;
	}
	
}
