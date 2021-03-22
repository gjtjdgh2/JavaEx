package com.JavaEx.Jdbc.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuthorDaoOraclelmpl implements AuthorDao {

	//공통 코드인 접속 코드 로직을 분리 합니다
	private Connection getConnection() throws SQLException{
		Connection conn = null;
		try {
			//드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl="jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dburl,"C##gjtjdgh","1234");
			
			System.out.println("드라이버 로드 성공");
		}catch(ClassNotFoundException e) {
			System.err.println("드라이버 불러오기 실패");
		}
		return conn;
	}
	
	@Override
	public List<AuthorVo> getList() {
		// 자바 객체를 이용 주고 받기 -> sql rs-> java 객채로 변화
		List<AuthorVo> list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			
			String sql = "select id,name,bio from author";
			rs=stmt.executeQuery(sql);
			
			
			while(rs.next()) {
				Long id =rs.getLong("id");
				String name = rs.getString("name");
				String bio = rs.getString("bio");
				
				//vo 객체 생성
				AuthorVo vo = new AuthorVo(id,name,bio);
				
				list.add(vo);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<AuthorVo> search(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthorVo get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(AuthorVo vo) {
		//매개변수 vo를 전달 받아서 author 테이블에 insert
		// insert, update,delete 수행시 executeUpdate 메서드 -> 결과 int(영한 레코드수)
		Connection conn=null;
		String sql = "insert into author values(seq_author.nextval,?,?)";
		int insertedCount =0;
		try {
			conn=getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		//파라메타 연결
		pstmt.setString(1, vo.getName());
		pstmt.setString(2, vo.getBio());
		
		insertedCount=pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
		return insertedCount ==1; //insert문장 성공 여부
		
	}

	@Override
	public boolean update(AuthorVo vo) {
		//vo 객체 전달 name ,bio 필드 교체
		Connection conn = null;
		PreparedStatement pstmt = null;
		int updateCount = 0;
		try {
			conn = getConnection();
			String sql = "update author set name=?,bio=? where id=?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,vo.getName());
			pstmt.setString(2, vo.getBio());
			pstmt.setLong(3, vo.getId());
			
			updateCount = pstmt.executeUpdate();
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return updateCount ==1;
	}

	@Override
	public boolean delete(Long id) {
		Connection conn=null;
		PreparedStatement pstmt = null;
		int deletedCount = 0;
		try {
			conn=getConnection();
			String sql = "delete from author where id =?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setLong(1,id);
		deletedCount = pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return deletedCount==1;
	}

}
