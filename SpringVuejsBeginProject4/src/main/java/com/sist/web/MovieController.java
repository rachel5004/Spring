package com.sist.web;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.sist.dao.*;
@RestController
public class MovieController {
   @Autowired
   private MovieDAO dao;
   
   @GetMapping(value="movie/list.do",produces="text/plain;charset=UTF-8")
   public String movie_list(String page,String type,String ss) {
	   String json="";
	   try {
		   if(page==null)
			   page="1";
		   int curpage=Integer.parseInt(page);
		   Map map=new HashMap();
		   int rowSize=12;
		   int start=(rowSize*curpage)-(rowSize-1);
		   int end=rowSize*curpage;
		   
		   map.put("start", start);
		   map.put("end", end);
		   map.put("type", type);//<select> : column (title , genre , actor , all)
		   map.put("ss", ss);//<input type=text>
		   
		   List<MovieVO> list=dao.movieListData(map);
		   JSONArray arr=new JSONArray();
		   // VO=JSONObject {}
		   // [{mno: , title:},{}...]
		   /*
		    *    let a={} => a�뒗 媛앹껜  ==> JSONObject
		    *    let a=[] => 諛곗뿴 ==> JSONArray
		    */
		   for(MovieVO vo:list) {
			  JSONObject obj=new JSONObject();
			  obj.put("mno", vo.getMno());
			  obj.put("title", vo.getTitle());
			  obj.put("poster", vo.getPoster());
			  obj.put("genre", vo.getGenre());
			  obj.put("actor", vo.getActor());
			  arr.add(obj);
		   }
		   json=arr.toJSONString();
	   }catch(Exception ex) {
		   ex.printStackTrace();
	   }
	   return json; //[] => JSONArray  [{VO},{VO},{VO}..]
   }

   @GetMapping("movie/total.do")
   public String movie_total(String type,String ss) {
	   Map map=new HashMap();
	   map.put("type", type);
	   map.put("ss", ss);
	   int total=dao.movieTotalPage(map);
	   return String.valueOf(total);
   }
   @GetMapping(value="movie/detail.do",produces="text/plain;charset=UTF-8")
   public String movie_detail(int mno) {
	   String json="";
	   try{
		  MovieVO vo = dao.movieDetailData(mno);
		  JSONObject obj = new JSONObject();
		  obj.put("title", vo.getTitle());
		  obj.put("poster", vo.getPoster());
		  obj.put("genre", vo.getGenre());
		  obj.put("director", vo.getDirector());
		  obj.put("actor", vo.getActor());
		  obj.put("story", vo.getStory());
		  json = obj.toJSONString();
	   }catch (Exception e) {}
	   return json;
   }
}

















