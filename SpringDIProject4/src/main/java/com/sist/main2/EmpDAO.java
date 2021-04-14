package com.sist.main2;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

/*
 	<bean id="dao" class="com.sist.main.EmpDAO"
		p:sqlSessionFactory-ref="ssf"
	/>
 */
@Repository("dao")
public class EmpDAO extends SqlSessionDaoSupport{
	
	
	@Resource(name="ssf")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	public List<EmpVO> empAllData(){
		return getSqlSession().selectList("empAllData");
	}
	public EmpVO empDetailData(int empno){
		return getSqlSession().selectOne("empDetailData",empno);
	}
}
