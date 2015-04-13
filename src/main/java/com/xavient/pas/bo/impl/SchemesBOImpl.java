package com.xavient.pas.bo.impl;

import java.util.List;

import com.xavient.pas.bo.SchemesBO;
import com.xavient.pas.dao.SchemesDAO;
import com.xavient.pas.dao.bean.BuildersBean;
import com.xavient.pas.dao.bean.CityBean;
import com.xavient.pas.dao.bean.LocationsBean;
import com.xavient.pas.dao.bean.SchemesBean;
import com.xavient.pas.dao.impl.SchemesDAOImpl;

public class SchemesBOImpl implements SchemesBO {
	
	private SchemesDAO schemesDAO ;
	
	public SchemesBOImpl(){
		schemesDAO = new SchemesDAOImpl();
	}

	@Override
	public List<CityBean> getCityList() {

		return schemesDAO.getCityList();

	}

	@Override
	public List<LocationsBean> getLocationList(int cityID) {
		return schemesDAO.getLocationList(cityID);
	}

	@Override
	public List<BuildersBean> getBuilderList(int locationID) {
		// TODO Auto-generated method stub
		return schemesDAO.getBuilderList(locationID);
		
	}

	@Override
	public List<SchemesBean> getSchemesList(int builderID) {
		// TODO Auto-generated method stub
		return schemesDAO.getSchemesList(builderID);
	}

}
