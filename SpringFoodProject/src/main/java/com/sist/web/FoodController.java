package com.sist.web;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sist.vo.*;
import com.sist.dao.*;

@Controller
public class FoodController {
	@Autowired
	private FoodCategoryDAO cDao;
	@Autowired
	private FoodHouseDAO hDao;
	
	@RequestMapping("food/category.do")
	public String category_list(String no,Model model){
		if(no==null) no="1";
		int index = Integer.parseInt(no);
		int start = 0;
		int end = 0;
		if(index==1){
			start=1;
			end=12;
		}
		else if(index==2){
			start=13;
			end=18;
		}
		else if(index==3){
			start=19;
			end=30;
		}
		Map map = new HashMap();
		map.put("start", start);
		map.put("end", end);
		List<FoodCategoryVO> list = cDao.foodCategoryListData(map);
		model.addAttribute("list",list);
		return "food/category";
	}
	@RequestMapping("food/food_list.do")
	public String food_list(int cno,Model model){
		FoodCategoryVO cvo = cDao.foodCategoryInfoData(cno);
		System.out.println(cno);
		List<FoodHouseVO> list = hDao.foodHouseData(cno);
		for(FoodHouseVO vo:list){
			String s=vo.getPoster();
			s=s.substring(0,s.indexOf("^"));
			vo.setPoster(s);
		}
		model.addAttribute("cvo",cvo);
		model.addAttribute("list",list);
		return "food/food_list";
	}
	@RequestMapping("food/food_detail.do")
	public String food_detail(int no,Model model){
		FoodHouseVO vo = hDao.foodHouseDetailData(no);
		String s=vo.getAddress();
		s=s.substring(0,s.indexOf("Áö"));
		vo.setAddress(s);
		
		model.addAttribute("vo", vo);
		return "food/food_detail";
	}
}
