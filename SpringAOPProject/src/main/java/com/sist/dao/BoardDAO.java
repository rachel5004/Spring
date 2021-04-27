package com.sist.dao;

import org.springframework.stereotype.Repository;
/*
 	AOP(횡단지향 프로그램) : 분석이 어렵다 => 스프링에서 지원하는 로그파일,트랜젝션,보안
 */
@Repository
public class BoardDAO {
	public void getConnection(){
		System.out.println("connected");
	}
	public void disConnection(){
		System.out.println("disconnected");
	}
	public void aopselect(){
//		getConnection();  //반복
		System.out.println("select fin");  //핵심모듈(spring으로 핵심 외는 자동화)
//		disConnection();  //반복 =>공통모듈:관심사
	}
	public void aopinsert(String name){
		System.out.println("insert "+name+" fin");
	}
	public void aopupdate(){
		System.out.println("update fin");
	}
	public void aopdelete(){
		System.out.println("delete fin");
	}
	public String aopfind(){
		System.out.println("select~find fin");
		return "hong";
	}
}
