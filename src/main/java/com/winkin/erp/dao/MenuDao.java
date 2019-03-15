package com.winkin.erp.dao;

import java.util.List;

import com.winkin.erp.pojo.PJ_MENU;
import com.winkin.erp.pojo.PJ_SESSION;

public interface MenuDao {

	List<PJ_MENU> getMenulist(PJ_SESSION sessionData);

}
