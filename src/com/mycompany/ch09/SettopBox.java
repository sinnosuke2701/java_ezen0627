package com.mycompany.ch09;

public class SettopBox implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("SettopBox 전원을 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("SettopBox 전원을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
	
	}
	
	
	
}
