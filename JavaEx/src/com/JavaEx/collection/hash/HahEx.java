package com.JavaEx.collection.hash;

import java.util.HashSet;

public class HahEx {

	public static void main(String[] args) {
		
		basicHash();
		
	}
	private static void basicHash() {
		HashSet<String> hs = new HashSet<>();
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		
		System.out.println("HashSet: "+ hs);
		System.out.println("요소수: "+hs.size());
		
		hs.add("Java");
		System.out.println("HashSet: "+ hs);
		System.out.println("요소수: "+hs.size());
		
		//요소의 포함 여부 확인\
		System.out.println("contains Java ? "+hs.contains("Java"));
		System.out.println("contains Linux ? "+hs.contains("Linux"));
		
		System.out.println("HashSet: "+ hs);
		
		//요소 삭제
		hs.remove("c++");
		System.out.println("HashSet: "+ hs);
		
		//비우기
		hs.clear();
		System.out.println("HashSet: "+ hs);
	}

}
