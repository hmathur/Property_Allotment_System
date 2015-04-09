package com.xavient.pas.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.xavient.pas.bo.SchemesBO;
import com.xavient.pas.bo.impl.SchemesBOImpl;
import com.xavient.pas.dao.bean.CityBean;

public class UserLoginAction extends ActionSupport {
	private String name;
	private String pwd;

	public String processLogin() {
		
		//test code
		
		SchemesBO  schemesBO  = new SchemesBOImpl();
		
		List<CityBean> cityList= schemesBO.getCityList();
		return SUCCESS;
	}

	public void validate() {
		if (getName().length() == 0) {
			addFieldError("name", "User Name is required..!");
		}
		if (getPwd().length() == 0)

		{
			addFieldError("pwd", "password is required");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
