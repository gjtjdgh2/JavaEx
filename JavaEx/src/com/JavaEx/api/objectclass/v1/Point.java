package com.JavaEx.api.objectclass.v1;


//v1 오브젝트를 살펴 보자
//아무것도 상속 받지 않아도 최상위 부모 Object를 상속
//객체의 출력 포멧을 변경 ->roString()을 오버라이드
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
}
