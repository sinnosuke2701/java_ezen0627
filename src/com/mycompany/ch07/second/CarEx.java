package com.mycompany.ch07.second;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		
		System.out.println("car.engine: " + car.engine);
		
		System.out.println("--------------------------------");
		
		Car car2 = new Car("black");
		System.out.println("car2.color: " + car2.color);
		
		System.out.println("--------------------------------");
		
		Car car3 = new Car(12,"로마","yellow","페라리");
		System.out.println("car3.color: " + car3.color);
		System.out.println("car3.engine: " + car3.engine);
		
		System.out.println("--------------------------------");
		
		Car car4 = new Car(6,"그랜저","white","현대");
		System.out.println("car4.color: " + car4.color);
		System.out.println("car4.company: " + car4.company);
		System.out.println("car4.engine: " + car4.engine);
		System.out.println("car4.name: " + car4.name);
		
		System.out.println("--------------------------------");
		
		car4.name = "gv80";
		System.out.println("car4.name: " + car4.name);
		
		System.out.println("--------------------------------");
		
		System.out.println("car4.name: " + car4.name);
		
		System.out.println("--------------------------------");
		
		
	}

}
