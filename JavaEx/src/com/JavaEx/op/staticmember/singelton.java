package com.JavaEx.op.staticmember;


//미션:
//어떤 상황에서 단 하나의 인스턴스만 유지
//생성자 접근 금지
public class singelton {
	//static 영역에 단 하나의 인스턴스객체를 담아둔다
	private static singelton instance = new singelton();
	//생성자
	private singelton() {
		//new 호출 불가
	}
	
	public static singelton getInstance() {
		return instance;
	}

}
