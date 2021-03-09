package com.JavaEx.exceptions;

import java.io.IOException;

public class ThorwsExcet {

	
	public void execteChhaecked() throws IOException {
		System.out.println("강제 체크드 예외 발생");
		//예외 발생
		throw new IOException("강제 예외");
		//IOException은 checked exception-> 반드시 필여
	}
	
	
	public void executeRuntime() {
		System.out.println("런타임 예외");
		throw new RuntimeException("런타임 익셉션");//unchecked 예외 = > 예외 처리를 강요하지 않는다
	}
	public double divide(int num1,int num2) {
		double result;
		try {
		result = (double)num1/num2;
		}catch(ArithmeticException e) {
			//예외 전환: 보다 구체적인것으로 전환
			throw new CustomArithmeticExcrption("사용장 정의 excrption",num1,num2);
		}
		return result;
	}
}
