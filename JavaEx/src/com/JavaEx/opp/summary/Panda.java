package com.JavaEx.opp.summary;

public class Panda extends Animal{
	//생성자
	public Panda(String name,int age) {
		super(name,age);
		
	}

	//부모의 추상메소드 반그시 오버라이딩 
	@Override
	public void say() {
		System.out.println(name+":zz~");
		
	}
	
	
	
}
