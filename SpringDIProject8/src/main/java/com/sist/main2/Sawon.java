package com.sist.main2;

import org.springframework.stereotype.Component;

// <bean id="ds" class="com.sist.main.Sawon">
// annotation은 DI 불가능
@Component("sa")
public class Sawon {
	private String name,sex;
	public Sawon() {
		name="홍길동";
		sex="남자";
	}
	public void print(){
		System.out.println(name+" "+sex);
	}
}
