package com.xavient.pas.action;

import java.util.List;
import java.util.Collections;

import javassist.bytecode.Descriptor.Iterator;

import com.opensymphony.xwork2.ActionSupport;
import com.xavient.pas.bo.SchemesBO;
import com.xavient.pas.bo.impl.SchemesBOImpl;
import com.xavient.pas.dao.bean.CityBean;

public class CityAction extends ActionSupport{

	private List<CityBean> cityList;
	public String show()
	{
		SchemesBO  schemesBO  = new SchemesBOImpl();
		
		List<CityBean> cityListBO= schemesBO.getCityList();
		setCityList(cityListBO);
		//System.out.println(cityList);
			return SUCCESS;
	}
	public List<CityBean> getCityList() {
		return cityList;
	}
	public void setCityList(List<CityBean> cityList) {
		this.cityList = cityList;
	}
	
	
	
}
