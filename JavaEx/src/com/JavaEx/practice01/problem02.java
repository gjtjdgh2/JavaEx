package com.JavaEx.practice01;


import java.util.Scanner; // 입력 받을때 사용하는것
public class problem02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);// 입력 받는곳
				System.out.println("숫자를 입력하세요");
			int num = scan.nextInt();// 입력받은 String를 정수로 바꾸어서 num에 넣음
			for(int i=1;i<=num;i++) {//행을 숫자를 입력받음
				for(int j=1;j<=i;j++) {//열을 행의 숫자만큼 반복 행의 숫자만 반복되서 출력하게함
					System.out.print(i);
				}
				System.out.println();
			}
	}

}
