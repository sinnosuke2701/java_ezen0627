package com.mycompany.ch09;

public class TelevisionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//인터페이스 객체 생성 불가
//		RemoteControl remotecontrol = new RemoteControl();
		
		Television television = new Television();
		
		television.turnOn();
		television.turnOff();
		
		SettopBox settopbox = new SettopBox();
		
		settopbox.turnOff();
		settopbox.turnOn();
		
		System.out.println("---------------------");
		
		RemoteControl remotecontrol = new SettopBox(); // new 뒤 SettopBox 와 Television 변경해봥
		
		remotecontrol.turnOn();
		remotecontrol.turnOff();
		
	}

}
