package com.mycompany.ch03;

public class IncreaseDecreaseOperator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 7;
		int j = 8;
		
		++i;
		j++;
		
		System.out.println("i :" + i);
		System.out.println("j :" + j);
		System.out.println("----------------");
		
		int k = i++;
		int n = ++j;
		
//		k=8  i=9
//		j=10 l=10
		
		System.out.println("k :" + k);
		System.out.println("i :" + i);
		System.out.println("j :" + j);
		System.out.println("n :" + n);
		System.out.println("----------------");
		
		--i; //i(8) = 9-1
		int z = ++i + j++;
		// i는 대입먼저 그대로 8  j는 10에서 1을 더한 후 대입 11  8+11 = z
		System.out.println("z : " + z);
		System.out.println("i : " + i);
		System.out.println("j : " + j);
		System.out.println("----------------");
	}

}
