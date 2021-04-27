package com.sist.dao;

import org.springframework.stereotype.Repository;
/*
 	AOP(Ⱦ������ ���α׷�) : �м��� ��ƴ� => ���������� �����ϴ� �α�����,Ʈ������,����
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
//		getConnection();  //�ݺ�
		System.out.println("select fin");  //�ٽɸ��(spring���� �ٽ� �ܴ� �ڵ�ȭ)
//		disConnection();  //�ݺ� =>������:���ɻ�
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
