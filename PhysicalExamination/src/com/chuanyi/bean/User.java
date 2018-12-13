package com.chuanyi.bean;

import org.springframework.stereotype.Repository;

@Repository
public class User {

	private int userId;//�û�Id	
	private String userTel;//�绰����
	private String userPassword;//�û�����
	private String userName;//�û�����
	private String userSex;//�Ա�
	private int userAge;//����
	private String userAddress;//��ַ
	private String userBlood;//Ѫ��
	private String userBirth;//��������
	private String userCreateTime;//ע������
	private int userStatus;//״̬
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String userTel, String userPassword, String userName, String userSex, int userAge,
			String userAddress, String userBlood, String userBirth, String userCreateTime, int userStatus) {
		super();
		this.userId = userId;
		this.userTel = userTel;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userSex = userSex;
		this.userAge = userAge;
		this.userAddress = userAddress;
		this.userBlood = userBlood;
		this.userBirth = userBirth;
		this.userCreateTime = userCreateTime;
		this.userStatus = userStatus;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserTel() {
		return userTel;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserBlood() {
		return userBlood;
	}
	public void setUserBlood(String userBlood) {
		this.userBlood = userBlood;
	}
	public String getUserBirth() {
		return userBirth;
	}
	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}
	public String getUserCreateTime() {
		return userCreateTime;
	}
	public void setUserCreateTime(String userCreateTime) {
		this.userCreateTime = userCreateTime;
	}
	public int getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userTel=" + userTel + ", userPassword=" + userPassword + ", userName="
				+ userName + ", userSex=" + userSex + ", userAge=" + userAge + ", userAddress=" + userAddress
				+ ", userBlood=" + userBlood + ", userBirth=" + userBirth + ", userCreateTime=" + userCreateTime
				+ ", userStatus=" + userStatus + "]";
	}
	
	
}
