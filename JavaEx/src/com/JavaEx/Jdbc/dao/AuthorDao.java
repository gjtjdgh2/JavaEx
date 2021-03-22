package com.JavaEx.Jdbc.dao;

import java.util.List;

//설계 규약
//	interface를 implements 한 모든 객체는 내부의 추상 메서드를 모두 override 해야한다
public interface AuthorDao {

	public List<AuthorVo> getList();
	public List<AuthorVo> search(String keyword);
	public AuthorVo get(Long id);
	public boolean insert(AuthorVo vo);
	public boolean update(AuthorVo vo);
	public boolean delete(Long id);
	
	
}
