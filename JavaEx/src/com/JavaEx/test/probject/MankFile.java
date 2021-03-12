package com.JavaEx.test.probject;

import java.io.File;

public class MankFile {

	private static String rootpath = System.getProperty("user.dir")+"\\files\\";
	private static String filename = rootpath+"TestProject.txt";
	
	protected static void MankFile() {
		File file = new File(rootpath);
		if(!file.exists()) {
			file.mkdir();
		}
		
		File file2 = new File(filename);
		System.out.println("file> "+filename);
		if(!file2.exists()) {
			try {
				file2.createNewFile();
			}catch(Exception e) {
				System.out.println("실패");
				e.printStackTrace();
			}
		}
	}
}
