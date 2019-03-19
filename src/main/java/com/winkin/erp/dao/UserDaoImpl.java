package com.winkin.erp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.winkin.erp.model.WKM_USER;
import com.winkin.erp.pojo.PJ_ROLE;
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

			return new PJ_USER(O_WKM_USER,false,true);

		}

	}

	@Override
	public List<PJ_USER> getUserlist() {

		List<PJ_USER> O_PJ_USER = new ArrayList<PJ_USER>();

		// Getting Menu List by Role and order by menu master sort order
		String QryStr = "FROM WKM_USER";

		Query query = I_SessionFactory.getCurrentSession().createQuery(QryStr);

		List<WKM_USER> L_O_WKM_USER =query.list();

		for (WKM_USER O_WKM_USER : L_O_WKM_USER) {

			O_PJ_USER.add(new PJ_USER(O_WKM_USER,false,true));
			
		}

		return O_PJ_USER;
	}

	@Override
	public List<PJ_ROLE> getRolelist() {
		List<PJ_ROLE> O_PJ_ROLE = new ArrayList<PJ_ROLE>();

		return O_PJ_ROLE;
	}

}
