package com.JavaEx.opp.Point.v1;

public class Point {

	private int x, y;
	
	//getter/setter
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x =x;
	}
	public int getY() {
		return y;
	}
	public void sety(int y) {
		this.y =y;
	}
	public void draw() {
	System.out.printf("점[x=%d, y=%d] ",x,y);
	}
}
