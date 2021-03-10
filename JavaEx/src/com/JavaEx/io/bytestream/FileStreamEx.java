package com.JavaEx.io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamEx {

		static final String rootpath = System.getProperty("user.dir")+"\\files\\";
		static final String source = rootpath+"img.jpg";
		static final String target = rootpath+"imp_copy.jpg";
		
	public static void main(String[] args) {
		
			InputStream is=null;
			OutputStream os=null;
			
			try {
				is = new FileInputStream(source);
				os= new FileOutputStream(target);
				
				int data =0;
				System.out.println("복사를 시작합니다....");
				while((data = is.read()) !=-1) {
					os.write(data);
				}
				System.out.println("복사 종료....");
			}catch(FileNotFoundException e) {
				System.err.println("파일 못찾음");
			}
			catch (IOException e) {
				System.err.println("복사 실패");
				e.printStackTrace();
			}try {
				os.close();
				is.close();
			}catch (IOException e) {
				
			}
	}

}
