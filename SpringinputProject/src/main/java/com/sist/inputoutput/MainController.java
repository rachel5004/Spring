package com.sist.inputoutput;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main/")
public class MainController {
	@RequestMapping("input.do")
	public String main_input(){
		return "main/input";
	}
	@RequestMapping("output.do")
	public String main_output(HttpServletRequest request){
		try{
			request.setCharacterEncoding("UTF-8");
		}catch (Exception e) {}
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String addr = request.getParameter("addr");
		String tel = request.getParameter("tel");
		String age = request.getParameter("age");
		
		MemberVO vo = new MemberVO();
		vo.setName(name);
		vo.setSex(sex);
		vo.setAddr(addr);
		vo.setTel(tel);
		vo.setAge(Integer.parseInt(age));
		
		request.setAttribute("vo", vo);
		return "main/output";
	}
	@RequestMapping("output2.do")
	public String main_output2(MemberVO vo,Model model){
		model.addAttribute("vo",vo);
		return "main/output";
	}
}
