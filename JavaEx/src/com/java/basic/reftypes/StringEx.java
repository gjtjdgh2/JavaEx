package com.java.basic.reftypes;

public class StringEx {

	public static void main(String[] args) {
		//stringTest();
		stringFormatEx();

	}

	private static void stringFormatEx() {
		//%s 문자열  %d 10진수  %n 행 바꿈
		String fruit = "사과";
		int total = 10;
		int eat = 3;
		System.out.println(total+"개의"+fruit+"중에서"+ eat +"개를 먹었다");
		
		//formatting
		//System.out.printf("");
	}
	
	private static void stringTest() {
		//문자열 선언
		String str;//선언
		str = "Java";//초기화
		System.out.println("str :"+str);
		
		String str2="Java";
		System.out.println("str2:"+ str2);
		
		String str3 = new String("Java");
		System.out.println("str3 : "+str3);
		
		System.out.println("str == str2? "+(str == str2));
		System.out.println("str == str3? "+(str == str3));
		// == != 는 주소를 비교
		//.equals() 는 값을 비교
		System.out.println("str 과 str2는 내용이 같은가? "+str.equals(str2));
		System.out.println("str 과 str3 는 내용이 같은가? "+str.equals(str3));
	}
}
