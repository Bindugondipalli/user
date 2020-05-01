package com.cts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

 @Entity
 @Table(name="User")
public class Register {
	
	@Column(name="uId")
	private int uId;
    @Column(name="uName")
	private String uName;
    @Column(name="pwd")
	private String password;
    @Column(name="mNum")
	private int mNumber;
	public Register() {
		super();
	}
	public Register(int uId, String uName, String password, int mNumber) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.password = password;
		this.mNumber = mNumber;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getmNumber() {
		return mNumber;
	}
	public void setmNumber(int mNumber) {
		this.mNumber = mNumber;
	}
	@Override
	public String toString() {
		return "Register [uId=" + uId + ", uName=" + uName + ", password=" + password + ", mNumber=" + mNumber + "]";
	}
	
	
	
	

}
