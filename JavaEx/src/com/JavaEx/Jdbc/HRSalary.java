package com.JavaEx.Jdbc;

import java.sql.*;
import java.util.Scanner;
public class HRSalary {

	public static void main(String[] args) {
//		[실습 3] 급여 검색 프로그램 작성
//		: 사용자로부터 최소 급여와 최대 급여를 입력 받아 급여가 이 범위 내에 속하는 사원
//		의 정보를 출력하는 프로그램을 작성해 봅시다
//		 정렬은 salary 오름차순입니다
//		 HRSalary 프로젝트의 HRSalary 클래스에서 실행되어야 합니다
		
		Scanner scan = new Scanner(System.in);
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		System.out.print("최소급여: ");
		int minSalary = scan.nextInt();
		System.out.print("최대급여: ");
		int maxSalary = scan.nextInt();
		if(minSalary>maxSalary) {
			//두값 swap
			int temp = maxSalary;
			maxSalary = minSalary;
			minSalary = temp;
		}
		scan.close();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "hr","hr");
			
			String sql = "select first_name, last_name, salary from employees where salary between ? and ?"+
			"order by salary";
			pst=conn.prepareStatement(sql);
			//동적 데이터 연결
			pst.setInt(1,minSalary);
			pst.setInt(2,maxSalary);
			rs = pst.executeQuery();
			
			// "last_name"  "first_name"
			while(rs.next()) {
				System.out.printf("%s %s, %d%n",rs.getString(1),rs.getString(2),rs.getInt(3));
			}
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 오류");
		}catch(SQLException e){
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
