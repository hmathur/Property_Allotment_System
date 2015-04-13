package com.xavient.pas.dao.bean;

public class Apartment extends SchemesBean {
private int apartmentId;
private String apartmentName;
private int schemeId;
private int builderId;
private int locationId;
private int cityCode;
private int areaCode;
private int distFromNearestAirport;
private int distFromNearestRailway;
private int distFromCenterOfCity;
private int distFromNearestHospital;
private int cost;
private boolean availabilty;
private int floor;


public int getCityCode() {
	return cityCode;
}
public void setCityCode(int cityCode) {
	this.cityCode = cityCode;
}
public int getAreaCode() {
	return areaCode;
}
public void setAreaCode(int areaCode) {
	this.areaCode = areaCode;
}


public int getApartmentId() {
	return apartmentId;
}
public void setApartmentId(int apartmentId) {
	this.apartmentId = apartmentId;
}
public String getApartmentName() {
	return apartmentName;
}
public void setApartmentName(String apartmentName) {
	this.apartmentName = apartmentName;
}
public int getSchemeId() {
	return schemeId;
}
public void setSchemeId(int schemeId) {
	this.schemeId = schemeId;
}
public int getBuilderId() {
	return builderId;
}
public void setBuilderId(int builderId) {
	this.builderId = builderId;
}
public int getLocationId() {
	return locationId;
}
public void setLocationId(int locationId) {
	this.locationId = locationId;
}
public int getDistFromNearestAirport() {
	return distFromNearestAirport;
}
public void setDistFromNearestAirport(int distFromNearestAirport) {
	this.distFromNearestAirport = distFromNearestAirport;
}
public int getDistFromNearestRailway() {
	return distFromNearestRailway;
}
public void setDistFromNearestRailway(int distFromNearestRailway) {
	this.distFromNearestRailway = distFromNearestRailway;
}
public int getDistFromCenterOfCity() {
	return distFromCenterOfCity;
}
public void setDistFromCenterOfCity(int distFromCenterOfCity) {
	this.distFromCenterOfCity = distFromCenterOfCity;
}
public int getDistFromNearestHospital() {
	return distFromNearestHospital;
}
public void setDistFromNearestHospital(int distFromNearestHospital) {
	this.distFromNearestHospital = distFromNearestHospital;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public boolean isAvailabilty() {
	return availabilty;
}
public void setAvailabilty(boolean availabilty) {
	this.availabilty = availabilty;
}
public int getFloor() {
	return floor;
}
public void setFloor(int floor) {
	this.floor = floor;
}

}
