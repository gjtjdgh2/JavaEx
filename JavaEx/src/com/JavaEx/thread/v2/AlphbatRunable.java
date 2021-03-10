package com.JavaEx.thread.v2;

//run 매서드만 구현  Thread의 생성자로 전달
public class AlphbatRunable implements Runnable {

	@Override
	public void run() {
		//main thread A~Z까지 출력
		for(char ch = 'A';ch<='Z';ch++) {
			System.out.println(Thread.currentThread() +": "+ch);
			
			//잠시 대기
			try {
				Thread.sleep(300);//0.3초
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		
		}

	}

}
