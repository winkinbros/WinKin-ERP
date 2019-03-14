package com.winkin.erp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.winkin.erp.PJ_USER;
import com.winkin.erp.dao.UserDao;

@Service("UserService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserServiceImpl implements UserService{

	
	@Autowired
	private UserDao I_UserDao;

	@Override
	public PJ_USER getUserById(String userid) {

		return I_UserDao.getUserById(userid);
	}
	

	
	 	

}
