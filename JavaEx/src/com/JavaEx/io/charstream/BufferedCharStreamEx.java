package com.JavaEx.io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharStreamEx {

	static final String rootpath = System.getProperty("user.dir")+"\\files\\";
	static final String source = rootpath+"last-leaf.txt";
	static final String target = rootpath+"last-leaf-filtered.txt";
	
	public static void main(String[] args) {
		//main stream
		Reader reader = null;
		Writer writer = null;
		
		//보조 스트림
		BufferedReader br= null;
		BufferedWriter bw = null;
		System.out.println("읽어 옵니다");
		
		try {
			reader = new FileReader(source);
			writer = new FileWriter(target);
			
			br=new BufferedReader(reader);
			bw=new BufferedWriter(writer);
		//편의 기능으로 한줄 단위 입출력 할수있다
		String line=null;
		
		
		while((line=br.readLine()) != null){
			//일긍ㄴ 라인중 leaf or leaves 단어를 포함한 라인만
			System.out.println(line);
			if(line.toLowerCase().contains("leaves")) {
				System.out.println(line);
				bw.write(line); 
				bw.newLine();//줄단위 출력
			}
		}
		
		}catch(FileNotFoundException e) {
			System.err.println("파일 찾지못함");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				bw.close();
			}catch(Exception e) {
		}
		
		
		

	}

}
}
