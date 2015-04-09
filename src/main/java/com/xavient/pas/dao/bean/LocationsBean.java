package com.xavient.pas.dao.bean;

public class LocationsBean{
private int lId;
private String lName;
private int cityCode;

private CityBean cityBean;

public int getlId() {
	return lId;
}
public void setlId(int lId) {
	this.lId = lId;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public int getCityCode() {
	return cityCode;
}
public void setCityCode(int cityCode) {
	this.cityCode = cityCode;
}
public CityBean getCityBean() {
	return cityBean;
}
public void setCityBean(CityBean cityBean) {
	this.cityBean = cityBean;
}



}
