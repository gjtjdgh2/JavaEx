package com.JavaEx.exceptions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		 //exceptionEx();
		// arrayExceptionEx();
		//nullPointerExceptionEx();
		thowException();
		
		 System.out.println("End of Code! ");

	}
	private static void thowException() {
		ThorwsExcet except= new ThorwsExcet();
		//unchecked 예외 처리
		try {
		//except.executeRuntime();
		except.divide(100, 0);
		}catch(CustomArithmeticExcrption e) {
			System.err.println("메시지: "+e.getMessage());
			
		}
		catch(RuntimeException e) {
			//호출된 메서드 내에서 발생한 예외를 이곳에서 처리
			System.err.println("호출된 메서드에서 unceahed 예외 발생");
			System.err.println("메시지: "+e.getMessage());
		}
		
		
		//checked 예외 처리
//		try {
//			except.execteChhaecked();
//		}catch(IOException e) {
//			System.err.println("호출된 메서드에서 checked 예외 발생");
//			System.err.println("메시지: "+e.getMessage());
//		}
	}
	
	private static void nullPointerExceptionEx() {
		//가장 흔하고 가장 위험한 오류
		String str = new String("Hello");
		str=null;//참조 해제
		try {
			System.out.println(str.toString());
		} catch(NullPointerException e) {
			System.out.println("에러 메세지: " +e.getMessage());
			System.out.println("Null");
		}
		
		
		
	}
	
	private static void arrayExceptionEx() {
		int[] intArray = new int[] {3,6,9};
		try {
		System.out.println(intArray[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 오버");
			System.out.println("메시지: "+e.getMessage());
			System.out.println("발생한 예외 " + e.getClass().getSimpleName());
		}
	}
	
	private static void exceptionEx() {
		//키보드로 부터 정수를 입력
		//100을 입력 받은 수로 나눠 봅시다
		double result=0;
		int num;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세여");
		try {
			//예외 발생 가능 코드
		num = scan.nextInt();
		result=100/num;
		}catch(InputMismatchException e) {
			System.out.println("정수가 아니다");
		}
		catch(ArithmeticException e) {
			//구체적인 코드 여기에
			System.out.println("0으론 나눌순 없다");
			System.out.println("메시지: "+e.getMessage());
			
		}
		catch (Exception e) {//모든 예외 최상의 클래스
			e.printStackTrace(); //에러 코드 출력
			System.out.println("오류");
			
		}finally{
			System.out.println("finally");
		}
		
		System.out.println("결과: "+result);
		scan.close();
	}
	
	
	
	
	
	
}
