package com.JavaEx.api.collections.list;

import java.util.Stack;

public class StackEx {
	
	//stack 자료형
	//last input fist output(LIFO)

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		System.out.println("STACK:"+stack);
		
		//데이터 제공
		for(int i=0;i<10;i++) {
			stack.push(i);
			System.out.println("Stack: "+stack);
		}
		
		//확인: 가장 마지막의 데이터를 출력
		System.out.println("PEEK: "+stack.peek());
		System.out.println("STACK: "+stack);
		
		//인출 pop
		Integer item = stack.pop();
		System.out.println("POP: "+item);
		System.out.println("STACK: "+stack);
		
		//순회
		while(!stack.empty()){ //스택이 비어있지 않으면
			System.out.println("POP: "+stack.pop());
			
		}
	}

}
