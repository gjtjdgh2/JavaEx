package com.JavaEx.op.staticmember;

public class StaticEx {
	//클래스 변수(static)
	//모든 인스턴스에서 공유
	//static -> instance 불가
	//instance -> static 가능
	
	public static int refCount;
	public static String classVar;
	
	//인스턴스 변수
	//개별 객체 내부에서만 접근
	public String instanceVar;
	
	//static 영역 초기화는 static 블록에서 할수 있다
	static {
		refCount = 0;
		classVar = "클래스 변수";
		System.out.println("Static 블록 실행");
	//	instanceVar ="qustn";  이건 접근 불가능
				}
	
	public StaticEx() {// 인스턴스가 스택틱으로 접근 가능
		refCount++;
		System.out.println("인스턴스 생성");
		System.out.println("=>참조 Count:"+refCount);
	}
	
	//소멸자
	@Override
	protected void finalize() throws Throwable {
		refCount--;
		System.out.println("소멸자 호출");
		super.finalize();
	}
}
