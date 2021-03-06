package com.sist.dao;
/*
 * NO          NOT NULL NUMBER         
RNO                  NUMBER         
POSTER      NOT NULL VARCHAR2(260)  
CHEF        NOT NULL VARCHAR2(200)  
CHEF_POSTER NOT NULL VARCHAR2(260)  
TITLE       NOT NULL VARCHAR2(2000) 
CONTENT     NOT NULL VARCHAR2(4000) 
INFO1       NOT NULL VARCHAR2(20)   
INFO2       NOT NULL VARCHAR2(20)   
INFO3       NOT NULL VARCHAR2(20)   
FOOD_MAKE   NOT NULL CLOB           
CHEF_INFO   NOT NULL VARCHAR2(1000) 
 */
public class RecipeDetailVO {
    private int no,rno;
    private String chef,chef_poster,title,content,info1,info2,info3,food_make,chef_info,poster;
    
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getChef() {
		return chef;
	}
	public void setChef(String chef) {
		this.chef = chef;
	}
	public String getChef_poster() {
		return chef_poster;
	}
	public void setChef_poster(String chef_poster) {
		this.chef_poster = chef_poster;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getInfo1() {
		return info1;
	}
	public void setInfo1(String info1) {
		this.info1 = info1;
	}
	public String getInfo2() {
		return info2;
	}
	public void setInfo2(String info2) {
		this.info2 = info2;
	}
	public String getInfo3() {
		return info3;
	}
	public void setInfo3(String info3) {
		this.info3 = info3;
	}
	public String getFood_make() {
		return food_make;
	}
	public void setFood_make(String food_make) {
		this.food_make = food_make;
	}
	public String getChef_info() {
		return chef_info;
	}
	public void setChef_info(String chef_info) {
		this.chef_info = chef_info;
	}
   
}
