package com.JavaEx.miniProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;

public class subProject {
	
	private static String rootpath = System.getProperty("user.dir") + "\\";
	static final String filename= rootpath + "Phonenumber.txt";
	public  void subProject() {
		
	}
	
	//2 등록
	protected  void writeTextEx(String name,String PH,String HH) {
		//문자 기반 출력 스트림의 최고 조상은 Writer
		FileWriter writer = null;
		try {
			writer =new FileWriter(filename,true);
			BufferedWriter bw = new BufferedWriter( writer );
			
			
			bw.write(name+"\t");
			bw.write(PH+"\t");
			bw.write(HH);
			bw.newLine();
			
			bw.close();
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				
			}catch(Exception e) {
				
			}
		}
		
	}
	
	
	
	//1검색
	protected  void importPrimitives() {
		try {
		File file = new File(filename);
		FileReader fr = new FileReader(file);
		BufferedReader br= new BufferedReader(fr);
		
		
		String line="";
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
		
		}catch (FileNotFoundException e) {
		}catch(IOException e){
            System.out.println(e);
		}
		}
	
	
	//4검색
	protected void Search(String name) {

		try {
			Reader reader = new FileReader(filename);
			BufferedReader br=new BufferedReader(reader);
			
		//편의 기능으로 한줄 단위 입출력 할수있다
		String line=null;
		
		
		while((line=br.readLine()) != null){
			//입력 받을것으로 불러오기
			//System.out.println(line);
			if(line.toLowerCase().contains(name)) {
				System.out.println(line);
				
				
			}
		}
		br.close();
		}catch(FileNotFoundException e) {
			System.err.println("파일 찾지못함");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				
			}catch(Exception e) {
		}}}
	
	
	
	//3삭제
	protected void deleteline(int num) {
		
		File file = new File(filename);
		String dummy="";
		try {
			BufferedReader br= new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		//	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
			String line;
			
			for(int i=1;i< num;i++) {
				line = br.readLine();
				dummy +=(line+ "\r");
				
			}
			
			String del = br.readLine();
			System.out.print("삭제된것:" +del+"\n");
			while((line = br.readLine())!=null){
				dummy +=(line+"\r");
				
			}
			FileWriter fw= new FileWriter(file);
			fw.write(dummy);
			
			fw.close();
			br.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	}
	



