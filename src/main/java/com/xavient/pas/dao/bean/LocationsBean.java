package com.xavient.pas.dao.bean;

public class LocationsBean{
private int locationId;
private String locationName;
private int cityCode;

private CityBean cityBean;



public int getLocationId() {
	return locationId;
}
public void setLocationId(int locationId) {
	this.locationId = locationId;
}
public String getLocationName() {
	return locationName;
}
public void setLocationName(String locationName) {
	this.locationName = locationName;
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
