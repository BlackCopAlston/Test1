package com.chuanyi.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chuanyi.bean.Admin;
import com.chuanyi.service.Impl.AdminServiceImpl;

@Controller
@Scope("prototype")
@RequestMapping("/back")
public class AdminAction {

	@Autowired
	AdminServiceImpl adminService;
	@RequestMapping("/adminLogin.action")
	public ModelAndView adminLogin(HttpServletRequest request,HttpServletResponse response,Admin adminLogin) {
		ModelAndView mav = new ModelAndView();
		Admin admin= adminService.adminLogin(adminLogin);
		if(admin!=null) {
			request.getSession().setAttribute("admin", admin);
			mav.setViewName("admin_index");
			mav.addObject("msg", "1");
		}else {
			mav.addObject("msg", "2");
			mav.setViewName("admin_login");
		}
		return mav;
	}
	
}
