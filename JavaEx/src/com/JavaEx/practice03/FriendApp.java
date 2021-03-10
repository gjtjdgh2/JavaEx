package com.JavaEx.practice03;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Friend[] friend = new Friend[3];
		System.out.println("친구 3명을 등록해주세요");
		
		for(int i=0;i<3;i++) {
//		friend[i] = scan.nextLine();
			String line = scan.nextLine();
			String chunk[] = line.split(" "); // 0>1>2  >0>1>2 >0>1>2
			 friend[i].setName(chunk[i]);
			 friend[i].setHp(chunk[i+1]);
			 friend[i].setSchool(chunk[i+2]);
			
		}
		for(int j=0;j<3;j++) {
			friend[j].show();
		}
	}	
	}
		
	


