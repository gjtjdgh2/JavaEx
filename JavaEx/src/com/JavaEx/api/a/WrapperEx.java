package com.JavaEx.api.a;


public class WrapperEx {

	public static void main(String[] args) {
		//deperated 가 나오면 다른 방식을 이용하자
		Integer i = new Integer(10);
		Float f= new Float(3.14f);
		
		//valuof() static 메소드 이용
		Character c = Character.valueOf('c');
		
		//문자열로 초기화 할수있다 ->추천
		Integer i2 = Integer.valueOf("10");
		Float f2 = Float.valueOf("3.15f");
		Boolean b= Boolean.valueOf("false");
		
		//자동 지원
		Integer i3=10; // Integer i3 = Integer.valueOf("10");

		//유틸리티 메서드를
		//parse 계열 메서드: 문자열을 이용,해당 타입으로 변환,다른 형태 출력 메서드
		System.out.println(Integer.parseInt("123"));
		System.out.println(Integer.parseInt("FF",16));
		System.out.println(Integer.toBinaryString(28));
		System.out.println(Integer.toHexString(28));
		
		//형변환 메서드
		double d4=i3.doubleValue();
		System.out.println("형 변환 "+d4);
		
		//포장 클래스 역시 객체이다
		Integer i4 = Integer.valueOf(2021);
		Integer i5 = Integer.valueOf(2021);
		System.out.println("i4==i5 ? "+(i4==i5));//false 받음 주의
		//포장 클래스 == 포장 클래스 -> 두 클래스 주소 비교
		
		//값의 비교를 위해서는 unboxing비교,equals 비교 해야 한다
		System.out.println("값의 비교(언박싱) "+(i4.intValue() == i5.intValue()));
		System.out.println("값의 비교(equals) "+i4.equals(i5));
		
	}

}
