package com.JavaEx.api.objectclass.v3;


//v3 얇은 복제
//값이 같은 새로운 객체를 복게 하는것
//단순히 필드 값만 복제 한느것:얇은 복제

public class Point implements Cloneable{
//필드
	private int x, y;
	//생성자
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
	
	//getter/setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//복제 메서드
	public Point getClone() {
		//객체 복제
		Point clone =null;
		try {
			
		clone=(Point)clone();
		
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
	
}
