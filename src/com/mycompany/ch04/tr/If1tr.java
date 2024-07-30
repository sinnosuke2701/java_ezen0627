package com.mycompany.ch04.tr;

public class If1tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if - 학점 계산
				// A :    ~ 90
				// B : 89 ~ 80
				// C : 79 ~ 70
				// D : 69 ~ 60
				// F : 59 ~
		
		int score = 50;
		
//		if(score >= 90) {
//			System.out.println(score + "점은 A입니다.");
//		} else if (score >= 80) {
//			System.out.println(score + "점은 B입니다.");
//		} else if (score >= 70) {
//			System.out.println(score + "점은 C입니다.");
//		} else if (score >= 60) {
//			System.out.println(score + "점은 D입니다.");
//		} else{
//			System.out.println(score + "점은 F입니다.");
//		}
		
//		if(score >= 90) {
//			System.out.println(score + "점은 A입니다.");
//		} else if (score <=89 && score >= 80) {
//			System.out.println(score + "점은 B입니다.");
//		} else if (score <=79 && score >= 70) {
//			System.out.println(score + "점은 C입니다.");
//		} else if (score <=69 && score >= 60) {
//			System.out.println(score + "점은 D입니다.");
//		} else{
//			System.out.println(score + "점은 F입니다.");
//		}
		
		if(score >= 97)
			System.out.println(score + "점은 A+입니다.");
		  else if(score >= 94 && score <= 96) {
			System.out.println(score + "점은 A입니다.");
		} else if(score >= 90 && score <= 93) {
			System.out.println(score + "점은 A-입니다.");
		} else if(score >= 87 && score <= 89) {
			System.out.println(score + "점은 B+입니다.");
		} else if(score >= 84 && score <= 86) {
			System.out.println(score + "점은 B입니다.");
		} else if(score >= 80 && score <= 83) {
			System.out.println(score + "점은 B-입니다.");
		} else if(score >= 77 && score <= 79) {
			System.out.println(score + "점은 C+입니다.");
		} else if(score >= 74 && score <= 76) {
			System.out.println(score + "점은 C입니다.");
		} else if(score >= 70 && score <= 73) {
			System.out.println(score + "점은 C-입니다.");
		} else if(score >= 67 && score <= 69) {
			System.out.println(score + "점은 D+입니다.");
		} else if(score >= 64 && score <= 66) {
			System.out.println(score + "점은 D입니다.");
		} else if(score >= 60 && score <= 63) {
			System.out.println(score + "점은 D-입니다.");
		} else {
			System.out.println(score + "점은 F입니다.");
		}
	}

}
