package com.xavient.pas.dao.bean;

public class BuildersBean {
private int builderId;
private String builderName;
private int locationId;
private int cityCode;


public int getBuilderId() {
	return builderId;
}
public void setBuilderId(int builderId) {
	this.builderId = builderId;
}


public String getBuilderName() {
	return builderName;
}
public void setBuilderName(String builderName) {
	this.builderName = builderName;
}
public int getLocationId() {
	return locationId;
}
public void setLocationId(int locationId) {
	this.locationId = locationId;
}
public int getCityCode() {
	return cityCode;
}
public void setCityCode(int cityCode) {
	this.cityCode = cityCode;
}

}
