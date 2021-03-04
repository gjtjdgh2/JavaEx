package com.JavaEx.op.staticmember;

public class StaticExApp {

	public static void main(String[] agrs) {
		//1번 로드: static목록 생성후 -> 생성자 실행
		StaticEx s1 =new StaticEx();
		System.out.println("참조카운트: "+s1.refCount);
		//static 맴버는 new를 하지 안아도 가능
		System.out.println("참조카운트: "+StaticEx.refCount);
			
		//2번째 로드 
		//다시 static 불러드리진 않음 
		StaticEx s2= new StaticEx();
		System.out.println("참조카운트: "+StaticEx.refCount);
		
		//해제
		s1= null;
		System.out.println("s1 해제");
		System.out.println("참조카운트 : "+StaticEx.refCount);
		
		//임의로 가비지 콜랙터(gc)를 부르지 말자
		System.gc();//가비지 콜렉터 호출
		try {
			Thread.sleep(1000); // 1초 대기
			System.out.println("참조카운트: "+StaticEx.refCount);
		}catch(Exception e) {
			
		}
	}
}
