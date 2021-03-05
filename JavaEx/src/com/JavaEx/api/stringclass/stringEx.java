package com.JavaEx.api.stringclass;

public class stringEx {

	public static void main(String[] args) {
		//stringbasic();
		usefulMethods();
	}
	
	public static void usefulMethods() {
		//String 다양한 매소드
		String scc="Java Programing , JavaScript Programing";
		System.out.println("원본: "+scc);
		
		//인댁스 접근
		System.out.println("length: "+scc.length());
		System.out.println("5번 인댁스의 글자"+scc.charAt(5));
		
		//변환 메서드
		System.out.println("모두 소문자"+scc.toLowerCase());
		System.out.println("모두 대문자"+scc.toUpperCase());
		
		//검색 메서드 중요
		int index=0;
		index = scc.indexOf("Java");
		System.out.println("1St search: "+index);
		index += "Java".length();//인덱스 글자 4칸 뒤로 이동
		
		index = scc.indexOf("Java",index);
		System.out.println("2St search: "+index);
		index = scc.indexOf("Java",index+"Java".length());
		System.out.println("3rd Seacrh"+index);//검색 내용이 없으면 -1
		
		index = scc.lastIndexOf("Java");
		System.out.println("역 방향: "+index);
		
		//추출
		System.out.println("16번 부터 끝까지"+scc.substring(18));
		System.out.println("18~22  "+scc.substring(18, 22));
		
		//치환 메서드
		System.out.println("Replace "+scc.replaceAll("Java","Python"));
		
		//변환 치환 추출 메서드를 수행해도 원본이 변경되지 않는다
		System.out.println("원본: "+scc);
		
		//Whitespace 제거
		String str = "                  Hello";
		System.out.println("trim: [ "+str.trim()+"]");
		
		//문자열 분열
		String words[]= scc.split(" ");
		for(String data: words) {
			System.out.println("chnk: "+data);
		}
		
		//문자열 비교:
		System.out.println("ABC".compareTo("ABD"));
		System.out.println("ABC".compareTo("ABC"));
		
	}

	private static void stringbasic() {
		String s1 = "Java";
		String s2 = new String("Java");
		String s3 = "Java";
		
		System.out.println("s1,s2 같은 객체?"+(s1==s2));
		System.out.println("s1,s3 같은 객체?"+(s1==s3));
		
		//String 은 char의 집합
		char letter[] = {'J','a','v','a'};
		String s4 = new String(letter);
		
		System.out.println("s4= "+s4);
		
//		String s5 = String.(3.14159f);
//		System.out.println("s5 "+s5);
	}
	
	
}
