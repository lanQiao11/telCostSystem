package cn.lanqiao.eleven.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.lanqiao.eleven.pojo.Admin;
import cn.lanqiao.eleven.service.AdminService;

@Controller
public class AdminController {
	
	@Resource
	AdminService adminService;
	
	/**
	 * 进入登录界面
	 */
	@RequestMapping("login")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("loginForm");
		return mav;
	}
	
	/**
	 * 登陆检验
	 */
	@RequestMapping("loginTest")
	public ModelAndView loginTest(Admin admin,HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		HttpSession session = request.getSession();
		Admin logAdmin = adminService.getAdmin(admin);
		mav.addObject("logAdmin", logAdmin);
		if(logAdmin==null)
			mav.setViewName("loginForm");
		else {
			session.setAttribute("logAdmin", admin);
			mav.setViewName("successForm");
		}
		return mav;
	}
	
}
