package com.mycompany.ch07.second;

public class Iphone {
	
	//iphone 클래스
	//field 는 cpu,memory,color
	//각 필드를 늘려가면서 생성자를 만들고 객체를 생성하여 각 필드의 값을 출력 하시요
	
	//field
	String cpu;
	String memory;
	String color;
	
	//기본생성자
	Iphone(){
		
	}
	
	//명시적생성자
	Iphone(String cpu){
		this.cpu = cpu;
	}
	
	Iphone(String cpu, String memory){
		this.cpu = cpu;
		this.memory = memory;
	}
	
	Iphone(String cpu, String memory,String color){
		this.cpu = cpu;
		this.memory = memory;
		this.color = color;
	}
	
}
