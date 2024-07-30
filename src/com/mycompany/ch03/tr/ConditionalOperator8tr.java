package com.mycompany.ch03.tr;

public class ConditionalOperator8tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//삼항 연산자 (조건식) ? A : B
		
		int korean = 3;
		
		char grade = (korean > 80) ? 'A' : 'B';
			System.out.println("grade : " + grade);
			
		//값이 5인 변수 선언
		//선언한 변수의 값이 5이면 7 대입 아니면 13 대입
			
		int a = 6;
		
		int result = (a == 5) ? 7 : 13 ;
			System.out.println("result : " + result);
	}

}
