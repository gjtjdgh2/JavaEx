package com.JavaEx.oop.shape.v1;

public class ShapeEx {

	public static void main(String[] args) {
		//Shape s= new Shape(10,20); 추상클래스 직접 객체화 불가능
		Rectangle r =new Rectangle(10,10,100,50);
		r.draw();
		
		Cirel c = new Cirel(30,40,10);
		c.draw();

	}

}
