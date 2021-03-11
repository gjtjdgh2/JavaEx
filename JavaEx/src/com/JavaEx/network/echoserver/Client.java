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
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			//소켓 객체 생성
			socket = new Socket();
			
			//시작 메세지
			System.out.println("클라이언트 시작");
			System.out.println("CLIENT: 연결을 요청합니다");
			
			//접속 시도
			InetSocketAddress remote = new InetSocketAddress("127.0.0.1",10000);
			socket.connect(remote);
			
			//접속 성공
			System.out.println("CLIENT: 서버에 연결됬습니다");
			
			//메세지 전송
			OutputStream os = socket.getOutputStream();//소켁에서 출력 스트림 횟득
			Writer osw = new OutputStreamWriter(os,"UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			String message = "테스트 메시지";
			bw.write(message);
			System.out.println("CLIENT: 전송 메시지: "+message);
			bw.flush();
			
			
//			//echo break 메시지 수신
			InputStream is = socket.getInputStream();
			Reader isr= new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
//			
//			//메시지 수신
//			String rcvmeg = br.readLine();
//			System.out.println("수신 메시지: "+rcvmeg);
			
//			br.close();
			
			//사용자로 부터 메시지 입력 받고 서버로 전달
			Scanner scanner = new Scanner(System.in);
			
			while(true) {
				System.out.print("CILENT> ");
				String messags = scanner.nextLine();
				if(messags.equals("/q")) {
					//탈출
					System.out.println("CILENT: 접속 종료");
					break;
				}
				System.out.println("CILENT: 메시지 전송: "+messags);
				bw.write(messags);
				bw.newLine();
				bw.flush();
				
				String rcvmeg = br.readLine();
				System.out.println("수신 메시지: "+rcvmeg);
			}
			
			
			
			
			
			
			
			
			//후처리
			System.out.println("클라이언트 종료");
			
			bw.close();
			
		}
		catch(ConnectException e) {
			System.err.println("접속 거부");
		}catch(IOException e) {
			
		}
		finally{
			try {
				socket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
