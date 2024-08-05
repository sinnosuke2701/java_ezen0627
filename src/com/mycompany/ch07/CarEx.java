package com.mycompany.ch07;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		
		System.out.println("car.engine: " + car.engine);
		System.out.println("car.color: " + car.color);
		
		car.back();
		car.go();
		car.go();
		car.go();
		
	}

}
