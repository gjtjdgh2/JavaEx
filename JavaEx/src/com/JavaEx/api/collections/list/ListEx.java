package com.JavaEx.api.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		listClassEx();

	}
	 private static void listClassEx() {
		 // List관련 클래스는 List인터페이스를 구현
		// List<String> lst = new LinkedList<>();// 실제 클래스는 LinkedList
		 List< String> lst = new ArrayList<>();
		 
		 
		 System.out.println("Ist: "+lst);
		 System.out.println("size lst:"+lst.size());

		 //객체 추가
		 lst.add("Java");
		 lst.add("c");
		 lst.add("C++");
		 lst.add("Python");
		 
		 System.out.println("lst:"+lst);
		 
		 //객체 삽입
		 lst.add(2,"C#");
		 System.out.println("lst:"+lst);
		 
		 //List는 중복 삽입 허용
		 lst.add("Java");
		 System.out.println("lst:"+lst);
		 
		 // 조회
		 System.out.println("lst 2번 인덱스:"+lst.get(2));
		 
		//루프
		 for(String item: lst) {
			 System.out.print(item+" ");
		 }
		 System.out.println();
		 
		 //반복자를 이용한 순회: 추천
		 Iterator<String> it = lst.iterator();
		 while(it.hasNext()) {//뒤에 내영이 더있는가?
			 String item = it.next();
			 System.out.print(item+" ");
		 }
		 System.out.println();
		 
		 //삭제
		 lst.remove(2);//인덱스 이용
		 lst.remove("Java");//객체이용 삭제 처음게 삭제
		 System.out.println("lst:"+lst);
		 
		 //검색
		int position = lst.indexOf("Java");
		 System.out.println("lst Search:"+position);
		 position = lst.indexOf("Limm");
		 System.out.println("없는거 :"+position);
		
		 //비우기
		 lst.clear();
		 System.out.println("lst:"+lst);
		 
	 }

}
