package com.sist.dao;

public class MusicVO {
	   private int no,cno; // MyBatis => 컬럼명과 멤버�? ?���? 
	   // ?��치하�? ?��?�� 경우?��?�� 반드?�� => as�? ?��?��?��?��
	   /*
	    *   1. �??��명과 컬럼?�� ??�? 경우 
	    *   2. SQL 문장 => id�? �??�� => ?��?��?�� id�? ??린경?�� 
	    *   3. SQL문장?��?�� ?���? 
	    *   ?��?��링과 마이바티?��?�� ?��?�� => ?���? �?증된 ?��?��브러�? 
	    */
	    private String title,singer,album,poster,state,idcrement;
		public int getNo() {
			return no;
		}
		public void setNo(int no) {
			this.no = no;
		}
		public int getCno() {
			return cno;
		}
		public void setCno(int cno) {
			this.cno = cno;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getSinger() {
			return singer;
		}
		public void setSinger(String singer) {
			this.singer = singer;
		}
		public String getAlbum() {
			return album;
		}
		public void setAlbum(String album) {
			this.album = album;
		}
		public String getPoster() {
			return poster;
		}
		public void setPoster(String poster) {
			this.poster = poster;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getIdcrement() {
			return idcrement;
		}
		public void setIdcrement(String idcrement) {
			this.idcrement = idcrement;
		}
	    
}
