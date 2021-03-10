package com.JavaEx.thread.synchonize;

public class ShareMemory {

	private int memory;

	public int getMemory() {
		return memory;
	}

	//임꼐 영역: 여러곳에서는 동시에 사용 하면 안되는 영역 ->synchronized
	//사용이 끝날 때까지 메서드가 잠김
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(1000);//1초
		}catch(InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName()+": "+this.memory);
	}
	
}
