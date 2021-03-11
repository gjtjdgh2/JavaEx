package com.JavaEx.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdderssEx {

	public static void main(String[] args) {
		printLocalip();
		//서버 주소 확인
		 printServerIp("www.naver.com");
		 printServerIp("www.google.com");
	}

	private static void printServerIp(String hostname) {
		try {
			InetAddress[] adrs = InetAddress.getAllByName(hostname);
			for(InetAddress remote: adrs) {
				System.out.println(hostname+": IP: "+remote.getHostAddress());
			}
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
		
		
	}
	
	//내 컴퓨터가 하당 받은 ip확인(localhost)
	private static void printLocalip() {
		try {
			//내 ip 주소 확인
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("Local IP: "+local.getHostAddress());
		}catch(UnknownHostException e) {
			e.printStackTrace();
			
		}
		
	}
	
}
