package com.xavient.pas.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.xavient.pas.dao.SchemesDAO;
import com.xavient.pas.dao.bean.BuildersBean;
import com.xavient.pas.dao.bean.CityBean;
import com.xavient.pas.dao.bean.LocationsBean;
import com.xavient.pas.dao.bean.SchemesBean;
import com.xavient.pas.utils.HibernateUtils;

public class SchemesDAOImpl implements SchemesDAO {

	@Override
	public List<CityBean> getCityList() {

		List<CityBean> cities = null ;
		Session session = HibernateUtils.getInstance().openSession();

		try {
			Criteria criteria = session.createCriteria(CityBean.class);
			cities = criteria.list();
			
		} catch (Exception e) {

		} finally {
			if (session != null) {
				session.close();
			}
		}
		
		return cities;

	}

	@Override
	public List<LocationsBean> getLocationList(int cityID) {
		List<LocationsBean> locations = null ;
		Session session = HibernateUtils.getInstance().openSession();

		CityBean cityBean = new CityBean();
		cityBean.setCityCode(cityID);
		try {
			Criteria criteria = session.createCriteria(LocationsBean.class)
					.add(Restrictions.like("cityCode", cityID));
			
			locations = criteria.list();
			
		} catch (Exception e) {

		} finally {
			if (session != null) {
				session.close();
			}
		}
		return locations;
	}

	@Override
	public List<BuildersBean> getBuilderList(int locationID) {
		List<BuildersBean> builders=null;
		Session session=HibernateUtils.getInstance().openSession();
		BuildersBean buildersBean=new BuildersBean();
		buildersBean.setLocationId(locationID);
		try {
			Criteria criteria =session.createCriteria(BuildersBean.class)
					.add(Restrictions.like("locationId", locationID));
			builders=criteria.list();
		} catch(Exception e) {}
		finally {
			if(session != null) 
			{
				session.close();
				
			}
		}
		return builders;
	
	
		
		}
		
		

	@Override
	public List<SchemesBean> getSchemesList(int builderID) {
		List<SchemesBean> schemes=null;
		Session session=HibernateUtils.getInstance().openSession();
		SchemesBean schemesBean=new SchemesBean();
		schemesBean.setBuilderId(builderID);
		try {
			Criteria criteria =session.createCriteria(SchemesBean.class)
					.add(Restrictions.like("builderId", builderID));
			schemes=criteria.list();
		} catch(Exception e) {}
		finally {
			if(session != null) 
			{
				session.close();
				
			}
		}
		return schemes;
	}

}
