package com.JavaEx.api.objectclass.v4;

public class LangClassTest {

	public static void main(String[] args) {
		
		Scoreboard s1 = new Scoreboard(new int[] {10,20,30,40,50});
		System.out.println(("s1 = "+s1));
		
		//복제
		Scoreboard s2 = s1.getClone();
		System.out.println("s2 = "+s2);
		
		System.out.println("s1 과 s2 같은 객체 ? "+( s1 == s2));
		
		//복제된 객체의 내부 참조 자료 변경
		s2.getScoares()[2] = 100;
		
		System.out.println("s1 ="+s1);
		System.out.println("s2 ="+s2);
		
		//내부 필드 주소 비교
		System.out.println("s1.scores와 s2.scores 같은 객체? "+(s1.getScoares()==s2.getScoares()));
		
	}
}
