package com.JavaEx.oop.shape.v2;

public class ShapeEx {

	public static void main(String[] args) {
		//Shape s= new Shape(10,20); 추상클래스 직접 객체화 불가능
		Rectangle r =new Rectangle(10,10,100,50);
		r.draw();
		
		Cirel c = new Cirel(30,40,10);
		c.draw();
		Point p = new Point(10,20);
		String s="Traimgle";
		 drawTest(r);
		 drawTest(c);
		 drawTest(p);
		 drawTest(s);
	}
	
	private static void drawTest(Object obj) {
		//obj -> Drawable 인터페이스 내부에 draw();
		//참조 타입이 인터페이스여도 casting 가능
		
		if(obj instanceof Drawable) {
			((Drawable)obj).draw();
		}else {
			System.out.println("그리기가 아닙니다");
		}
		
	}

}
