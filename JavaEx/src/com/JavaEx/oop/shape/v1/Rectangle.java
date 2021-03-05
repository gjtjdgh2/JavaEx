package com.JavaEx.oop.shape.v1;

public class Rectangle extends Shape{
	//필드
	private int wigth; 
	private int height;
	
	//생성자
	public Rectangle(int x,int y,int wigth,int height) {
		super(x,y);
		this.wigth = wigth;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.printf("사각형 [x=%d , y=%d, wigth=%d, height=%d] 사각형을 그렸습니다%n",x,y,wigth,height);;
		
	}

	@Override
	public double area() {
		
		return wigth*height;
	}
}
