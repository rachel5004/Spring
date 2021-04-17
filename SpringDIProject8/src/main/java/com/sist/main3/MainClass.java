package com.sist.main3;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MainClass {
//	@Autowired
//	@Qualifier("oracle")  // 특정 객체 지정
	@Resource(name="mySql")
	DB db;
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("app3.xml");
		MainClass mc = (MainClass) app.getBean("mainClass");
		mc.db.select();
		mc.db.insert();
		mc.db.delete();
		mc.db.update();
	}

}
