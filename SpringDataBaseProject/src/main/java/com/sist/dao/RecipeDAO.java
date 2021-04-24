package com.sist.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.*;
@Repository
public class RecipeDAO extends SqlSessionDaoSupport{
    // Setter DI
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		// TODO Auto-generated method stub
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	/*
	 *   DML(SELECT , INSERT , UPADTE, DELETE)
	 *   �����ͺ��̽� ���α׷��� �÷������� �ƴϴ� , ROW(Record)
	 *   SELECT no,title,poster FROM recipe => selectList
	 *   SELECT no,title,poster FROM recipe WHERE no=1 => selectOne
	 *   => insert , update , delete
	 *   ������ ������ ���� ��� : ����ȭ (�ε���)
	 *   SELECT /*+ INDEX_ASC(recipe recipe_no_pk) * * FROM recipe
	 *   => SELECT * FROM recipe ORDER BY no ASC
	 *   
	 *   SELECT /*+ INDEX_DESC(recipe recipe_no_pk) * * FROM recipe
	 *   => SELECT * FROM recipe ORDER BY no DESC
	 */
	
	public List<RecipeVO> recipeListData(Map map)
	{
		return getSqlSession().selectList("recipeListData", map); // #{start} #{end}
	}
	
	public int recipeTotalPage()
	{
		return getSqlSession().selectOne("recipeTotalPage");
	}
    /*
     *   <select id="recipeDetailData" resultType="RecipeDetailVO" parameterType="int">
		    SELECT * FROM recipe_make
		    WHERE rno=#{rno}
		  </select>
     */
	public RecipeDetailVO recipeDetailData(int rno)
	{
		return getSqlSession().selectOne("recipeDetailData",rno);
	}
}














