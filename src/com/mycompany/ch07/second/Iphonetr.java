package com.mycompany.ch07.second;

public class Iphonetr {
	//iphone 클래스
	//field 는 기종,색깔,가격
	//각 필드를 늘려가면서 생성자를 만들고 객체를 생성하여 각 필드의 값을 출력 하시요
	
	//field
	String model;
	String color;
	int price;
	//기본생성자
	Iphonetr(){
		
	}
	//명시적생성자
	Iphonetr(String model){
		this.model = model;
	}
	
	Iphonetr(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Iphonetr(String model, String color, int price){
		this.model = model;
		this.color = color;
		this.price = price;
	}
	
}
