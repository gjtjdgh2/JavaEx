package com.JavaEx.oop.cating;

public class CatingEx {

	public static void main(String[] args) {
		//자신의 인스턴스를 자신것으로  참조한것
		Dog dog1 = new Dog("멍멍이");
		dog1.eat(); //부모거
		dog1.walk();//부모거
		dog1.bark();//자신거

		// 자식의 인스턴스를 부모 타입으로 참조 가능
		Animal dog2 = new Dog("스누피");
		dog2.eat();
		dog2.walk();
	//	dog2.bark(); // 침조 타입의 설계도 내에 있는것만 이용가능
		
		//참조타입을 자기 자신으로 변경(다운캐스팅)
		((Dog)dog2).bark();
		
		Animal pet = new Dog("아치");
		pet.walk();
		pet.eat();
		
		pet=null;
		
		pet= new Cat("얼룩");
		pet.eat();
		pet.walk();
		
		//((Dog)pet).bark(); pet 는 Dog 클레스가 아니다
		//중요 다운캐스팅을 하기 전에 반드시 해당 인스턴스의 설계도 클래스 인지 확인
		
		if(pet instanceof Dog) {
			((Dog)pet).bark();
		}else if(pet instanceof Cat) {
			((Cat)pet).meow();
		}
		
	}

}
