package com.java.basic;

import java.util.Scanner;

public class ConsoleEx {

	public static void main(String[] args) {
		//consoleOutputEx();
		ScannerEx();
	}
	//콘설 입력
	private static void ScannerEx() {
		// 이름과 나이를 입력 받아 출력 하기
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름은? ");
		String name = scanner.next();
		System.out.println("나이는?");
		int age = scanner.nextInt();
		System.out.println("당신의 이름은 "+name+" 나이는 "+age+"입니다");
		scanner.close(); 
	}
		//콘솔 출력
	private static void consoleOutputEx() {
		//표준 출력(stdout) :Sytem.sout
		//표준 에러(stderr) :System.err
		//print 철력후 다음불로 안넘어감
		//println 출력후 다음으로 넘어감
		//printf-> 포멧 출력 ->String 항목정리
		System.out.print("Hello");
		System.out.println("World");
		System.out.println("end");
		
		//이스케이프 문자 \" \' \\ \n \t
		System.out.println("World \n end");
		System.out.print("World \n");
		System.out.println("World\" JAVA \"");
	}
	
}
