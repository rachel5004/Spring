package com.sist.dao;
import java.util.*;
import com.sist.vo.*;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FoodHouseDAO extends SqlSessionDaoSupport{
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	public List<FoodHouseVO> foodHouseData(int cno){
		return getSqlSession().selectList("foodHouseData",cno);
	}
	public FoodHouseVO foodHouseDetailData(int no){
		return getSqlSession().selectOne("foodHouseDetailData",no);
	}
}
