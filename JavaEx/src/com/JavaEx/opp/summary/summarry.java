package com.JavaEx.opp.summary;

public class summarry {

	static kkkk[] dojang; // 인터페이스 배열
	public static void main(String[] args) {
		Human h1 = new Human("홍길동",30);
		Human h2 = new TheOne("theone",90);
		
		Panda p1 = new Kungfupada("핑",30);
		Panda p2 = new Panda("퐁",15);
		
		fight(h2);
		fight(h1);
		fight(p1);
		fight(p2);
		
		//도장에 등록
		dojang=new kkkk[] {
			//	(kkkk)h1,
				(kkkk)h2,
			//	(kkkk)p1,
				(kkkk)p2
		};
		
	}

	public static void fight(Animal actor) {
		if(actor instanceof kkkk) {
			((kkkk)actor).kungu();
		}else {
			System.out.println(actor.name+"쿵푸 못함");
	}
	
	for(kkkk member: dojang) {
		member.kungu();
	}
	}
}