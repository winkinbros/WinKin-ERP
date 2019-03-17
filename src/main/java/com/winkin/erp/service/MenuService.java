package com.winkin.erp.service;

import java.util.List;

import com.winkin.erp.pojo.PJ_MENU;
import com.winkin.erp.pojo.PJ_SESSION;

public interface MenuService {

	List<PJ_MENU> getMenulist(PJ_SESSION sessionData);

}
