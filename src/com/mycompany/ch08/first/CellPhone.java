package com.mycompany.ch08.first;

public class CellPhone {
	
	//field
	public String model;
	public String color;
	
	//생성자
	
	//method
	void powerOn() {System.out.println("전원을 킨다.");}
	void powerOff() {System.out.println("전원을 끈다.");}
	void bell() {System.out.println("벨이 울린다.");}
	void sendVoice(String message) {System.out.println("목보");}
	void receiveVoice(String message) {System.out.println("목받.");}
	void hangUp() {System.out.println("전화를 끊는다.");}
	void powerOn(int a) {System.out.println("전원을 킨다.2");}
	
	
}
