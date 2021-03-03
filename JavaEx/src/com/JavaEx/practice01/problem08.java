package com.JavaEx.practice01;

import java.util.Scanner;
public class problem08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total =0;
		int end = 7;
		while(true) {
		System.out.println("----------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("----------------------");
		System.out.print("선택> ");
		int cho = scan.nextInt();
		switch(cho) {
		case 1:
			System.out.print("예금액>");
			int a=scan.nextInt();
			total += a;
			System.out.println();
			break;
		case 2:
			System.out.print("출금액>");
			int b= scan.nextInt();
			total -= b;
			System.out.println();
			break;
		case 3:
			System.out.println("잔고액>"+total);
			break;
		case 4:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("다시 입력해 주세요");
			
		}
		if(cho == 4) break;
		
		}
		
	}

}
