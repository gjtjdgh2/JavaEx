package com.JavaEx.opp.Point.v4;

public class PointApp {

	public static void main(String[] args) {
		Point p1 = new Point(5,10);
		p1.draw();
		p1.draw(false);

		Point p2 = new Point(15,30);
		p2.draw();
		p2.draw(true);
		
		ColorPoint cp = new ColorPoint(20,40,"검정");
		cp.draw();
		cp.draw(true);
		
		System.out.println("===========");
		ColorPoint cp2 = new ColorPoint(30,40,"빨강");
		cp2.draw();
		
		Point cp3 = new ColorPoint(50,100,"파랑");
		cp3.draw();
	}

}
