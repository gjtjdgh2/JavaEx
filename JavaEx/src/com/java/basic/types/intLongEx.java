package com.java.basic.types;

public class intLongEx {
	//정수형 타입 연습 
	//byte(1)<short(2)<int(4)<long(8)
	public static void main(String[] args) {
		int intvar=2021;
		//타입의 범위를 넘어가는 값을 넣을수 없다
		//intvar2 = 1234567890123456; //범위 초과
		long longvar = 2021L;
		long longvar2 = 123456789012345L; //뒤에 L 을 붙인다
	
		short s1= 100;
		short s2=200;
		
		//short result=s1 +s2; int로 변환해서 계산
	
		int bin,oct,hex;
		bin = 01100;//0b 접두어
		oct = 072; // 0접두어
		hex= 0xFF; //0x 접두어
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	}

}
