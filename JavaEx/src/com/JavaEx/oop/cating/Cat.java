package com.JavaEx.oop.cating;

public class Cat extends Animal {
	//생성자
		public Cat(String name) {
			super(name);
		}
		
		public void meow() {
			System.out.println(name+"이 고양이가 야옹 울름");
		}
}
