package com.JavaEx.network.echoserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
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
			
			
			//.......... Working Thread end
			
			//클라이언트 정보 확인
			InetSocketAddress socketAddress= (InetSocketAddress)socket.getRemoteSocketAddress();//원격지 소켓
			System.out.println("SERVER: 쿨라이언트 연결됨");
			System.out.println("   클라이언트: "+socketAddress.getAddress()+" : "+socketAddress.getPort());
			
			//메시지 수신
			InputStream is = socket.getInputStream();
			Reader isr= new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			//Echo Back을 위한 OutputStream
			OutputStream os=socket.getOutputStream();
			Writer osw= new OutputStreamWriter(os,"UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			
			//메시지 읽어오기
			String message;
			
			while(true) {
				message = br.readLine();
				
				if(message == null) {//읽을 메시지 없음
					System.out.println("SERVER: 접속 종료");
					break;
				}
				System.out.println("SERVER: 수신 메시지: "+message);
				
				
				//echo Back 메시지 전송
				message = "Echo back";
				System.out.println("SERVER message: "+message);
				bw.write(message);
				bw.close();
			}
			//........ Working Thread logic end
			
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
