package com.JavaEx.miniProject;
import java.util.*;

public class AddressBookIO {
	
public static void IOProject() {
	AddressBookSub sub = new  AddressBookSub();
	while(true){
		
		System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
		System.out.println("---------------------------------");
		System.out.print(">메뉴번호: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		switch(num) {
		case 1:System.out.println("<1.리스트>");
			sub.importPrimitives();
		
		break;
		
		case 2:System.out.println("<2.등록>");
		String name,PH,HH;
		System.out.print(">이름 : ");
		name = scan.next();
		System.out.print(">휴대전화 : ");
		PH=scan.next();
		System.out.print(">집전화 : ");
		HH=scan.next();
		sub.writeTextEx(name, PH, HH);
		
		System.out.println("[등록 되었습니다]");
		break;
		
		case 3:System.out.println("<삭제>");
		System.out.print(">번호 : ");
		int num2 = scan.nextInt();
		sub.deleteline(num2);
			System.out.println("[삭제 되었습니다]");
		break;	
		
		case 4:System.out.println("<4.검색>");
		System.out.print(">이름 : \n");
		String name2 = scan.next();
		sub.Search(name2);
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

