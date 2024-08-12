package com.mycompany.ch09;

public interface RemoteControl {

	public static final int Max_VOULUME = 10;
	int MIN_VOULUME = 0;
	final String name = "shinnosuke";
	
	//추상메서드
	public abstract void turnOn();
	void turnOff(); //public abstract 생략 가능
	void setVolume(int volume);
	
	//default : 디폴트 메서드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// static : 정적메서드
	static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
	
}
 