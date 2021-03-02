package com.JavaEx.practice01;

public class problem04 {

	public static void main(String[] args) {
		int ten=10;// 구구단 처럼 2개의 for문을 이용했습니다
		for(int i=0;i<ten;i++) {//행의 반복 수행을 위한곳
			for(int j=1;j<=ten;j++) {//열읠 출력을 위한곳이고 2행부터는 1씩 더해야 해서 행인 i를 더해가면서 
									 //출력 했습니다
				System.out.print((j+i)+"\t");
			}
			System.out.println();
		}

	}

}
