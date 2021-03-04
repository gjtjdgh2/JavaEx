package com.JavaEx.practice02;

import java.util.Arrays;

public class Problem04 {

	public static void main(String[] args) {
		
		int end[] = new int[6];
		for(int i =0;i<6;i++) {
			end[i] =(int)(Math.random()*45+1);
			for(int j =0;j<i;j++) {
				
				if(end[j] == end[i]) {
					i--;
					break;
				
				}
				
			}
			
		}
		
		Arrays.sort(end);
		for(int i=0;i<6;i++) {
			System.out.print(end[i]+"\t");
		}

	}

}
