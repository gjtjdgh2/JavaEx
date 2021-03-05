package com.JavaEx.opp.summary;

public class TheOne extends Human implements kkkk,Fly{

	public TheOne(String name,int age) {
		super(name ,age);
	}

	@Override
	public void kungu() {
		System.out.println(name+" 명대사");
		
	}
	
	public void fly() {
		System.out.println(name+"날수 있다");
	}
	
}
