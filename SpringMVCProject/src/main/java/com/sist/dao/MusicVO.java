package com.sist.dao;

public class MusicVO {
	   private int no,cno; // MyBatis => ì»¬ëŸ¼ëª…ê³¼ ë©¤ë²„ê°? ?¼ì¹? 
	   // ?¼ì¹˜í•˜ì§? ?•Š?Š” ê²½ìš°?—?Š” ë°˜ë“œ?‹œ => asë¥? ?‚¬?š©?•œ?‹¤
	   /*
	    *   1. ë³??ˆ˜ëª…ê³¼ ì»¬ëŸ¼?´ ??ë¦? ê²½ìš° 
	    *   2. SQL ë¬¸ì¥ => idë¥? ë¶??—¬ => ?‚¬?š©?‹œ idê°? ??ë¦°ê²½?š° 
	    *   3. SQLë¬¸ì¥?—?„œ ?˜¤ë¥? 
	    *   ?Š¤?”„ë§ê³¼ ë§ˆì´ë°”í‹°?Š¤?˜ ?¥?  => ?´ë¯? ê²?ì¦ëœ ?¼?´ë¸ŒëŸ¬ë¦? 
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
