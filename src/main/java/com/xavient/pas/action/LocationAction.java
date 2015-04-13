package com.xavient.pas.action;
import java.util.List;

import com.xavient.pas.bo.SchemesBO;
import com.xavient.pas.bo.impl.SchemesBOImpl;
import com.xavient.pas.dao.bean.LocationsBean;


public class LocationAction {
	
	
private List<LocationsBean> locationList;
public void locationselection(int cityID)
{
	SchemesBO schemesBO=new SchemesBOImpl();
	List<LocationsBean> locationListBO=schemesBO.getLocationList(cityID);
	setLocationList(locationListBO);
}
public List<LocationsBean> getLocationList() {
	return locationList;
}
public void setLocationList(List<LocationsBean> locationList) {
	this.locationList = locationList;
}
}
