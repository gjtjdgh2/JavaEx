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
import java.net.Socket;

public class ServerThread extends Thread {
	//실제 통신 담당 쓰레드
	private Socket socket;

	//생성자
	public ServerThread(Socket socket) {
		this.socket=socket;
	}

	@Override
	public void run() {
		try {
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
		
	
	}catch (IOException e) {
		e.printStackTrace();
	}
		super.run();
	}
	
}
