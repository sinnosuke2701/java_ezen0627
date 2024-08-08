package com.mycompany.ch08.third;

public class Student extends People {
	
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name,ssn);
		
		this.studentNo = studentNo;
	}
	
	public Student(String name, String ssn) {
		super (name,ssn);
	}
	public Student() {
		
	}
	
	void sayName() {
		if(studentNo >= 20) {
			super.sayName();
		} else {
			System.out.println("Student.name: " + name);
		}
	}
	
	
}
