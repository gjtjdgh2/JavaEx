package com.JavaEx.miniProject;

import java.io.File;
import java.io.IOException;

public class AddressBookMakeFile {
	private static String rootpath = System.getProperty("user.dir");
	
	
		
	
	
	public static void AddressBookMakeFile() {
		File file = new File(rootpath);
		System.out.println(rootpath+":"+file.exists());
		if(!file.exists()) {
			file.mkdir();
		}
		System.out.println(file.getName());
		
	
	
		//
		File file2= new File(rootpath+"\\"+
				 "Phonenumber.txt");//새파일이 생성된건 아니다
		System.out.println("=>Phonenumber.txt "+file2.exists());
		if(!file2.exists()) {//파일이 없으면
			try {
			file2.createNewFile();//실제 파일 샐성
			}catch(IOException e) {
				System.out.println("파일 만들지 못했음");
			}
		}
		
		
	}
}