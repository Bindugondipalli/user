package com.cts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class Login {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="uId")
	private int uId;
    @Column(name="uName")
	private String uName;
	@Column(name="Pwd")
	private String password;
	public Login() {
		super();
	}
	public Login(int uId, String uName, String password) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.password = password;
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
	@Override
	public String toString() {
		return "Login [uId=" + uId + ", uName=" + uName + ", password=" + password + "]";
	}
	
	
	

}
