package com.winkin.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.winkin.erp.dao.MenuDao;
import com.winkin.erp.pojo.PJ_MENU;
import com.winkin.erp.pojo.PJ_SESSION;

@Service("MenuService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuDao I_MenuDao;

	@Override
	public List<PJ_MENU> getMenulist(PJ_SESSION sessionData) {

		return I_MenuDao.getMenulist(sessionData);
	}

}
