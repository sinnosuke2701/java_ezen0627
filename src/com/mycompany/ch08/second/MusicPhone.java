package com.mycompany.ch08.second;

public class MusicPhone extends Phone {
	
	//method
	
	void downloadingmusic() {
		System.out.println("음악다운받기");
	}
	
	void playingmusic() {
		System.out.println("음악재생하기");
	}

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
		System.out.println("전화받기");
	}

	@Override
	void chargingbattery() {
		System.out.println("배터리 충전하기");
	}

	
	
	
	
}
