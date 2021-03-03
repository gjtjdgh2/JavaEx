package com.JavaEx.practice02;

import java.util.Scanner;
public class Problem02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float sum=0;
		int avg[]= new int[5];
		for(int i =0;i<5;i++) {
			avg[i]=scan.nextInt();
			sum += avg[i];
		}
		float avg2 = sum/5;
		System.out.printf("평균은 %.1f 입니다",avg2);
		scan.close();
	}

}
