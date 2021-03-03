package com.JavaEx.practice01;

import java.util.Scanner;

public class problem07 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("=====================");
		System.out.println("    [숫자맞추기게임 시작]     ");
		System.out.println("=====================");
		String y="y";
		int num2=999;
		int num=(int)(Math.random()*100)+1;
		while(true) {
			System.out.print(">>");
			num2=scan.nextInt();
			if(num>num2) {
				System.out.println("더 크게");
			}else if(num<num2) {
				System.out.println("더 작게");
			}else if(num==num2) {
				System.out.println("맞았습니다");
				System.out.print("개임을 종료 하시겠습니까?(y/n)>>");
				String end = scan.next();
				num=(int)(Math.random()*100)+1;
				if(y.equals(end)) {
					break;
			}
			}
		}
		System.out.println("=====================");
		System.out.println("    [숫자맞추기게임 종료]     ");
		System.out.println("=====================");
		
		scan.close();
	}
}
