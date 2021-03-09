package com.JavaEx.collection.hash;

import java.util.HashSet;

public class HahEx {

	public static void main(String[] args) {
		
		//basicHash();
		customHashSetEx();
	}
	private static void customHashSetEx() {
		HashSet<Student> hs = new HashSet<>();
		
		Student s1 = new Student("홍길동",10);
		Student s2 = new Student("갓갓",20);
		Student s3 = new Student("전우치",30);
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println("학생부: "+hs);
		
		Student s4 = new Student("홍길동",10);
		hs.add(s4);
		System.out.println("hashcode of s1: "+s1.hashCode());
		System.out.println("hashcode of s4: "+s4.hashCode());
		System.out.println("s1 equals s4 "+s1.equals(s4));
		
		System.out.println("학생부: "+hs);
		
		//포함 여부 ㅇ확인
		boolean exists = hs.contains(new Student("홍길동",10));
		System.out.println("홍길동(10) esists: "+exists);
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
