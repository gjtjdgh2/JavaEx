package com.JavaEx.api.a;

//사용자 정의 클래스
public class Member implements Comparable {

	String name;
	
	public Member(String name) {
		this.name  = name;
	}

	@Override
	public String toString() {
		
		return "Member (name: "+name+")";
	}

	//두 객체의 대소를 비교
	@Override
	public int compareTo(Object o) {
		//-1,0,1
		//두 대상의 값이 같으면 0
		//앞에것이 작으면 -1
		//뒤에것이 크면 1
		//파라메터 o가 Member 인지 확인
		if(o instanceof Member) {
			Member other = (Member)o;
			return name.compareTo(other.name);
		}
		return 0;
	}
}
