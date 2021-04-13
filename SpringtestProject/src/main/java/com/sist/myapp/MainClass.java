package com.sist.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
		public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("app.xml");
		Sawon s = (Sawon)app.getBean("sa");
		System.out.println("sa"+s);
		System.out.println(s.getName());
		System.out.println(s.getSex());
		Sawon s1 = (Sawon) app.getBean("sa");
		System.out.println("sa1"+s1);
		
	}
}
