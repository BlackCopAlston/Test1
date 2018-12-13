package com.chuanyi.bean;

public class Office {
	
	private int officeId;
	private String officeName;
	private int officeParentId;
	private int officeDescribe;
	private String officeCreateTime;
	private int officeStatus;

	public Office() {
		super();
	}

	public Office(int officeId, String officeName, int officeParentId, int officeDescribe, String officeCreateTime,
			int officeStatus) {
		super();
		this.officeId = officeId;
		this.officeName = officeName;
		this.officeParentId = officeParentId;
		this.officeDescribe = officeDescribe;
		this.officeCreateTime = officeCreateTime;
		this.officeStatus = officeStatus;
	}

	public int getOfficeId() {
		return officeId;
	}

	public void setOfficeId(int officeId) {
		this.officeId = officeId;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public int getOfficeParentId() {
		return officeParentId;
	}

	public void setOfficeParentId(int officeParentId) {
		this.officeParentId = officeParentId;
	}

	public int getOfficeDescribe() {
		return officeDescribe;
	}

	public void setOfficeDescribe(int officeDescribe) {
		this.officeDescribe = officeDescribe;
	}

	public String getOfficeCreateTime() {
		return officeCreateTime;
	}

	public void setOfficeCreateTime(String officeCreateTime) {
		this.officeCreateTime = officeCreateTime;
	}

	public int getOfficeStatus() {
		return officeStatus;
	}

	public void setOfficeStatus(int officeStatus) {
		this.officeStatus = officeStatus;
	}
}
