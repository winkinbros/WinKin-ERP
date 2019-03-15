package com.winkin.erp.dao;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.winkin.erp.model.WKM_USER;
import com.winkin.erp.pojo.PJ_USER;

@Repository("UserDao")
@Transactional
@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory I_SessionFactory;

	@Override
	public PJ_USER getUserById(String userid) {

		WKM_USER O_WKM_USER = I_SessionFactory.getCurrentSession().get(WKM_USER.class, userid);

		if (O_WKM_USER == null) {
			
			return null;
			
		} else {

			return new PJ_USER(O_WKM_USER);
			
		}

	}

}
