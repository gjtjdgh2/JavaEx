package com.JavaEx.test.probject;

import java.util.Scanner;

public class IOProject {
	
protected static void IOProject() {
	Subproject sub = new Subproject();
	while(true) {
		System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
		System.out.println("---------------------------------");
		System.out.print(">메뉴번호: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		switch(num) {
		case 1:System.out.println("<1.리스트>");
		sub.Search();
	
	break;
	
	case 2:System.out.println("<2.등록>");
	String name,PH,HH;
	System.out.print(">이름 : ");
	name = scan.next();
	System.out.print(">휴대전화 : ");
	PH=scan.next();
	System.out.print(">집전화 : ");
	HH=scan.next();
	sub.Subcse(name, PH, HH);
	
	System.out.println("[등록 되었습니다]");
	break;
	
	case 3:System.out.println("<삭제>");
	System.out.print(">번호 : ");
	int num2 = scan.nextInt();
	sub.delPiont(num2);
		System.out.println("[삭제 되었습니다]");
	break;	
	
	case 4:System.out.println("<4.검색>");
	System.out.print(">이름 : ");
	String nname = scan.next();
		sub.sech(nname);
	
	break;	
	
	
	case 5:
		System.out.println("********************");
		System.out.println("*      감사합니다     *");
		System.out.println("********************");
	break;
	
	default: System.out.println("[다시 입력해주세여]");
		
	}
	if(num == 5){ 
		break;
	}
		
	}
}
}
