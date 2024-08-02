package com.mycompany.ch06.random;

public class Random1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int min = 1;
//		int max = 45;
//		
//		int random = (int) ((Math.random() * (max - min)) + min);
//		System.out.println("random: " + random);
//		
//		int random = (int) (Math.random());
//		System.out.println("random: " + random);
		
		int min = 1;
		int max = 12;
		
		int random = (int) ((Math.random() * (max - min)) + min);
		System.out.println("random: " + random);
		
		System.out.println( Math.random() ); // (0 ~ 1)
		System.out.println( Math.random() * max ); // (0 ~ 12) * max = 0*max ~ 1*max = 0~12*max   
		System.out.println( (Math.random() * max) + min ); // (0~12*max) + min = (0+min~12*max+min)
		System.out.println( (Math.random() * (max - min)) + min ); // (0+min~12*max+min-min)
		System.out.println( (int) (Math.random() * (max - min)) + min ); // casting
		
	}

}
