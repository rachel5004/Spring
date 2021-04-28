package com.sist.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
/*
 *    ������ : id�� ������ ã�´� 
 *           <bean id="" class="">
 *           @Component("id��") => id�� �������� �ʴ� ��� Ŭ�������� id���ȴ�
 *                                �� ù���ڴ� �ҹ��� 
 *                                BoardDAO => boardDAO
 *           => id�� �ߺ� �� �� ���� (���� => Map�� ���� => id�� key)
 *           public class A
 *    ���̹�Ƽ��  : SQL������ ã�� (id) => �ߺ��� �� �� ���� 
 *    Ÿ���� : Controller���� �Ѱ��� return�� 
 *           public String disp() {
 *              return "board/list";
 *           }
 *           => board/list => � ȭ���� �������� ���� 
 *           => Tiles�� ����=> ���� ������ �ִ� (�ܵ�����) 
 *           
 *           <definition name="main" template="/WEB-INF/main/main.jsp">
			    <put-attribute name="header" value="/WEB-INF/main/header.jsp"/>
			    <put-attribute name="nav" value="/WEB-INF/main/nav.jsp"/>
			    <put-attribute name="content" value="/WEB-INF/main/content.jsp"/><!-- ����Ǵ� ���� -->
			    <put-attribute name="footer" value="/WEB-INF/main/footer.jsp"/>
			    <put-attribute name="copy" value="/WEB-INF/main/copy.jsp"/>
			  </definition>
			  <!-- 
			      board/list
			   -->
			  <definition name="board/list" extends="main">
			    <put-attribute name="content" value="/WEB-INF/{1}/{2}.jsp"/>
			  </definition>
			     
			  return "login" return "login_ok";  name="*" ajax => �ܵ����� 
 *    =============> ��Ű�� ������ Ŭ���� ��� 
 *    <context:component-scan base-package="com.sist.*">
 *    1. ������̼��� �̿��� �޸� �Ҵ� ��û 
 *       @Component
 *       @Service
 *       @Repsitory
 *       @Controller
 *       @RestController
 *    2. ������̼��� �̿��� ���� 
 *       @Autowired
 *       @Resource(name="id��")
 */
@Repository
public class MovieDAO extends SqlSessionDaoSupport{

	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

   public List<MovieVO> movieAllData(Map map) {
	   return getSqlSession().selectList("movieAllData",map);
   }
   public int movieAllTotalPage() {
	   return getSqlSession().selectOne("movieAllTotalPage");
   }
   public List<MovieVO> movieFindData(Map map) {
	   return getSqlSession().selectList("movieFindData", map);
   }
   public int movieFindTotalPage(String keyword) {
	   return getSqlSession().selectOne("movieFindTotalPage", keyword);
   }
   
}














