package com.mycompany.ch03.tr;

public class IncreaseDecreaseOperator2tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//증감 연산자
		
		int a = 5;
		int b = 10;
		
		++a;
		b++;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("------------");
		
		int c = a++;
		int d = ++b;
		
//		c=6 a=7 b=12  d=12 
		
		System.out.println("c : " + c);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("d : " + d);
		System.out.println("------------");
		
		--a; //a (6) = 7-1
		int z = ++a + b++;
		//++a=7 b=12 z= 19
		System.out.println("z : " + z);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("------------");
	}

}
