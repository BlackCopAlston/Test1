package com.chuanyi.service.inter;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.chuanyi.bean.Office;

@Repository
public interface IOfficeService {

	// 新增科室
	public int addOffice(Office office);

	// 删除科室
	public int delOffice(Office office);

	// 更新科室
	public int updateOffice(Office office);

	// 查询父级科室
	public List<Office> queryOfficeParent(Office office);

	// 查询二级科室
	public List<Office> queryOfficeSon(Office office);
}
