package com.JavaEx.test.probject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Subproject {
	private static String rootpath = System.getProperty("user.dir")+"\\files\\";
	private static String filename = rootpath+"TestProject.txt";

	protected void Subproject() {
		
	}
	
	//2등록
	protected void Subcse(String name,String HP,String HH) {
		try {
			
		
		File file =new File(filename);
		FileWriter fw = new FileWriter(file,true);
		BufferedWriter bfw = new BufferedWriter(fw);
		
		bfw.write(name+",");
		bfw.write(HP+",");
		bfw.write(HH);
		bfw.newLine();
		
		bfw.close();
		fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				
			}catch(Exception e) {
		}
	}
}
	//1리스트
	protected void Search() {
		try {
		File file = new File(filename);
		FileReader fr = new FileReader(filename);
		BufferedReader bfr = new BufferedReader(fr);
		
		String line = "";
		while((line=bfr.readLine())!=null) {
			System.out.println(line);
			
		}
		
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	//4건색
	
	protected void sech(String nname) {
		try {
		File file = new File(filename);
		Reader fr = new FileReader(file);
		BufferedReader bfr= new BufferedReader(fr);
		
		String line = null;
		
		while((line=bfr.readLine())!=null) {
			if(line.toLowerCase().contains(nname)) {
				System.out.println(line);
			}
		}
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	protected void delPoint(int num) {
		
	}
	// 3삭제
	protected void delPiont(int num) {
		try {
		File file = new File(filename);
		Reader fr = new FileReader(file);
		BufferedReader bfr=new BufferedReader(fr);
		 String dummy = "";
		 String line;
		 for(int i=1;i<num;i++) {
			 line = bfr.readLine();
			 dummy+=(line+"\r");
		 }
		 String del = bfr.readLine();
		 System.out.println("삭제 한것> "+del);
		 
		 Writer wr=new FileWriter(filename);
		
		 while((line=bfr.readLine())!=null){
			 dummy+=(line+"\r");
		 }
		 
		 BufferedWriter bwr= new BufferedWriter(wr);
		 bwr.write(dummy);
		 
		 bwr.close();
		 bfr.close();
		 
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	
	
	
	
}
