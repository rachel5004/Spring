package com.sist.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;
import com.sist.dao.*;
// Model
@Controller
public class MusicController {
	@Autowired
	private MusicDAO dao;
	
	@RequestMapping("music/list.do")
	public String music_list(Model model){
		List<MusicVO> list = dao.musicAllData();
		model.addAttribute("list",list);
		return "music/list";
	}
}
