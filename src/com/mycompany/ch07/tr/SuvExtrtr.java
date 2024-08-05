package com.mycompany.ch07.tr;

public class SuvExtrtr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Suvtrtr suvtrtr = new Suvtrtr();
		
		System.out.println(suvtrtr.engine);
		System.out.println(suvtrtr.name);
		System.out.println(suvtrtr.company);
		System.out.println(suvtrtr.color);
		System.out.println(suvtrtr.price);
		
		suvtrtr.go();
		suvtrtr.go();

		suvtrtr.back();
		suvtrtr.back();
		
		System.out.println("----------------------");
		
		int result = suvtrtr.sum(8,2);
		System.out.println(result);
		
		System.out.println("----------------------");
		
		//인풋 : 문자열(사장,부장,과장,대리,사원,나)
		//직급에 따른 연봉을 알려 주는 함수
		
		
		
	}

}
