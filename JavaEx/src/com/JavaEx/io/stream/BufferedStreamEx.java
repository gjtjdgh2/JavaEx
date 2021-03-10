package com.JavaEx.io.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamEx {

	static final String rootpath = System.getProperty("user.dir")+"\\files\\";
	static final String source = rootpath+"img.jpg";
	static final String target = rootpath + "img_buffered_copy.jpg";
	public static void main(String[] args) {
		//main stream
		InputStream is = null;
		OutputStream os = null;
		
		//보조스트림
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			is = new FileInputStream(source);
			os= new FileOutputStream(target);
			
			bis = new BufferedInputStream(is);
			bos = new BufferedOutputStream(os);
			
			//버퍼를 생성
			byte[] data = new byte[1024]; //1KB
			int size =0; //받아온 데이터릐 길이
			
			System.out.println("복사 시작");
			while((size =bis.read(data)) != -1) {
				System.out.println(size+"바이트 복사했습니다");
				bos.write(data);
			}
			System.out.println("복사 완료");
			
		}catch (FileNotFoundException e) {
			System.out.println("파일 찾지못함");
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				//보조스트림은 주스트림을로부터 입출력 기능을 수ㅎㅇ하므로
				//보조스트림읗 닫아주면 주스트림도 닫힌다
				bis.close();
				bos.close();
			}catch(Exception e) {
				
			}
			
		}
		

	}

}
