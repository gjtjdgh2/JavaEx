package com.JavaEx.test;

public class Person {

	protected String name;
	protected int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person() {
		
	}
	public void showlnfo() {
		System.out.printf("%s학생 %d 살 %n",name,age);
	}
}
