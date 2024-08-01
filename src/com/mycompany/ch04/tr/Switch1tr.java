package com.mycompany.ch04.tr;

public class Switch1tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 14;

		switch (num) {
		case 10:{
			System.out.println(num + "번 입니다.");
			break;
		}
		case 11:{
			System.out.println(num + "번 입니다.");
			break;
		}
		case 12:{
			System.out.println(num + "번 입니다.");
			break;
		}
		case 13:{
			System.out.println(num + "번 입니다.");
			break;
		}
		default :
			System.out.println("10 ~ 13 까지만 가능합니다.");
			break;
		}

	}

}
