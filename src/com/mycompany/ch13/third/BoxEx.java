package com.mycompany.ch13.third;

public class BoxEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box<String> box = new Box<>();
		
		Box<String> Box2 = Util.boxing("짱구야");
		
		Box<Integer> box3 = Util.boxing(5);
		
	}

}
