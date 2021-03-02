package com.java.basic;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		//whileEx1();
		//whileGugu();
		//doWhileEx();
		 //infLoop();
		//forGugu();
		//contiuneEx();
		//breakEx();
		//nestedFor();
		nestForStar();
		sixRadom();
	}

	private static void sixRadom() {
		//1~45난수 
		for(int i=1;i<=6;++i) {
			System.out.println((int)(Math.random()*45)+1);
		}
		
		//while 버전 만들어 보기
	}
	
	private static void nestForStar() {
	/*	for(int i=1;i<=5;++i) {
			for(int j=1;j<=i;++j) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		//while 버전
		int row=6;
		int i=1,j=1;
		while(i <=6) {
			while(j<=i) {
			System.out.print("*");
			++j;
		}++i;
		System.out.println();
			
	};
	}
	private static void whileEx1() {
		int a=0;
		while(a<=5) {//반복 조건
			System.out.println("I like Java"+a);
			a=a+1;//종료 조건 개발자가 직접 설정
		}
	}
	
	private static void nestedFor() {
		//2~9단까지 모두 출력
		for(int i=2;i<=9;++i) {
			for(int j=1;j<=9;++j) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		
	}
	
	private static void breakEx() {
		//6의 배수이고 14의 배수인 가장 작은 숫자
		int num=1;
		while(true) {
			if(num%6==0 && num %14 ==0)break;
			num++;
		}
		System.out.println(num);
	}
	
	private static void contiuneEx() {
		for(int i=1;i<=20;i++) {
			if(i%2==0||i%3==0) {
				continue;
			}
			System.out.println(i);
		}
	}
	
	private static void forGugu() {
		Scanner scan =new Scanner(System.in);
		System.out.println("단을 입력해 주세여");
		int dan = scan.nextInt();
		for(int a =1;a<=9;a++) {
			System.out.println(dan+"*"+a+"="+dan*a);
		}
		scan.close();
	}
	
	private static void infLoop() {
		//while , do-while 개발자가 책임 진다.
		while(true) {
			System.out.println("ctrl+c");
		}
	}
	
	//최소 1번은 실행 한다.
	private static void doWhileEx() {
		int value=0,total=0;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("정수를 입력하세여 [0입력시 종료]");
			value = scan.nextInt();
			total = total+ value;
		}while(value !=0);
		System.out.println("합산의 값 "+total);
		
	}
	
	private static void whileGugu() {
		//단을 입력 받아 국단 실행
		Scanner scan = new Scanner(System.in);
		System.out.println("단을 입력 하세여");
		int dan = scan.nextInt();
		int a= 1;
		while(a<=9) {
			System.out.println(dan+"*"+a+"="+dan*a);
			++a;
		}
		scan.close();
	}
}
