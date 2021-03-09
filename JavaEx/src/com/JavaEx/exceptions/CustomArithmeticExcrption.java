package com.JavaEx.exceptions;

public class CustomArithmeticExcrption extends ArithmeticException {
	//필드
	private int num1,num2;
	
	//생성자
	public CustomArithmeticExcrption(String message, int num1,int num2) {
		//부머 생성자
		super(message);
		this.num1 =num1;
		this.num2=num2;
		
	
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

}
