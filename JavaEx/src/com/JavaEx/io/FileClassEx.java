package com.JavaEx.io;

import java.io.File;
import java.io.IOException;

	//파일클래스
	//	파일의 정보를 확인
	//	파일,디렉터리를 생성 ,삭제 담당
	
public class FileClassEx {
	//현재 프로젝트 내의 루트 디렉터리 위치
	private static String rootPath = System.getProperty("user.dir")+"\\files\\";
	
	public static void main(String[] args) {
		//File 객체 생성
		File root = new File(rootPath);
		//퍼잎 실제 존재 확인
		System.out.println(rootPath+":"+root.exists());
		//만약 존재하지 않으면
		if(!root.exists()) {
			root.mkdir();
		}
		printInfo(root);
		
		//새로운 파일 생성 하고자 할때
		File file= new File(rootPath+"\\myFile.txt");//새파일이 생성된건 아니다
		System.out.println("=>myFile.txt");
		if(!file.exists()) {//파일이 없으면
			try {
			file.createNewFile();//실제 파일 샐성
			}catch(IOException e) {
				System.out.println("파일 만들지 못했음");
			}
		}
		printInfo(root);
		//파일 삭제
		file.delete();
		
		printInfo(root);
	}
	private static void printInfo(File file) {
		System.out.println("------------------");
		//file->directory->파일목록출력
		//     ->file->파일 정보 출력
		if(file.isDirectory()) {
			System.out.println("디렉터리: "+file.getName());
			//파밍 목록
			File[] files = file.listFiles();
		for(File f:files) {
	System.out.print(f.isDirectory() ? "d ":"f ");
	System.out.println(f.getName()+": "+f.length()); //file size
}
			}else {
				System.out.println("File: "+file.getName()+": "+file.length());
			}
		System.out.println("------------------");
	}

}
