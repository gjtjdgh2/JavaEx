package com.JavaEx.oop.goods.v1;

public class GoodsApp {

	public static void main(String[] args) {
		Goods noteBook = new Goods();
		noteBook.name ="LG Gram";
		noteBook.price = 1500000;
		
		Goods smartphone = new Goods();
		smartphone.name = "iphone";
		smartphone.price = 650000;
		
		System.out.printf("%s %d \n",noteBook.name,noteBook.price);
		System.out.printf("%s  %d",smartphone.name,smartphone.price);
	}

}
