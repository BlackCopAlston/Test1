package com.chuanyi.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chuanyi.bean.Office;
import com.chuanyi.mapper.IOfficeMapper;
import com.chuanyi.service.inter.IOfficeService;

@Service
public class OfficeServiceImpl implements IOfficeService {

	@Autowired
	private IOfficeMapper officeMapper;

	@Override
	public int addOffice(Office office) {
		return officeMapper.addOffice(office);
	}

	@Override
	public int delOffice(Office office) {
		return officeMapper.delOffice(office);
	}

	@Override
	public int updateOffice(Office office) {
		return officeMapper.updateOffice(office);
	}

	@Override
	public List<Office> queryOfficeParent(Office office) {
		return officeMapper.queryOfficeParent(office);
	}

	@Override
	public List<Office> queryOfficeSon(Office office) {
		return officeMapper.queryOfficeSon(office);
	}
}
