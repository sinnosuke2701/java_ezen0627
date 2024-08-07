package com.mycompany.ch07.second;

public class CarExtr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cartr cartr = new Cartr(5,105.9,"짱구","감자머리","B형");
		
		System.out.println("cartr.age: " + cartr.age);
		System.out.println("cartr.height: " + cartr.height);
		System.out.println("cartr.name: " + cartr.name);
		System.out.println("cartr.nickname: " + cartr.nickname);
		System.out.println("cartr.bloodtype: " + cartr.bloodtype);
		
		cartr.bloodtype = "A형";
		Cartr cartr1 = new Cartr("A형");
		System.out.println("cartr2.bloodtype: " + cartr.bloodtype);
		
	}

}
