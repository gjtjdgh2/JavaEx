package com.JavaEx.thread.v1;

//방법1. thread 상속
//		->스레드 내부 로직을 정밀하게 제어 가능
public class DigitTheard extends Thread{

	@Override
	public void run() {
		//실제 스레드의 실행 로직
		for(int i=1;i<=30;i++) {
			System.out.printf("%s: %d%n",getName(),i);
			
		}try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		super.run();
	}
	

}
