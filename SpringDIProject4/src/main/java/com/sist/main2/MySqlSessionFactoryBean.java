package com.sist.main2;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

/*
	<bean id="ssf" class="org.mybatis.spring.SqlSessionFactoryBean"
		p:dataSource-ref="ds"
		p:configLocation="classpath:config.xml"
	/>
 */
@Component("ssf")
public class MySqlSessionFactoryBean extends SqlSessionFactoryBean{
	
	//@Autowired  // �ڵ� ����
	@javax.annotation.Resource(name="ds")
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}
	public MySqlSessionFactoryBean(){
		try{
			Resource res = new ClassPathResource("config.xml");
			setConfigLocation(res);
		}catch (Exception e) {
		}
	}
}
