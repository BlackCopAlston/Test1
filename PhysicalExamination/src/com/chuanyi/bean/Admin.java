package com.chuanyi.bean;

public class Admin {

	private int adminId;//管理员ID
	private int roleId;//角色ID
	private int officeId;//科室ID
	private String account;//账户
	private String adminPwd;//管理员密码
	private String adminName;//管理员名字
	private String createTime;//创建时间
	private int adminStatus;//状态
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(int adminId, int roleId, int officeId, String account, String adminPwd, String adminName,
			String createTime, int adminStatus) {
		super();
		this.adminId = adminId;
		this.roleId = roleId;
		this.officeId = officeId;
		this.account = account;
		this.adminPwd = adminPwd;
		this.adminName = adminName;
		this.createTime = createTime;
		this.adminStatus = adminStatus;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getOfficeId() {
		return officeId;
	}
	public void setOfficeId(int officeId) {
		this.officeId = officeId;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getAdminPwd() {
		return adminPwd;
	}
	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public int getAdminStatus() {
		return adminStatus;
	}
	public void setAdminStatus(int adminStatus) {
		this.adminStatus = adminStatus;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", roleId=" + roleId + ", officeId=" + officeId + ", account=" + account
				+ ", adminPwd=" + adminPwd + ", adminName=" + adminName + ", createTime=" + createTime
				+ ", adminStatus=" + adminStatus + "]";
	}
	
	
}
