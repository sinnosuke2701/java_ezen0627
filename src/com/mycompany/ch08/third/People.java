package com.mycompany.ch08.third;

public class People {
	
	public String name;
	public String ssn;
	
	//부모에 생성자가 존재한다.
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	//기본생성자
	public People() {
		
	}
	
	void sayName() {
		System.out.println("People.name: " + name);
	}
	
}
