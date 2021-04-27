package com.sist.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import com.sist.dao.BoardDAO;

@Component
public class MainClass {
	@Autowired
	private BoardDAO dao;
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("app.xml");
		MainClass mc = (MainClass) app.getBean("mainClass");
		mc.dao.aopselect();
		mc.dao.aopinsert("Ω…√ª");
		mc.dao.aopupdate();
		mc.dao.aopdelete();
		mc.dao.aopfind();
	}
}
