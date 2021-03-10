package com.JavaEx.thread.v1;

public class MainThread {

	public static void main(String[] args) {
		//main thread의 흐름과 다른 별도의 작업흐름 
		Thread thread = new DigitTheard();
		thread.setName("DigitTheard");
		//스레드 시닥
		thread.start(); //start메서드 내에서 run 메서드를 대신 수행
		//주의
		//thread.run(); -> 일반 메서드로 실행 한것이다
		
		//main thread A~Z까지 출력
		for(char ch = 'A';ch<='Z';ch++) {
			System.out.println("MainThread: "+ch);
			
			//잠시 대기
			try {
				Thread.sleep(300);//0.3초
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		
		}

	}

}
