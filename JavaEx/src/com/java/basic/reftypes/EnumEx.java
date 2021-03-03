package com.java.basic.reftypes;

public class EnumEx {

	public static void main(String[] args) {
		//enumTest();
		//enumTest2();

	}

	private static void enumTest2() {
		Week today = Week.WEDNESDAY;
		String message;
		
		switch(today) {
		case SUNDAY:
			message = "일요일";
			break;
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
			message = "열공";
			break;
		case FRIDAY:
			message= "불금";
			break;
		case SATURDAY:
			message="주말";
			break;
		default:
			message = "?";
		
		}
		System.out.printf("%s 에는 %s%n",today.name(),message);
	}
	
	private static void enumTest() {
		Week today = Week.WEDNESDAY;
		
		System.out.printf("Today is %s(%d)%n",today.name(),today.ordinal());
		Week other = Week.valueOf("FRIDAY");
		System.out.printf("other is %s(%d)%n",other.name(),other.ordinal());
		
		System.out.println(other.compareTo(today));//두 열거의 순번차
		
		Week[] days =Week.values(); // Week enum의 모든 열거 상수를 반환
		
		for(int i=0;i<days.length;i++) {
			System.out.printf("%s(%d)%n",days[i].name(),i);
		}
				
	}
}
