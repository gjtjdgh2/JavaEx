package com.JavaEx.io.charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;
public class StringTokenizerEx {

	static final String rootpath = System.getProperty("user.dir")+"\\files\\";
	static final String filename = rootpath+"thieves.txt";
	public static void main(String[] args) {
		//메인 스트림
		Reader reader = null;
		//보조 스트림
		BufferedReader br =null;
		
		try {
			reader = new FileReader(filename);
			br= new BufferedReader(reader);
			
			String line = null;
			while((line=br.readLine()) != null) {
				//line을 분절
				StringTokenizer st = new StringTokenizer(line," "); //""기본 갑은 공백,, 기본값 \t,\n,\r
				
				while(st.hasMoreTokens()) {
					String token = st.nextToken();
					System.out.print(token + " ");
					
				}
				System.out.println();
			}
		}catch(FileNotFoundException e){
			System.out.println("파일 못찾음");
		}
		catch(IOException e) {
			
		}
				finally {
			try {
				br.close();
			}catch(Exception e) {
				
			}
		}

	}

}
