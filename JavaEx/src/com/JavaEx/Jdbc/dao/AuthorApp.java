package com.JavaEx.Jdbc.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AuthorApp {

	public static void main(String[] args) {
		listAuthors(); //검색
		
		//insertAuthors(); //넣는거
		//deleteAuthors(); //삭제
		updateAuthors();
		listAuthors();
	}
	
	private static void listAuthors() {
		AuthorDao dao = new AuthorDaoOraclelmpl();
		List<AuthorVo> list= dao.getList();
		//	Iterator 반복자 추출
		Iterator<AuthorVo> it = list.iterator();
		
		while(it.hasNext()) {
			AuthorVo vo = it.next(); //내용 불러 오기
			System.out.printf("%d,%s,%s%n",vo.getId(),vo.getName(),vo.getBio());
		}
		}
	
	private static void insertAuthors() {
		//scanner로 이름 bio 정보 입력 바아서 저장
		Scanner scan = new Scanner(System.in);
		System.out.print("이름: ");
		String name = scan.next();
		System.out.println("경력 ");
		String bio = scan.next();
		
		AuthorVo vo = new AuthorVo(name,bio);
		
		AuthorDao dao = new AuthorDaoOraclelmpl();
		boolean success = dao.insert(vo);
		
		System.out.println("Author insert:"+(success? "성공":"실패"));
		scan.close();
		
		
	}
	
	private static void deleteAuthors() {
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 작가:");
		long authorId = scan.nextLong();
		AuthorDao dao= new  AuthorDaoOraclelmpl();
		
		boolean success = dao.delete(authorId);
		System.out.println("Author delete:"+(success? "성공":"실패"));
		scan.close();
	}
	
	private static void updateAuthors() {
		Scanner scan = new Scanner(System.in);
		System.out.print("변경할 작가:");
		long authorId = scan.nextLong();
		System.out.print("변경할 이름:");
		String name = scan.next();
		System.out.print("변경할 경력:");
		String bio = scan.next();
		
		AuthorVo vo = new AuthorVo(authorId,name,bio);
		AuthorDao dao = new AuthorDaoOraclelmpl();
		boolean success = dao.update(vo);
		System.out.println("Author updae:"+(success? "성공":"실패"));
		scan.close();
}
}
