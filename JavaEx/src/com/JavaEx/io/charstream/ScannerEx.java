package com.JavaEx.io.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx {
	static final String rootpath = System.getProperty("user.dir")+"\\files\\";
	static final String filename = rootpath+"thieves.txt";
	public static void main(String[] args) {
		//Scanner은 단순 키보드 입력을 받기 위한 클래스가 아니다
		//다양한 입력 소스로 부터 데이터를 입력 받는 범용 클래스
		Scanner scan =null;
		File f =new File(filename);
		
		try {
			scan =  new Scanner(f);//파일로부터
			System.out.println("시작");
			String name;
			float num ;
			float num2;
			//스캐너의 eos(End of Stream)은 체크하는것이 좋다
			while(scan.hasNextLine()) {
				name = scan.next();
				num = scan.nextFloat();
				num2 = scan.nextFloat();
				System.out.printf("%s %f %f",name ,num,num2);
				//다음행 이동
				scan.nextLine();
			}
			System.out.println("끝");
			
		}catch(FileNotFoundException e) {
			System.out.println("파일 찾지못함");
			
		}finally {
			try {
				scan.close();
			}catch(Exception e) {
				
			}
		}
		
		
		
		
		
		
	}

}
