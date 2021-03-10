package com.JavaEx.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamEx {

	//바이트 기반 스트림은 기본 데이터를 저장할수 없다
	//DataInputStream,DataOutputStream를 이용하면 기본타입을 사용할수 있다
	
	static final String rootpath = System.getProperty("user.dir")+"\\files\\";
	static final String filename= rootpath+"primitices.txt";
	
	public static void main(String[] args) {
		//exportPrimitives();
		importPrimitives();

	}
	//읽기
	private static void importPrimitives() {
		//메인 스트림
		InputStream is = null;
		
		//보조 스트림
		DataInputStream dis = null;
		try {
			is=new FileInputStream(filename);
			dis = new DataInputStream(is);
			
			for(int i=0;i<2;i++) {//2쌍의 데이터를 불러와 보자
				//출력 순서대로 불러 와야함
				System.out.println();
				String s = dis.readUTF();
				boolean b = dis.readBoolean();
				int val= dis.readInt();
				float f= dis.readFloat();
				
				
				System.out.printf("%s %b %d %f",s,b,val,f);
			}
		}catch(FileNotFoundException e) {
			System.out.println("파일못찾음");
			e.printStackTrace();
		}catch(IOException e) {
			
		}
		finally {
			try {
				dis.close();
			}catch(Exception e) {
				
			}
		}
	}
	
	
	//복사 (쓰기)
	private static void exportPrimitives() {
		//메인스트림
		OutputStream os =null;
		//보조 스트림
		DataOutputStream dos = null;
		System.out.println("복사 시작");
		try {
			os= new FileOutputStream(filename);
			dos = new DataOutputStream(os);
			//기본 타입 출력
			//순서 String Bolleaan Int float
			dos.writeUTF("홍길동"); //문자열
			dos.writeBoolean(true);
			dos.writeInt(25);
			dos.writeFloat(80.3f);
			
			dos.writeUTF("김거거"); //문자열
			dos.writeBoolean(false);
			dos.writeInt(30);
			dos.writeFloat(99.3f);
			System.out.println("복사끝");
		}catch(IOException e) {
			
		}finally {
			try {
				dos.close();
			}catch(Exception e) {
				
			}
		}
	}
	
}
