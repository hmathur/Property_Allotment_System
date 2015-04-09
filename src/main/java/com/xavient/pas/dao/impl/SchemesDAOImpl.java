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

		List<CityBean> cities = new ArrayList<CityBean>();
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
	public List<LocationsBean> getLocationList(String cityID) {
		List<LocationsBean> locations = new ArrayList<LocationsBean>();
		Session session = HibernateUtils.getInstance().openSession();

		CityBean cityBean = new CityBean();
		cityBean.setCityCode(Integer.parseInt(cityID));
		try {
			Criteria criteria = session.createCriteria(LocationsBean.class)
					.add(Restrictions.like("cityCode", cityID));
			
			//criteria = session.createCriteria(LocationsBean.class)
					//.add(Restrictions.like("cityCode", cityBean));

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
	public List<BuildersBean> getBuilderList(String locationID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SchemesBean> getSchemesList(String BuilderID) {
		// TODO Auto-generated method stub
		return null;
	}

}
