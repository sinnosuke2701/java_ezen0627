package com.mycompany.ch07.second;

public class IphoneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Iphone iphone = new Iphone();
		
		Iphone iphone2 = new Iphone("A17 Pro칩");
		System.out.println("iphone2.cpu: " + iphone2.cpu);
		
		System.out.println("-----------------------------------");
		
		Iphone iphone3 = new Iphone("A16 Bionic칩" , "16GB");
		System.out.println("iphone3.cpu: " + iphone3.cpu);
		System.out.println("iphone3.memory: " + iphone3.memory);
		
		System.out.println("-----------------------------------");
		
		Iphone iphone4 = new Iphone("A16 Pro칩" , "32GB" , "black");
		System.out.println("iphone4.cpu: " + iphone4.cpu);
		System.out.println("iphone4.memory: " + iphone4.memory);
		System.out.println("iphone4.color: " + iphone4.color);
		
		System.out.println("-----------------------------------");
		
		iphone3.memory = "8GB";
		System.out.println("iphone3.memory: " + iphone3.memory);
		
		System.out.println("-----------------------------------");
		
		
	}

}
