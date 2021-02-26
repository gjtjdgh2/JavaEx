package com.java.basic.types;

public class CastingEx {

	public static void main(String[] args) {
		implicitCastingEx();

	explicitCastingEx();
	}
	//넓은걸-> 좁은걸로
	private static void explicitCastingEx() {
		double d=1234.567;//8바이트 실수
		System.out.println(d);
		
		float f= (float)d;//4바이트 실수
		System.out.println(f);
		
		long l =(long)f;//8바이트 정수
		System.out.println(l);
		System.out.println(Long.toBinaryString(l));
		
		byte b =(byte)l;
		System.out.println(b);
	}
	//암묵적 캐스팅(implicit casting:promption )
	//좁은걸 -> 넓은 걸로 자동적으로 잡아줌
	private static void implicitCastingEx() {
		byte b= 25;//1바이트 정수
		System.out.println(b);
		
		short s =b;//2바이트 정수
		System.out.println(s);
		
		int i=s;//4바이트 정수
		System.out.println(i);
		
		long l=i;//8바이트 정수
		System.out.println(l);
		
		float f = l;//4바이트 실수
		System.out.println(f);
		
		double d=f;//8바이트 실수
		System.out.println(d);
	}
}
