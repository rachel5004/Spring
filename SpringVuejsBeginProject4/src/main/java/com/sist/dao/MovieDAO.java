package com.sist.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.*;
@Repository
public class MovieDAO extends SqlSessionDaoSupport{
	// SqlSessionFactory
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
    
	public List<MovieVO> movieListData(Map map) {
		List<MovieVO> list=null;
		try {
			list=getSqlSession().selectList("movieListData",map);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}
	
	public int movieTotalPage(Map map) {
		int total=0;
		try {
			total=getSqlSession().selectOne("movieTotalPage",map);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return total;
	}
	public MovieVO movieDetailData(int mno) {
		MovieVO vo = null;
		try{
			vo=getSqlSession().selectOne("movieDetailData",mno);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return vo;
	}
   
}






