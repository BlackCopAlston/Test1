package com.chuanyi.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chuanyi.bean.Office;
import com.chuanyi.service.Impl.OfficeServiceImpl;

@Controller
@Scope("prototype")
@RequestMapping("/back")
public class OfficeAction {
	
	@Autowired
	private OfficeServiceImpl officeServiceImp;

	/*
	 * 新增科室
	 */
	@RequestMapping(value = "/addOffice.action", method = RequestMethod.POST, produces="application/json;charset=utf-8")
	public @ResponseBody int addOffice(HttpServletRequest request, HttpServletResponse response, Office officeInfo) {
		int result = officeServiceImp.addOffice(officeInfo);
		return result;
	}
	
	/*
	 * 删除科室
	 */
	@RequestMapping(value = "/delOffice.action", method = RequestMethod.POST, produces="application/json;charset=utf-8")
	public @ResponseBody int delOffice(HttpServletRequest request, HttpServletResponse response, Office officeInfo) {
		int result = officeServiceImp.delOffice(officeInfo);
		return result;
	}
	
	/*
	 * 更新科室
	 */
	@RequestMapping(value = "/updateOffice.action", method = RequestMethod.POST, produces="application/json;charset=utf-8")
	public @ResponseBody int updateOffice(HttpServletRequest request, HttpServletResponse response, Office officeInfo) {
		int result = officeServiceImp.updateOffice(officeInfo);
		return result;
	}
	
	/*
	 * 查询父级科室
	 */
	@RequestMapping(value = "/queryOfficeParent.action", method = RequestMethod.POST, produces="application/json;charset=utf-8")
	public @ResponseBody List<Office> queryOfficeParent(HttpServletRequest request, HttpServletResponse response, Office officeInfo) {
		List<Office> result = officeServiceImp.queryOfficeParent(officeInfo);
		return result;
	}
	
	/*
	 * 查询二级科室
	 */
	@RequestMapping(value = "/queryOfficeSon.action", method = RequestMethod.POST, produces="application/json;charset=utf-8")
	public @ResponseBody List<Office> queryOfficeSon(HttpServletRequest request, HttpServletResponse response, Office officeInfo) {
		List<Office> result = officeServiceImp.queryOfficeSon(officeInfo);
		return result;
	}
}
