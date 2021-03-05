package com.JavaEx.oop.cating;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}
	
	//매서드
	public void bark() {
		System.out.println(name+"이 강아지가 멍멍 짖음");
	}
}
