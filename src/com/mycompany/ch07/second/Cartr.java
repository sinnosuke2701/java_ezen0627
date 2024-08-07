package com.mycompany.ch07.second;

public class Cartr {
	
	//field
	int age = 5;
	double height = 105.9;
	String name;
	String nickname;
	String bloodtype;
	
//	기본생성자
	Cartr(){
		
	}
	
	//명시적생성자
	Cartr(String name){
		
	}
	
	
	Cartr (int age, double height, String name, String nickname, String bloodtype){
		this.age = age;
		this.height = height;
		this.name = name;
		this.nickname = nickname;
		this.bloodtype = bloodtype;
	}
}
