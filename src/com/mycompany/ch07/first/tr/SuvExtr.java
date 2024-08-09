package com.mycompany.ch07.first.tr;

public class SuvExtr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//인풋 : 문자열(사장,부장,과장,대리,사원,나)
		//직급에 따른 연봉을 알려 주는 함수
		
		Suvtr suvtr = new Suvtr();
		
		String money = suvtr.money("");
		System.out.println(money);
	}

}
