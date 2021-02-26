package com.java.basic.types;

//볼릿형
//boolean, 참 거짓 형
//제어문에 사용하여 흐름 제어
public class booleanEx {

	public static void main(String[] args) {
		boolean boo = true;///참
		boolean bof=false;//거짓
		
		System.out.println(boo);
		System.out.println(bof);
		
		//논리,비교 연산으로 추출된다
		int v1 =3,v2 =5;
		boolean re = v1>v2;
		boolean re2 = v1<v2;
		
		System.out.println(v1+"은"+v2+"보다큰가"+re);
		System.out.println(re2);
		
	}

}
