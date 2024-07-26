package com.mycompany.ch02;

public class CharEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char var = '신';
		char var2 = '짱';
		char var3 = '구';
		
//		char var4 = "신"; (''정상 , "" 오류 )
//		char var4 = '신짱구'; (char = 한 글자만 사용 가능  '신짱구' = 오류)
		
		char var11 = 'A';
		
		//10진수에 해당되는 문자로 저장
		char var12 = 65;
		
		//16진진수에 해당되는 문자로 저장
		char var13 = '\u0041';
		
		System.out.println("var11 : " + var11);
		System.out.println("var12 : " + var12);
		System.out.println("var13 : " + var13);
		
	}

}
