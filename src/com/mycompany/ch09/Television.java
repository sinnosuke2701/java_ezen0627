package com.mycompany.ch09;

public class Television implements RemoteControl {

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Television 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Television 전원을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.Max_VOULUME) {
			this.volume = RemoteControl.Max_VOULUME;
		} else if (volume < RemoteControl.MIN_VOULUME) {
			this.volume = RemoteControl.MIN_VOULUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: "  );
	}

	
	
}
