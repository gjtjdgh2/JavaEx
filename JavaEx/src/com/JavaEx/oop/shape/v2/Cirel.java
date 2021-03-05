package com.JavaEx.oop.shape.v2;

public class Cirel extends Shape implements Drawable{
	//필드
	private double radius;
	
	//생성자
	public Cirel(int x,int y,double radius) {
		super(x,y);
		this.radius = radius;
		
	}
	//추상클래스 상속 받은 자식 클래스는 반드시 부모의 추상 메소드를 구현해야한다

	@Override
	public void draw() {
		System.out.printf("원 [x=%d,y=%d,r%f, area=%f]을 그렸습니다 %n",x,y,radius,area());
		
	}

	@Override
	public double area() {
		double area = Math.PI*Math.pow(radius, 2);
		return area;
	}
	
}
