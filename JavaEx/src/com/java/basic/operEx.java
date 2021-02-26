package com.java.basic;

public class operEx {

	public static void main(String[] args) {
		//arithOperEx();
	//	logicalOperEx();
		//bitOperEx();
		//bitShiftEx();
		comditionalOperEx();
	}
	private static void comditionalOperEx() {
		int a=10;
		//만약 a가 짝수면 "짝수",홀수면 "홀수"
		String str= a%2==0? "짝수":"홀수";
		System.out.println(str);
		
		//만약 score>=80 Good
		//80>score>50  :Pass
		// 나머진 Fail
		int score =85;
		String message = score>=85 ? "Good": score<50? "Fail": "Pass" ;
		System.out.println(message);
	}
	
	
	
	private static void bitShiftEx() {
		int val=1,val2;
		val2= val<<3;
		System.out.println(val2);
		System.out.println(Integer.toBinaryString(val2));
		
		val=50;
		val2= val>>4;
		System.out.println(val2);
		System.out.println(Integer.toBinaryString(val2));
		
	}
	// 비트 연산자(&,|,^)  , int 에만 적용
	private static void bitOperEx() {
int b1= 13,b2= 7;
System.out.println(Integer.toBinaryString(b1));
System.out.println(Integer.toBinaryString(b2));
int b3;
	b3=b1&b2;//논리곱
	bitShiftEx();
	b3=b1|b2;//논리합
	System.out.println(Integer.toBinaryString(b3));
	b3=b1^b2;
	System.out.println(Integer.toBinaryString(b3));
	b3=~b1;
	System.out.println(Integer.toBinaryString(b3));

	}
	
	
	//논리연사,비교 -> 결과 boolean
	
	private static void logicalOperEx() {
		int a=7,b=7;
		
		System.out.println("a>b? "+(a>b));
		System.out.println("a equals b ?"+ (a==b));
		System.out.println("a not equals b? "+(a!=b));
		
		//and: &&  or: || not:!
		int val =5;
		//val은 0초과 10미만에 있는가?
		boolean r1 =val>0;
		boolean r2 = val<10;
		boolean r1andr2 = r1&&r2;
		System.out.println("val은 0초과 10미만 사이에 있다 ? "+r1andr2);
		
		//vrr이 0이하,10이상의 영역에 있나?
		int vrr = 5;
		boolean rr1=vrr<=0;
		boolean rr2=vrr>=10;
		boolean rr1orrr2 = rr1||rr2;
		System.out.println("rr1||rr2  " +rr1orrr2);
		
		boolean rNot = !rr1orrr2;
		System.out.println(rNot);
	}
	//산술 연산자
	private static void arithOperEx() {
		int a=7,b=3;
		
		//부호 연산자: + -
		System.out.println(-a);//-1*a
		System.out.println(a+b);
		System.out.println(a-b);
		
		// %,/
		System.out.println(a%b);//몫
		System.out.println(a/b);// 나머지
		
		// 7/3 실제결과
		System.out.println((float)a/b);
		System.out.println(a/(float)b);
		
		// 증감산 연산 (++,--)
		int c=10;
		System.out.println(c);
		System.out.println(c++);//후위연산은 사용후 증가
		System.out.println(c);
		
		c=10;
		System.out.println(c);
		System.out.println(++c);//전위는 증가후 상용
		System.out.println(c);
		
		int d=10,e=0;
		//System.out.println(d/e); 에러
		System.out.println((float)d/e); //10.0/0 은 무한대
		System.out.println(0.0/0.0); //nam (not a number)없는 숫자다.
		
		//Infinity(무한대) 계산식은 항상 Infinity가 나온다
		//nan넘버가 포함된 것도 nan이 나온다
		
		//할당 연산자
		//a=a+b = a+=b   
	}
}
