package com.sist.myapp;

public class Member {
	String name,sex;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void display(){
		System.out.println("member");
	}
     public void init()
     {
    	 System.out.println("==== 사원 정보 =====");
     }
}
