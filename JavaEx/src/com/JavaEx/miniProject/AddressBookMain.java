package com.JavaEx.miniProject;

import java.io.*;


public class AddressBookMain {
	
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		AddressBookMakeFile makefile = new AddressBookMakeFile();
		makefile.AddressBookMakeFile();
		AddressBookIO iop = new  AddressBookIO();
		iop.IOProject();
	
	}


}

