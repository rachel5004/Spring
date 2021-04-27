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
	 	��� ������					��� �޼ҵ�(�Ű�����)
	 	
	 */
	@Before("execution(* com.sist.dao.BoardDAO.*(..))")
	public void getConnection(){
		// dao.getConnection();
		System.out.println("����Ŭ����");
	}
	@After("execution(* com.sist.dao.BoardDAO.*(..))")
	public void disConnection(){
		// dao.disConnection();
		System.out.println("����Ŭ��������");
	}
}
