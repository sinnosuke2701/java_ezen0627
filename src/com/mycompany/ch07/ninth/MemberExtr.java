package com.mycompany.ch07.ninth;

public class MemberExtr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Membertr membertr = new Membertr();
		
		membertr.setage(5);
		membertr.setheight(105.9);
		membertr.setname("신짱구");
		membertr.setpantscolor("노란색");
		membertr.setshirtcolor("빨간색");
		
		System.out.println("membertr.age: " + membertr.getage());
		System.out.println("membertr.height: " + membertr.gethdight());
		System.out.println("membertr.shirtcolor: " + membertr.getshirtcolor());
		System.out.println("membertr.pantscolor: " + membertr.getpantscolor());
		
		
	}

}
