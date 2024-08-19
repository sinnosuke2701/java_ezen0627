package com.mycompany.ch13.first;

public class Box<T> {
	
//	private String a;
//	
//	public String getA() {
//		return a;
//	}
//	
//	public void setA(String a) {
//		this.a = a;
//	}	
	
	//class이름 옆에 <> 타입명 적어라~
	

	private T t;
	
	public T getT() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
}
