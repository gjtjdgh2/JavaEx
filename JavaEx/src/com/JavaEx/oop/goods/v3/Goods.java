package com.JavaEx.oop.goods.v3;

//v3 생성자

//new 키워드와 함깨 사용 객체 초기화
public class Goods {
	
	 private String name;
	 private int price;
	//생성자가 없으면 기본 생성자가 자동 생성후 실행
	 //그러나 사용자 정의 생성자가 있으면 기본 생성자를 추가하지 않는다.
	 //모든 필드 초기화 생성자
	 public Goods(String name, int price) {
		 this.name=name;
		 this.price =price;
		 
	 }
	 
	 
	 //getter/setter
	 //getter 만고 setter 가 없으면 읽기 전용
	 public String getName() {
		 return name;
	 }
	// public void setName(String name) {
	//	 this.name = name;
	// }
	 
	 public int getPrice() {
		 return price;
	 }
	 
	// public void setPrice(int price) {
	//	 this.price = price;
	//}
	 //출력 매소드
	 public void showInfo() {
		 System.out.printf("상품 이름: %s%n  가격: %d원 %n",name,price);
	 }

}
