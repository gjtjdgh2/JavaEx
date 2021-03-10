package com.JavaEx.thread.v3;

public class MainThread {

	public static void main(String[] args) {
		//main thread의 흐름과 다른 별도의 작업흐름 
		//thread의 우선순위를 결정 할수있다1(MIN)~7~10(MAX)
		
		Thread thread = new DigitTheard();
		thread.setName("DigitTheard");
		thread.setPriority(Thread.MAX_PRIORITY);//10
		
		//주의
		//thread.run(); -> 일반 메서드로 실행 한것이다
		
		Thread thread2 = new Thread(new AlphbatRunable());
		///생성자에 run 메서드가 구현된 Runnable 객체를 구현한다
		thread2.setName("AlphbatRunable");
		thread2.start();
		thread2.setPriority(Thread.MIN_PRIORITY);//1최소
		//working Thread의 제어권을 유지 하기 위해서
		//스레드 시닥
				thread.start(); //start메서드 내에서 run 메서드를 대신 수행
		//작업 흐름에 참여 한다
		try{
			thread.join();
			thread2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("MainThread 종료!");
		
		

	}

}
