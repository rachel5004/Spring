package com.sist.main;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface EmpMapper {
	@Select("SELECT empno,ename,job,hiredate,sal FROM emp")
	public List<EmpVO> empListData();
}
