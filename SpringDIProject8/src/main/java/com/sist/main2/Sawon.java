package com.sist.main2;

import org.springframework.stereotype.Component;

// <bean id="ds" class="com.sist.main.Sawon">
// annotation�� DI �Ұ���
@Component("sa")
public class Sawon {
	private String name,sex;
	public Sawon() {
		name="ȫ�浿";
		sex="����";
	}
	public void print(){
		System.out.println(name+" "+sex);
	}
}
