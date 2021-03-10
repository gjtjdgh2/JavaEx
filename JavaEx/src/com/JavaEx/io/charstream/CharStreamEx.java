package com.JavaEx.io.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {

	static final String rootpath = System.getProperty("user.dir")+"\\files\\";
	static final String filename = rootpath+"byFule.txt";
	
	
	public static void main(String[] args) {
		//writeTextEx();
		readTextEx();

	}
	private static void readTextEx() {
		Reader reader= null;
		
		try {
			reader = new FileReader(filename);
			
			int data =0;
			while((data = reader.read())!=-1) {
				System.out.print((char)data);
			}
		}catch(FileNotFoundException e) {
			System.out.println("파일 찾지못함");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			}catch(Exception e){
				
			}
		}
	}
	
	
	private static void writeTextEx() {
		//문자 기반 출력 스트림의 최고 조상은 Writer
		Writer writer = null;
		try {
			writer =new FileWriter(filename);
			
			System.out.println("파일 열었습니다");
			writer.write("Bit Computer\r\n");
			writer.write("Java Programming\r\n");
			writer.write("2021.03");
			System.out.println("파일 기록끝");
			writer.flush();
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			}catch(Exception e) {
				
			}
		}
		
	}
	
}
