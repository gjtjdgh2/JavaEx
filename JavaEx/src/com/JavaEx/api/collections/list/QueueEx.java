package com.JavaEx.api.collections.list;

import java.util.LinkedList;
import java.util.Queue;
public class QueueEx {

	public static void main(String[] args) {
		//qoeoe는 인터페이스 실제 클레스는 List 관령 클레스를 사용
		Queue<Integer> queue = new LinkedList<>();
		
		//데이터 제공
		for(int i=0;i<10;i++) {
			queue.offer(i);
			System.out.println("queue: "+queue);
		
		}
		// 데이터 학인
				int item = queue.peek();
				System.out.println("출력: "+item);
				System.out.println("queue: "+queue);
				item = queue.poll();
				System.out.println("출력: "+item);
				System.out.println("queue: "+queue);
				
			//queue에서 poll을 할때
			//비어있는지 반드시 확인
			while(!queue.isEmpty()) {
				System.out.println("POLL"+queue.poll());
				System.out.println("Queue:" + queue );
			}
	}

}
