package com.JavaEx.api.a;

import java.util.Calendar;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		//dateclassEx();
		calendarEx();
		
		
	}
	
	private static void calendarEx() {
		Calendar bow = Calendar.getInstance();
		Calendar custom = Calendar.getInstance();
		
		System.out.printf("현재: %d년 %d월 %d일 %n",
				bow.get(Calendar.YEAR),bow.get(Calendar.MONTH)+1,
				bow.get(Calendar.DATE));
		
		//년월일 정보를 알고 싶을떄
		custom.set(2012,8,24);//년 월-1,일
		System.out.printf("현재: %d년 %d월 %d일 %n",custom.get(Calendar.YEAR),
				custom.get(Calendar.MONTH),custom.get(Calendar.DATE));
		
		//날짜의 연산
		Calendar future = Calendar.getInstance();
		//100일뒤 날짜
		future.add(Calendar.DATE, 100);
		System.out.printf("현재: %d년 %d월 %d일 %n",
				future.get(Calendar.YEAR),future.get(Calendar.MONTH)+1,
				future.get(Calendar.DATE));
		//이날은 무슨 요일이까?
		//Calendar.DAY_OF_WEEK:1(일)~7(토)
		int dow = future.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일: "+dow);
		
		String dowstr;
		
		switch(dow) {
		case Calendar.SUNDAY:
			dowstr = "일요일";
			break;
		case Calendar.MONDAY:
			dowstr = "월요일";
			break;
		case Calendar.TUESDAY:
			dowstr = "화요일";
			break;
		case Calendar.WEDNESDAY:
			dowstr = "수요일";
			break;
		case Calendar.THURSDAY:
			dowstr = "목요일";
			break;
		case Calendar.FRIDAY:
			dowstr = "금요일";
			break;
		case Calendar.SATURDAY:
			dowstr = "토요일";
			break;
		default: 
			dowstr="?";
		}
		
		System.out.println(dowstr);
	}
	
	//날짜 시간
	private static void dateclassEx() {
		
		Date now = new Date();
		System.out.println("현재: "+now);
		
	}
	
	
	

}
