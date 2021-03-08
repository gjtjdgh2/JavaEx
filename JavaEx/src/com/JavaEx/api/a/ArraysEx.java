package com.JavaEx.api.a;

import java.util.Arrays;
import java.util.Collections;

//배욜을 조작하는되 도움 되는 클래스
public class ArraysEx {

	public static void main(String[] args) {
		//arrayCopyEx();
		//arrayCopyEx1();
		//basicSortArray();
		//basicSortDesc();
		//custom();
		//basicSearch();
		customClassSearch();
	}
	
	private static void customClassSearch() {
		Member[] member= {
				new Member("전우치"),
				new Member("홓길동"),
				new Member("갓사")
		};
		Arrays.sort(member);
		System.out.println("원본: "+Arrays.toString(member));
//		int index = Arrays.binarySearch(member, new Member("홓길동"),
//				new Comparable<Member>() {
//
//					@Override
//					public int compareTo(Member o) {
//						
//						return 0;
//					}
//			
//		});
		//System.out.println("홓길동 검색: "+index);
	}
	
	
	private static void basicSearch() {
		//자바의 기본 검색 방시근 binarySearch
		//검색 이전에 반드시 정렬이 되어야 한다
		int[] nums = {1,5,7,9,6,4,3,4,5,6};
		System.out.println("원본 배열"+Arrays.toString(nums));
		Arrays.sort(nums);
		System.out.println("정렬 배열"+Arrays.toString(nums));
		int index=Arrays.binarySearch(nums, 9);
		System.out.println("9의 인덱스 "+index);
		
		String[] words = {"Java","C","C++","python"};
		System.out.println("원본: "+Arrays.toString(words));
		Arrays.sort(words);
		index= Arrays.binarySearch(words, "Java");
		System.out.println("Java의 인덱스 "+index);
	}
	//사용자 정의 클래스 정렬
	private static void custom() {
		Member[] member= {
				new Member("전우치"),
				new Member("홓길동"),
				new Member("갓사")
		};
		System.out.println("원본 배열"+Arrays.toString(member));
		Arrays.sort(member);
		System.out.println("정렬 배열"+Arrays.toString(member));
		Arrays.sort(member,Collections.reverseOrder());
		System.out.println("역순 "+Arrays.toString(member));
	}
	
	
	//기본 자료형 오름 차순
	private static void basicSortArray() {
		int[] scoren = {80,50,60,20,70,80,90};
		System.out.println("원본 "+ Arrays.toString(scoren));
		 Arrays.sort(scoren); // 정렬
		 System.out.println("정렬 "+ Arrays.toString(scoren));
		 System.out.println();
	}
	//기본 자료형의 내림차순 변경
	private static void basicSortDesc() {
		Integer[] scoren = {80,50,60,20,70,80,90};
		System.out.println("원본 "+ Arrays.toString(scoren));
		//내림차순
		Arrays.sort(scoren,Collections.reverseOrder());
		System.out.println("내림차순: "+Arrays.toString(scoren));
		
	}
	
	
	
	private static void arrayCopyEx1() {
		
		char[] src = "Java Programing".toCharArray();
		System.out.println("원본: "+Arrays.toString(src));
		
		//시스템 이용
		char trag[] = new char[src.length];
		System.arraycopy(src, 0, trag, 0, src.length);
		
		System.out.println("시스ㅜ템 이용한 배열 보가: "+Arrays.toString(trag));
		
		//Array를 이용한 배열 복사
		trag = Arrays.copyOf(src, src.length); //src 배열 길이만큼 복사
		System.out.println("copy of "+Arrays.toString(trag));
		
		//배열 일부 복제
		trag = Arrays.copyOfRange(src,
				5,//복사 시작 인덱스
				7);//끝 인덱스
		System.out.println("copyofRanger "+Arrays.toString(trag));
	}
	
	//배열 복사
	private static void arrayCopyEx() {
	
	int src[] = {1,2,3,4,5,6,7,8,9,10};
	for(int i =0;i<src.length;i++) {
		System.out.print(src[i]+ " ");
		
	}
	System.out.println();
	
	//System으 이용한 복사
	int[] traget = new int[10];
			System.arraycopy(src,//원본
			0,// 복사 시작위치
			traget,//타갯 배열
			0,// 타갯의 복사 시작 위치
			src.length);//길이
	
			for(int i =0;i<src.length;i++) {
				System.out.print(src[i]+ " ");
				
			}
			System.out.println();
	}
	

}
