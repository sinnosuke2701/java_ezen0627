package com.mycompany.ch08.second;

public class MobilePhone extends Phone {

	@Override
	void callingphone() {
		System.out.println("전화걸기");
	}

	@Override
	void pickingphone() {
		System.out.println("전화받기");
	}

	@Override
	void wirelessbasestationconnection() {
		System.out.println("무선 기지국 연결");
	}

	@Override
	void chargingbattery() {
		System.out.println("배터리 충전하기");
	}
	
	//method
//	void callingphone() {
//		System.out.println("전화걸기");
//	}
//	
//	void pickingphone() {
//		System.out.println("전화받기");
//	}
//	
//	void wirelessbasestationconnection() {
//		System.out.println("무선 기지국 연결");
//	}
//	
//	void chargingbattery() {
//		System.out.println("배터리 충전하기");
//	}
	
	

}
