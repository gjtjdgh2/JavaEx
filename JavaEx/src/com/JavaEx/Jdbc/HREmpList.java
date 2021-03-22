package com.JavaEx.Jdbc;

import java.sql.*;

public class HREmpList {

	public static void main(String[] args) {
	
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "hr","hr");
			
			String sql="select emp.first_name|| ' ' ||emp.last_name as name, "+
			"mgr.first_name|| ' ' ||mgr.last_name as mgr_name "+
					"from employees emp , employees mgr"+
			" where emp.manager_id = mgr.employee_id "+
					"order by name desc";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String empName = rs.getString("name");
				String mgrName = rs.getString(2);
				
				System.out.printf("Name: %sm Manager: %s%n",empName,mgrName);
			}

	}catch(ClassNotFoundException e) {
		System.err.println("드라이버 로드 실패");
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception e) {
			
		}
	}

}
}

