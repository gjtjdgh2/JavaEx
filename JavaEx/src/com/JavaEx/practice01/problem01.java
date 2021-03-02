package com.JavaEx.practice01;

public class problem01 {

	public static void main(String[] args) {
		int i=1;//초기값
		while(i<=100) { // 100번 정도 해서 for문 보단 while 문을 사용했습니다
			if(i%5==0 && i%7==0) { // 5로와 7로 나무면 나머지가 0이 나와야 해서 and인 && 로 묶었습니다
				System.out.println(i);
			}
			++i;// 증가 값
		}

	}

}
