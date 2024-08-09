package com.mycompany.ch07.first.tr;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		
		System.out.println(car.age);
		System.out.println(car.name);
		System.out.println(car.height);
		System.out.println(car.dog);
		System.out.println(car.nickname);
		
		System.out.println("-------------------");
		
		car.shake();
		car.run();
		
	}

}
