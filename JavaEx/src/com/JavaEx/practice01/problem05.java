package com.JavaEx.practice01;
import java.util.Scanner;//입력 받기 위해 사용
public class problem05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세여");
		int mbig = 0;
		for(int i=1;i<=5;i++) {//5번 숫자 입력 받는곳
			System.out.print("숫자:");
			int num =scan.nextInt();
			
			if(num>mbig) {//비교해서 새로운 값이 기존 보다 크면 큰값으로 바꾼다
				mbig = num;
			}
		}
		System.out.printf("최대값은 %d입니다",mbig);

	}

}
