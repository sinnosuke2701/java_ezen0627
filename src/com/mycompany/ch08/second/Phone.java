package com.mycompany.ch08.second;

public class Phone {
	
	//-class MobilePhone : 전화걸기, 전화받기, 무선기지국연결, 배터리 충전하기
	//-class MusicPhone : 전화걸기, 전화받기, 무선기지국연결, 배터리 충전하기, 음악다운받기, 음악재생하기
	//두 클래스를 생성하고 공통된 기능을 부모 클래스로 만들어 상속 관계를 형성
	//부모 클래스를 위 내용 전부 오버라이드 진행...
	
	
	
	void callingphone() {
		System.out.println("전화걸기");
	}
	
	void pickingphone() {
		System.out.println("전화받기");
	}
	
	void wirelessbasestationconnection() {
		System.out.println("무선 기지국 연결");
	}
	
	void chargingbattery() {
		System.out.println("배터리 충전하기");
	}
	
}
