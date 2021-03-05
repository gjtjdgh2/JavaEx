package com.JavaEx.opp.summary;

public class Kungfupada extends Panda implements kkkk{

	public Kungfupada(String name,int age) {
		super(name,age);
	}

	@Override
	public void kungu() {
		//kkkk 인터페이스 내의 추상 매소드
		System.out.println(name+": 아뽀");
		
		
	}
}
