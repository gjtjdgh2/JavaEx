package com.JavaEx.Jdbc;

import java.sql.*; //sql 패키니내 모든 클래스
public class ConnectionTest {

	private static String  DBURL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String  DBUSER = "hr"; //접속 계정
	private static String  DBPASS = "hr";
	public static void main(String[] args) {
		//1.트라이버 로드
		//2.커넥션 확보
		Connection conn = null;
		try {
			//드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//커넥션 확보
			conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS); //경로 , 아이디 ,비번
			System.out.println("접속정보: "+conn);
			System.out.println("접속성공");
		}catch(ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패");
		}catch(SQLException e) {
			System.err.println("SQLError");
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}

	}


