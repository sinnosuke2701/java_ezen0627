package com.mycompany.ch13.first;

public class BoxEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Box box = new Box();
//		box.setA("신짱구");
//		box.setA(10) 데이터타입이 String으로 정의 되어 있어서 불가능 
		
		
		Box<String> box = new Box<>();
		box.setT("짱구");
		System.out.println(box.getT());
		
		System.out.println("--------------------");
		
		Box<Integer> box2 = new Box<>();
		box2.setT(5);
		System.out.println(box2.getT());
		
	}

}
