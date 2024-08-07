package com.mycompany.ch07.ninth;

public class MemberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member member = new Member();
		
		member.setname("짱구");
		member.setage(5);
		member.setShirtcolor("빨간색");
		member.setPantscolor("노란색");
		
		System.out.println("member.getname: " + member.getname());
		System.out.println("member.getage: " + member.getage());
		System.out.println("member.shirtcolor: " + member.getShirtcolor());
		System.out.println("member.pantscolor: " + member.getPantstcolor());
	}

}
