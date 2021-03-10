package com.JavaEx.thread.synchonize;

public class User extends Thread{
	private ShareMemory memory;
	private int data;
	
	//생성자
	public User(String name, ShareMemory memory,int data) {
		this.setName(name);
		this.memory=memory;
		this.data =data;
	}

	@Override
	public void run() {
		//스레드가 시작되면
		if(memory !=null) {
			memory.setMemory(data);
		}
		super.run();
	}
	
}
