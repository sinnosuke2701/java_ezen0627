package com.mycompany.ch07;

public class SuvExtr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Suvtr suv = new Suvtr();
		
		int result = suv.sum(130,21);
		
		System.out.println(suv.company);
		System.out.println(suv.color);
		System.out.println(suv.name);
		System.out.println(suv.engine);
		System.out.println(suv.price);

		
		System.out.println("-------------------");
		
		suv.auto();
		suv.go();
		
		System.out.println("-------------------");
		
		System.out.println(result);	
		
		
		//인풋 : 문자열(사장,부장,과장,대리,사원,나)
		//직급에 따른 연봉을 알려 주는 함수
		
		String position = suv.member("부장");
		System.out.println(position);
		
//		System.out.println(suv.member("대리"));
		

	}

} 
