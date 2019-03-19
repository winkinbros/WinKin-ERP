package com.winkin.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.winkin.erp.dao.UserDao;
import com.winkin.erp.pojo.PJ_ROLE;
import com.winkin.erp.pojo.PJ_USER;

@Service("UserService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserServiceImpl implements UserService{

	
	@Autowired
	private UserDao I_UserDao;

	@Override
	public PJ_USER getUserById(String userid) {

		return I_UserDao.getUserById(userid);
	}

	@Override
	public List<PJ_USER> getUserlist() {

		
		return I_UserDao.getUserlist();
	}

	@Override
	public List<PJ_ROLE> getRolelist(String userid) {

		
		return I_UserDao.getRolelist(userid);
	}
	

	
	 	

}
