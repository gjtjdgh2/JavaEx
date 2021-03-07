package com.JavaEx.test;

public class Student extends Person {

	protected String school;
	
	public Student(String school) {
		this.school = school;
	}
	
	public Student(String name,int age,String school) {
		super(name,age);
		this.school = school;
		
	}
	
public void showln() {
		System.out.printf("%s 학교%n",school);
	}
	
	
public void showlnfo() {
		System.out.printf("%s학생 %d살 %s 학교%n",name,age,school);
	}
	
	
	
}
