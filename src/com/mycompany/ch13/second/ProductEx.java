package com.mycompany.ch13.second;

public class ProductEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product<String, Integer> product = new Product<>();
		
		product.setKind("짱구");
		product.setModel(5);
		
		System.out.println(product.getKind());
		System.out.println(product.getModel());
		
		Product<Tv, Integer> product2 = new Product<>();
		//Tv 클래스 생성
		
	}

}
