package com.JavaEx.practice01;

import java.util.Scanner;
public class problem06 {

	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int total =0;
		for(int i=0;i<=num;i++) {
			if(num%2 ==0) {
				if(i%2 ==0) {
					total +=i;
				}
				
			}else {
				if(i%2!=0) {
					total +=i;
				}
			}
		}
System.out.println("결과값: "+total);
scan.close();
	}

}
