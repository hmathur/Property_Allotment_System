package com.xavient.pas.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.xavient.pas.bo.SchemesBO;
import com.xavient.pas.bo.impl.SchemesBOImpl;
import com.xavient.pas.dao.bean.BuildersBean;
import com.xavient.pas.dao.bean.CityBean;
import com.xavient.pas.dao.bean.LocationsBean;
import com.xavient.pas.dao.bean.SchemesBean;

public class CityAction extends ActionSupport {

	private List<CityBean> cityList = new ArrayList<CityBean>();
	private List<LocationsBean> locationsList = new ArrayList<LocationsBean>();
	private List<BuildersBean> builderList = new ArrayList<BuildersBean>();
	private List<SchemesBean> schemeList = new ArrayList<SchemesBean>();

	private int builderID;
	private int cityID;
	private int locationID;
	private int schemeID;

	public List<SchemesBean> getSchemeList() {
		return schemeList;
	}

	public void setSchemeList(List<SchemesBean> schemeList) {
		this.schemeList = schemeList;
	}

	public int getSchemeID() {
		return schemeID;
	}

	public void setSchemeID(int schemeID) {
		this.schemeID = schemeID;
	}

	public int getBuilderID() {
		return builderID;
	}

	public void setBuilderID(int builderID) {
		this.builderID = builderID;
	}

	public int getLocationID() {
		return locationID;
	}

	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}

	public int getCityID() {
		return cityID;
	}

	public void setCityID(int cityID) {
		this.cityID = cityID;
	}

	public String show() {
	
		SchemesBO schemesBO = new SchemesBOImpl();
		List<CityBean> cityListBO = schemesBO.getCityList();
		setCityList(cityListBO);

		return SUCCESS;
	}

	public String getLocationLists() {
		show();
		
		SchemesBO schemesBO = new SchemesBOImpl();
		List<LocationsBean> locationListBO = schemesBO.getLocationList(cityID);
		setLocationsList(locationListBO);

		return SUCCESS;
	}

	public String getBuilderLists() {
		getLocationLists();
		SchemesBO schemesBO = new SchemesBOImpl();
		List<BuildersBean> builderListBO = schemesBO.getBuilderList(locationID);
		setBuilderList(builderListBO);

		return SUCCESS;
	}
	
	public String getSchemesLists() {
		getBuilderLists();
		
		SchemesBO schemesBO = new SchemesBOImpl();
		List<SchemesBean> schemeListBO= schemesBO.getSchemesList(builderID);
		setSchemeList(schemeListBO);
		return SUCCESS;
		
	}

	public List<CityBean> getCityList() {
		return cityList;
	}

	public void setCityList(List<CityBean> cityList) {
		this.cityList = cityList;
	}

	public List<BuildersBean> getBuilderList() {
		return builderList;
	}

	public void setBuilderList(List<BuildersBean> builderList) {
		this.builderList = builderList;
	}

	public List<LocationsBean> getLocationsList() {
		return locationsList;
	}

	public void setLocationsList(List<LocationsBean> locationsList) {
		this.locationsList = locationsList;
	}

}
