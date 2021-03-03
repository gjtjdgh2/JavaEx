package com.java.basic;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
		//ifEx();
		//ifElseEx();
		//ifElseEx2();
		//ifPractice();
		//switchEx();
		//switchEx2();
		switchEx3();
		//test();
	}
	private static void test() {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력해 주세여: ");
		int point = scan.nextInt();
		/*
		if((point%3)==0) {
			System.out.println("3의 배수 입니다");
		}else {
			System.out.println(point+"은 3의 배수가 아닙니다");
		}
		*/
		System.out.println(point+"는"+ (point % 3 == 0 ? "3의 배수입니다":point+"은 3의 배수가 아닙니다"));
		scan.close();
	}
	
	private static void switchEx3() {
		String day = "WED";
		String message;
		switch(day) {
		case "SUN":
			message = "일용일";
			break;
		case "MON":
		case "TUE":
		case "WED":
		case "THU":
			message = "열공";
			break;
		case "FRI":
			message= "불금";
			break;
		case "SAT":
			message="주말";
			break;
		default:
			message = "?";
		}
		System.out.println(message);
	}
	
	private static void switchEx2() {
		//월을 입력받아 일수 알려주기
		Scanner scan =new Scanner(System.in);
		System.out.print("달을 입력해주세여: ");
		int month = scan.nextInt();
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month+"월은 31일입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month+"웡은 30일입니다");
			break;
		case 2:System.out.println(month+"월은 28일입니다");
		}
		scan.close();
	}
	
	private static void switchEx() {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("과목을 선택해 주세요.");
			System.out.println("1.자바  2.C 3.C++  4.파이썬");
			System.out.print("과목번호: ");
			int code = scan.nextInt();
			switch(code) {
			case 1: System.out.println("R101호 입니다.");
			break;
			case 2: System.out.println("R202호 입니다.");
			break;
			case 3:System.out.println("R303호 입니다.");
			break;
			case 4:System.out.println("R404호 입니다.");
			break;
			default: System.out.println("상담원에게 문의 하세요!");
			}
			scan.close();
	}
	
	private static void ifPractice() {
		Scanner scan = new Scanner(System.in);
		System.out.println("과목을 선택해 주세요.");
		System.out.println("1.자바  2.C 3.C++  4.파이썬");
		System.out.print("과목번호: ");
		int code = scan.nextInt();
		if(code==1) {
			System.out.println("R101호 입니다.");
		}else if(code ==2) {
			System.out.println("R202호 입니다.");
		}else if(code ==3) {
			System.out.println("R303호 입니다.");
		}else if(code ==4) {
			System.out.println("R404호 입니다.");
		}else {
			System.out.println("상담원에게 문의 하세요!");
		}
			scan.close();
	}
	
	private static void ifElseEx() {
		//숫자를 입력받아 0보다 크면 양수 작으면 음수 0이면 0이 나오게한다
		System.out.print("정수를 입력해 주세여: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num>0) {
			System.out.println("양수입니다.");
		}else if(num<0) {
			System.out.println("음수입니다");
		}else {
			System.out.println("0 입니다");
		}
		scan.close();
		}
	private static void ifElseEx2() {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.print("정수를 입력해 주세여: ");
		
		if(num==0) {
			System.out.println("0 입니다");
		}else {
			if(num>0) {
				System.out.println("양수입니다.");
			}else {
				System.out.println("음수입니다");
			}
				
		}
		
	}
	
	// if 문
	private static void ifEx() {
		//점수를 입력받아 60점 이상이면 합격입니다. " 출력
		//그렇지 않으면 불합격입니다.
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력해 주세여. ");
		int point = scan.nextInt();
		
		if(point>=60) {//참일때
			System.out.println("합격입니다. ");
		}else {//거짓일때
			System.out.println("불합격입니다. ");
		}
		scan.close();
	}
}
