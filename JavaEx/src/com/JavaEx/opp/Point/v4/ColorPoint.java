package com.JavaEx.opp.Point.v4;

//객채를 상속 받기 위해서 extends 이용
//명시 하지 않으면 최상의 부모 java object
public class ColorPoint extends Point {
	private String color;
	
	//생성자를 만들지 않으면 기본 생성자를 만든다
//	public ColorPoint() {
//		//특별히 명시 하지 않으면 기본 생성자 호출
//		super();
//	}
	
	
	//생성자
	public ColorPoint(int x,int y,String color) {
		super(x,y);//부모 생성자 호출
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//부모로붙어 draw 물려 받았지만 기능이 부족  다른 기능을 수행할경우 ,override(덮어쓰기)
	@Override
	public void draw() {
		//만약 오버라이드가 되어도 부모의 메소드는 남아있다
		//부모의 메서드를 호출
		super.draw();
		System.out.printf("색깔점 [x=%d, y=%d, 색상=%s]을 그렸습니다",getX(),getY(),color);
	}
	
	@Override
	public void draw(boolean show) {
		String message =String.format("색깔점 [x=%d, y=%d, 색상=%s]을 그렸습니다",x,y,color);
		if(show) {
			message +="그렿습니다";
		}else {
			message +="지웠습니다";
		}
		System.out.println(message);
		
	}
	
}
