package com.winkin.erp.service;

import java.util.List;

import com.winkin.erp.pojo.PJ_ROLE;
import com.winkin.erp.pojo.PJ_USER;

public interface UserService {


	PJ_USER getUserById(String userid);

	List<PJ_USER> getUserlist();

	List<PJ_ROLE> getRolelist();

}
