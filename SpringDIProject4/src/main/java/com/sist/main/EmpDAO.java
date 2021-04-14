package com.sist.main;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class EmpDAO extends SqlSessionDaoSupport{
	public List<EmpVO> empAllData(){
		return getSqlSession().selectList("empAllData");
	}
	public EmpVO empDetailData(int empno){
		return getSqlSession().selectOne("empDetailData",empno);
	}
}
