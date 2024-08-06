package com.mycompany.ch07.first;

public class CarExtr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cartr cartr = new Cartr();
		
		System.out.println(cartr.engine);
		System.out.println(cartr.name);
		System.out.println(cartr.company);
		System.out.println(cartr.price);
		System.out.println(cartr.color);
		
		cartr.go();
		cartr.go();
		
		cartr.back();
		cartr.back();
		
	}

}
