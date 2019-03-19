package com.winkin.erp.pojo;

import com.winkin.erp.model.WKM_ROLE;

public class PJ_ROLE {

	String roleid;
	String rolename;

	public PJ_ROLE(WKM_ROLE O_WKM_ROLE) {

		this.roleid = O_WKM_ROLE.getWKMR_ID();
		this.rolename = O_WKM_ROLE.getWKMR_NAME();

	}

	public String getRoleid() {
		return roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	
	
	

}
