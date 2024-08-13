package com.mycompany.ch10.first;

public class TryCatchFinallyEx {

	public static void main(String[] args) {

		try {
			Class clazz = Class.forName("ExTry");
			} catch (ClassNotFoundException a) {
				a.printStackTrace();
			}
		System.out.println("sdfa");
		}
		
	

}
