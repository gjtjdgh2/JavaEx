package com.JavaEx.opp.summary;

public class Human extends Animal{
	
	public Human(String name,int age) {
		super(name,age);
	}

	@Override
	public void say() {
		System.out.printf("인녕 내이름은 %s 야",name);
		
	}

}
