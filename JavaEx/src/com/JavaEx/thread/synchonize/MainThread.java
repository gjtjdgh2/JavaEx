package com.JavaEx.thread.synchonize;

public class MainThread {

	public static void main(String[] args) {
		ShareMemory memory = new ShareMemory();
		
		//스레드 생성
		User user1 = new User("철수",memory,100);
		User user2 = new User("영희",memory,50);
		
		user1.start();
		user2.start();

	}

}