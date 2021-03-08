package com.JavaEx.api.collections.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
	//백터 선언
		Vector<Integer> v= new Vector<>();
		System.out.println("Size : "+v.size()+", Capacity: "+v.capacity());
		
		//1부터 10까지 값을 담기
		for(int i =1;i<=10;i++) {
			v.addElement(i);
		}
		System.out.println("V: "+v);
		System.out.println("Size : "+v.size()+", Capacity: "+v.capacity());
		
		//허용량 초과
		v.addElement(11);
		System.out.println("Size : "+v.size()+", Capacity: "+v.capacity());
		
		//중간에 삽입
		v.insertElementAt(7, 5);
		
		System.out.println("V: "+v);
		System.out.println("Size : "+v.size()+", Capacity: "+v.capacity());
		
		//인댁스 참조
		System.out.println("5번 인덱스 참조: "+v.elementAt(5));
		
		//객체 검색
		int index= v.indexOf(6);// 6객체의 인텍스는
		System.out.println(index);
		index = v.indexOf(0);
		System.out.println(index);
		
		//포함 여부 확인
		System.out.println("v가 10을 포함 하는가?"+v.contains(10));
		
		//객체삭제
		System.out.println("v: "+v);
		v.removeElement(7);
		System.out.println("v: "+v);
		
		//내부 객체를 출력
		for(int i =0;i<v.size();i++) {
			Integer item = v.elementAt(i);
			System.out.print(item+" ");
		}
		System.out.println();
		
		//Enhanced for
		for(Integer item: v) {
			System.out.print(item+" ");
		}
		System.out.println();
		
		//vector -> Enumeration 받아와서 순회: 권장
		Enumeration<Integer> e = v.elements();
		
		while(e.hasMoreElements()) {//뒤에 담긴 객체가 더 있는가?
			Integer item = e.nextElement();
			System.out.print(item+" ");
			
		}
		System.out.println();
		
		//백터 지우기
		v.clear();
		System.out.println("v: "+v);
		System.out.println("Size : "+v.size()+", Capacity: "+v.capacity());
		
	}

}
