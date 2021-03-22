package com.JavaEx.Jdbc;

import java.sql.*;

import java.util.Scanner;

public class HRSearchEmployeesPstmt {

	
//	[실습 2] 사원 검색 프로그램
//	: 클래스 Scanner를 사용하여 사원 이름을 입력 받아 사원 정보를 검색하는 프로그램
//	을 작성해 봅시다
//	 부분 이름 검색이 가능해야 합니다
//	 성, 이름 컬럼에 대해 OR 검색이 되어야 합니다
//	 출력 사원 정보는 이름 성, Email, 전화번호, 입사일입니다
//	 HRSearchEmployees 프로젝트를 만들고 HRSearchEmployee 클래스에서 실행되어야 합니다
	
	public static void main(String[] args) {
		//preparedStatement를 이용한 실행 계획 준비
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("이름입력: ");
			String scannstr = scan.next();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "hr","hr");
		/*	
			//보안상 위험이 있고 가독성을 해침
			String sql = "select first_name||' '||last_name as name, email,phone_number, hire_date "+
		"from employees where  lower(first_name) like '%"+scannstr+"%' or  lower(last_name) like '%"+scannstr+"%'";
			
	*/
					
//			stmt = conn.createStatement();
//			rs= stmt.executeQuery(sql);
			String sql = "select first_name, last_name,email,phone_number,hire_date "+
"from employees where lower(first_name) like ? or lower(last_name) like ?";
			pst = conn.prepareStatement(sql); //실행 계획 준비
			//동적 파라미터 설정
			pst.setString(1, "%"+scannstr+"%");
			pst.setString(2, "%"+scannstr+"%");
			
			//쿼리 수행
			rs=pst.executeQuery();
			while(rs.next()) {
				
				
				System.out.printf("%s %s, %s , %s , %s %n",rs.getString("first_name"),rs.getString("last_name"),rs.getString("email"),rs.getString("phone_number"),
						rs.getString("hire_date"));
			}
		}catch(ClassNotFoundException e) {
			System.err.println("드라이버 실패");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pst.close();
				conn.close();
			}catch(Exception e) {
				
			}
	}
		
	}

}
