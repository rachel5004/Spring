package com.sist.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// Model => DispatcherServlet => �봽濡쒓렇�옒癒� 泥섎━�븷 �닔 �엳寃� �쐞�긽(@Controller)
/*
 *    MVC
 *     = �젣�뼱�븯�뒗 湲곕뒫 
 *     = 1. �슂泥�諛쏅뒗 湲곕뒫 , �쓳�떟�븯�뒗 湲곕뒫 => Front Controller : DispatcherServlet
 *     = 2. �슂泥��쓣 泥섎━�븯�뒗 湲곕뒫  => Model (鍮꾩��땲�뒪 濡쒖쭅)
 */
import java.util.*;
import com.sist.dao.*;
@Controller
public class MovieController {
	@Autowired
	private MovieDAO dao;
  
  	@RequestMapping("main/main.do")
  	public String main_main() {
	  	return "main";
  	}
  	@RequestMapping("movie/movie_list.do")
  	public String movie_movie_list(String page,String fd,Model model) {
	  	if(page==null)
		  	page="1";
	  	int curpage=Integer.parseInt(page);
	  	Map map=new HashMap();
	  	int rowSize=12;
	  	int start=(rowSize*curpage)-(rowSize-1);
	  	int end=(rowSize*curpage);
	  	map.put("start", start);
	  	map.put("end", end);
	  
	  
		List<MovieVO> list;
		int totalpage;
		if(fd==null){
			list=dao.movieAllData(map);
			totalpage=dao.movieAllTotalPage();
		}else{
			map.put("keyword", fd);
			list=dao.movieFindData(map);
			totalpage=dao.movieFindTotalPage(fd);
		}
		model.addAttribute("list", list);
		model.addAttribute("curpage", curpage);
		model.addAttribute("totalpage", totalpage);
		return "movie/movie_list";
  	}
}














