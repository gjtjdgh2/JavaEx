package com.JavaEx.network.echoserver;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		//서버 소켓
		ServerSocket serversocket = null;
		
		try {
			// 바인드 -IP 연결
			serversocket = new ServerSocket();
			InetSocketAddress ips = new InetSocketAddress("0.0.0.0",10000);
			serversocket.bind(ips);
			
			//시작 메세지
			System.out.println("서버 연결 시작");
			System.out.println("연결을 기달립니다");
			
			//연결 대기
			Socket socket = serversocket.accept();
			
			//클라이언트 정보 확인
			InetSocketAddress socketAddress= (InetSocketAddress)socket.getRemoteSocketAddress();//원격지 소켓
			System.out.println("SERVER: 쿨라이언트 연결됨");
			System.out.println("   클라이언트: "+socketAddress.getAddress()+" : "+socketAddress.getPort());
			
			
			//후처리
			System.out.println("SERVER: 서버 종료");
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
			serversocket.close();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

	}}
