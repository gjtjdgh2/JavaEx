package com.JavaEx.practice02;

public class Problem01 {

	public static void main(String[] args) {
		int total =0;
		int sum =0;
		int[] data = {1,3,5,8,9,11,15,19,18,20,30,33,31};
		for(int i=0;i<data.length;i++) {
			if(data[i]%3 ==0) {
				total += data[i];
				sum += 1;
			}
		}
		System.out.println("주언진 배열에서 3의 배수의 개수 => "+sum);
		System.out.println("주어진 배열에서 3의 배수의 합 =>"+total);

	}

}
