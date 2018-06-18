package com.inc.dairy.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.inc.dairy.domain.Dairy;

@Repository
public class DairyDao {
	@Autowired
	private SqlSession sqlSession;
	
	public List<Dairy> list(){
		return sqlSession.selectList("dairy.list");
	}
	
}
