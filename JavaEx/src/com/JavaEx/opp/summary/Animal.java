package com.JavaEx.opp.summary;

//객체화 불가
//필드가능 
public abstract class Animal {

	//필드/
	
	protected String name;
	protected int age;
	
	//생성자
	public Animal(String name, int age) {
		this(name);
		this.age=age;
	}
	public Animal(String name) {
		this.name=name;
	}
	
	public void eat() { //일반 매소드
		System.out.println(name+" is eating...");
	}
	
	public abstract void say();//추상메소드  선언만
		
	
}
