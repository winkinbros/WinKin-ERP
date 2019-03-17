package com.winkin.erp.pojo;

import com.winkin.erp.model.WKM_OPTION;

public class PJ_MENU {

	String id;
	String name;
	
	
	public PJ_MENU() {
	}
	
	public PJ_MENU(WKM_OPTION O_WKM_OPTION) {
		
		this. id= O_WKM_OPTION.getWKO_ID();
		this. name = O_WKM_OPTION.getWKO_NAME();
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
