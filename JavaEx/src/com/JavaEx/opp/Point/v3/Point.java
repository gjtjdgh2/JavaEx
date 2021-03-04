package com.JavaEx.opp.Point.v3;

//v3 매소드 오버로딩
public class Point {

	private int x, y;
	
	
	public Point() {
		System.out.println("기본 생성자부분");
	}
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println("사용자 저의 생성자 부분");
	}
	
	
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
	System.out.printf("점[x=%d, y=%d] %n",x,y);
	}
	
	public void draw(boolean show) {
		String message =String.format("점 [x=%d,y-=%d]를",x,y );
		if(show) {
			message +="그렿습니다";
		}else {
			message +="지웠습니다";
		}
		System.out.println(message);
	}
}
