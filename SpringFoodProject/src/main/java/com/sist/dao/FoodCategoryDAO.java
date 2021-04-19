package com.sist.dao;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.sist.vo.FoodCategoryVO;

@Repository
public class FoodCategoryDAO extends SqlSessionDaoSupport{
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	public List<FoodCategoryVO> foodCategoryListData(Map map){
		return getSqlSession().selectList("foodCategoryListData",map);
	}
	public FoodCategoryVO foodCategoryInfoData(int no){
		return getSqlSession().selectOne("foodCategoryInfoData",no);
	}

}
