package com.JavaEx.practice02;

public class Problem05 {

	public static void main(String[] args) {
		int scor[][] = {{80,75,90,95,78},{92,88,89,92,70},{78,80,85,86,63},{83,84,89,87,75},
				{89,83,93,94,78}
		};
		int total = 0,count = 0;
		for(int i=0;i<scor.length;i++) {
			for(int j =0;j<scor[i].length;j++) {
				if(85<scor[i][j]) {
					total +=scor[i][j];
					count++;
				}
			}
		}
		System.out.print("합은: "+total);
		System.out.println("\n"+"갯수는"+count);
		float avg =(float)total/count;
		System.out.printf("평균은 %.3f",avg);
	}

}
