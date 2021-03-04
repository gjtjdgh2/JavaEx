package com.JavaEx.oop.goods.v2;

public class GoodsApp {

	public static void main(String[] args) {
		Goods noteBook = new Goods();
		noteBook.setName("LG Gram"); 
		noteBook.setPrice(1500000);
		
		Goods smartphone = new Goods();
		smartphone.setName("iPon");
		smartphone.setPrice(650000);
		
		System.out.printf("%s %d \n",noteBook.getName(),noteBook.getPrice());
		noteBook.showInfo();
		
		System.out.printf("%s  %d",smartphone.getName(),smartphone.getPrice());
		noteBook.showInfo();
	}

}
