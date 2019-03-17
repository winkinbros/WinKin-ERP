package com.winkin.erp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.winkin.erp.model.WKM_OPTION;
import com.winkin.erp.model.WKR_ROLE_OPTION;
import com.winkin.erp.pojo.PJ_MENU;
import com.winkin.erp.pojo.PJ_SESSION;

@Repository("MenuDao")
@Transactional
@Component
public class MenuDaoimpl implements MenuDao {

	@Autowired
	private SessionFactory I_SessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<PJ_MENU> getMenulist(PJ_SESSION sessionData) {

		List<PJ_MENU> L_O_PJ_MENU = new ArrayList<PJ_MENU>();
		
		// Getting Menu List by Role
		String QryStr = "FROM WKR_ROLE_OPTION WHERE WKRRO_WKM_ROLE.WKMR_ID =:role";
		
		Query query =  I_SessionFactory.getCurrentSession().createQuery(QryStr);

		query.setParameter("role", sessionData.getRole());
		 query.list();
		
		 
		 List<WKR_ROLE_OPTION> L_O_WKR_ROLE_OPTION = (List<WKR_ROLE_OPTION>) query.list();

		
		//binding model to POJO
		for (WKR_ROLE_OPTION O_WKR_ROLE_OPTION : L_O_WKR_ROLE_OPTION) {

			WKM_OPTION menu =	O_WKR_ROLE_OPTION.getWKRRO_WKM_OPTION();
			
			
			L_O_PJ_MENU.add(new PJ_MENU(menu));
			
		}

		return L_O_PJ_MENU;
	}

}
