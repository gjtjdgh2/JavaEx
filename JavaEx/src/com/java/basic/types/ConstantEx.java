package com.java.basic.types;

//상수
//조회,선언,초기화가능, 변경 불가능

public class ConstantEx {
	static final int SPEED_LIMT=110;
	public static void main(String[] args) {
		//상수 사용이유 , 유지 보수가 좋다. 코드의 가독성을 높인다
		//final int SPEED_LIMT=110;
		
		int speed = 120;
		
		boolean b1 = speed >SPEED_LIMT;
		System.out.println("제한속도 초과하였습니까?  "+b1);
		
		System.out.println("제한속도는 "+SPEED_LIMT+"km 입니다");
		
	}

}
