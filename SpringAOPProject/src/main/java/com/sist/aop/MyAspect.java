package com.sist.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.sist.dao.BoardDAO;

@Aspect
@Component
public class MyAspect {
//	@Autowired
//	private BoardDAO dao;
	/*
	 	* com.sist.dao.BoardDAO.*(..)
	 	==						=====
	 	모든 리턴형					모든 메소드(매개변수)
	 	
	 */
	@Before("execution(* com.sist.dao.BoardDAO.*(..))")
	public void getConnection(){
		// dao.getConnection();
		System.out.println("오라클연결");
	}
	@After("execution(* com.sist.dao.BoardDAO.*(..))")
	public void disConnection(){
		// dao.disConnection();
		System.out.println("오라클연결해제");
	}
}
