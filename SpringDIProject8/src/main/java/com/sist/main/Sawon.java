package com.sist.main;

public class Sawon {
	private String dept,loc;
	private Saram saram;
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Saram getSaram() {
		return saram;
	}
	public void setSaram(Saram saram) {
		this.saram = saram;
	}
	public void print(){
		System.out.println(saram.getName()+" "+saram.getSex()+" "+saram.getAge());
		System.out.println("부서: "+dept);
		System.out.println("근무지: "+loc);
	}
}
