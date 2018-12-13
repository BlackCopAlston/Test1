package com.chuanyi.action;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.chuanyi.bean.User;
import com.chuanyi.service.Impl.UserServiceImpl;

@Controller
@Scope("prototype")
@RequestMapping("/front")
public class UserAction{
	@Autowired
	private UserServiceImpl userServiceImp;
	@RequestMapping(value = "/userLogin.action", method = RequestMethod.POST)
	public  ModelAndView userLoginCheck(HttpServletRequest req, User userLogin, String passCode) {
		ModelAndView mav = new ModelAndView();
		if(userLogin!=null) {
			User user = userServiceImp.userLogin(userLogin);
			if(user!=null) {
				req.getSession().setAttribute("user", user);
				mav.setViewName("front/user_index");
			}else {
				mav.addObject("msg", "1");
				mav.setViewName("front/user_login");
			}
		}else {
			mav.addObject("msg", "2");
			mav.setViewName("front/user_login");
		}
		return mav;
	}
	@RequestMapping("/userRegiest.action")
	public ModelAndView userRegiest(HttpServletRequest req, User userRegister, String passCode) {
		ModelAndView mav = new ModelAndView();
		if(userRegister!=null) {
			int addUser = userServiceImp.addUser(userRegister);
			if(addUser>0) {
				mav.addObject("msg", "1");
				mav.setViewName("user_login");
			}else {
				mav.addObject("msg", "2");
				mav.setViewName("user_register");
			}
		}else {
			mav.addObject("msg", "3");
			mav.setViewName("user_login");
		}
		return mav;
		
	}
}
