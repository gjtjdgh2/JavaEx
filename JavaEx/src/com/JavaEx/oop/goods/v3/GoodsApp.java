package com.JavaEx.oop.goods.v3;

public class GoodsApp {

	public static void main(String[] args) {
		//Goods noteBook = new Goods();
		Goods noteBook = new Goods("LG Gram",1500000);
		//noteBook.setName("LG Gram"); 
		//noteBook.setPrice(1500000);
		
		Goods smartphone = new Goods("iPon",6500000);
		//smartphone.setName("iPon");
		//smartphone.setPrice(650000);
		noteBook.showInfo();
		System.out.printf("%s %d \n",noteBook.getName(),noteBook.getPrice());
		noteBook.showInfo();
		
		System.out.printf("%s  %d",smartphone.getName(),smartphone.getPrice());
		noteBook.showInfo();
	}

}
