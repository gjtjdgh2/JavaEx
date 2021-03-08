package com.JavaEx.api.generics.v2;

public class BoxEx {

	public static void main(String[] args) {
		GenericBox<String,Integer> intBox = new GenericBox<>();
		intBox.setKey("Integer");
		intBox.setContant(22222);
		String str = intBox.getKey();
		Integer intg = intBox.getContant();
		
		System.out.println("키 : "+str);
		System.out.println("Integer: "+intg);

}
}