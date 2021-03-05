package com.JavaEx.api.objectclass.v2;


//v2. equals
//사용자 정의 클래스는 내부값을 비교하는 방법을 자바가 알지 못한다
//두값을 비교 할수 있는 방법을 equals 메서드에 알려줘야한다
public class Point {

	private int x, y;
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	//객체 출력 or 문자열과 연결될 때 반환대는 문자열
	@Override
	public String toString() {
		
		return String.format("Point(x=%d,y=%d)", x,y);
	}
	
	//두 객체의 값을 비교
	@Override
	public boolean equals(Object obj) {//어떤 겍체든 받을수있다 Object
		if(obj instanceof Point) {
			Point other = (Point)obj;
			return this.x == other.x && this.y == other.y;
		}
		//다른 타입 비교 방법 정의 안되므로 부모의 equals 값을 그냥 리던
		return super.equals(obj);
	}
}
