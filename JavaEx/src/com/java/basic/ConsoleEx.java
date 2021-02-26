package com.java.basic;

public class ConsoleEx {

	public static void main(String[] args) {
		consoleOutputEx();
		
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
