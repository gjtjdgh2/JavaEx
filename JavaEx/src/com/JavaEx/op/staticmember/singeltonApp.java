package com.JavaEx.op.staticmember;

public class singeltonApp {

	public static void main(String[] args) {
//		singelton s1 = new singelton();
		singelton s1= singelton.getInstance();
		singelton s2= singelton.getInstance();
		
		System.out.println("s1 -> "+s1);
		System.out.println("s2 -> "+s2);
		
		System.out.println("s1과 s2는 같은 객체? "+(s1 ==s2));
	}

}
