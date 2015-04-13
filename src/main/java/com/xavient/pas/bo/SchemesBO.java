package com.xavient.pas.bo;

import java.util.List;

import com.xavient.pas.dao.bean.BuildersBean;
import com.xavient.pas.dao.bean.CityBean;
import com.xavient.pas.dao.bean.LocationsBean;
import com.xavient.pas.dao.bean.SchemesBean;

public interface SchemesBO {

	public List<CityBean> getCityList();
	
	
	
	public List<LocationsBean> getLocationList(int cityID);
	
	public List<BuildersBean> getBuilderList(int locationID);
	
	public List<SchemesBean> getSchemesList(int builderID);
}
