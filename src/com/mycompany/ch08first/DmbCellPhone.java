package com.mycompany.ch08first;

public class DmbCellPhone  extends CellPhone {
	//child class
	
	//필드
	public int channel;
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB를 켭니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB를 종료합니다.");
	}
	
	void turnOffDmb(int a) {
		
	}
	
}
