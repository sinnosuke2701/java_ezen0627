package com.mycompany.ch07.first.tr;

public class SuvEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Suv suv = new Suv();
		
		System.out.println(suv.name);
		System.out.println(suv.wheels);
		System.out.println(suv.color);
		System.out.println(suv.company);
		
		System.out.println("-------------");
		
		suv.go();
		suv.back();
		
		System.out.println("-------------");
		
		int result = suv.add(8,2);
		System.out.println(result);
		
		System.out.println("-------------");
		
		String money = suv.money("나");
		System.out.println(money);
		
	}

}
