package com.JavaEx.oop.shape.v1;

//추상 클래스
//객체 되지 않고
//자식 클래스에게 필드와 메서드를 물려주는 역할
//특정 기능의 구현을 강제하는 역할수행
public abstract class Shape {
	//필드
	protected int x;
	protected int y;
	
	public Shape(int x, int y) {
		this.x=x;
		this.y=y;
	}

	//추상 클래스는 1개 이상의 추상 매소드를 갖는다
	public abstract void draw();
	public abstract double area();
	
}
