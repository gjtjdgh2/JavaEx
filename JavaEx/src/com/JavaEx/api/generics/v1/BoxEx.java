package com.JavaEx.api.generics.v1;

public class BoxEx {

	public static void main(String[] args) {
		Box box= new Box();
		box.setContant(2021);
		
		//값을 가저와 봅니다.
		int retval = box.getContant();
		System.out.println("내용물"+retval);
		
		StringBox strbox= new StringBox();
		strbox.setContant("Java");
		String str = strbox.getContant();
		System.out.println("str 박스 내용물"+str);
		
		
		ObjectBox obbox= new ObjectBox();
		obbox.setContant(2021);
		ObjectBox obbox2= new ObjectBox();
		obbox2.setContant("Javavava");
		
		//내용물을 가저 온다
		//데이터를 불러올떄 불편하고 위험하다
		Integer retval2 = (Integer)obbox.getContant();
		
		
		//Generic타입 GenericBox 로 설계된 클래스는 
		//new(인스턴스) 할떄 내부 테이터를 지정 할수있다
		GenericBox<Integer> intbos= new GenericBox<>();
		GenericBox<String> strbox1 = new GenericBox<>();
		
		intbos.setContant(2021);
		strbox1.setContant("ㅓㅁ");
		
		
	}

}
