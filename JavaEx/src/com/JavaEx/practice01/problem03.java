package com.JavaEx.practice01;

public class problem03 {

	public static void main(String[] agrs) {
		int num=9; //간단히 하려고 넣은 정수
		for(int i=1;i<=num;i++) {//옆으로 출력이 되니 이곳이 *뒷쪽
			for(int j =2;j<=num;j++) {// 이곳이 단을 나타 내는곳이빈다
				System.out.print(j+"*"+i+"="+i*j+"\t");// 뒤어서 출력을 해야되서 \t 를 이용해 탭을 합니다
			}
			System.out.println();//줄바꿈
		}
		
	}
}
