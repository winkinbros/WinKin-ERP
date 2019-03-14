package com.winkin.erp;

import com.winkin.erp.model.WKM_USER;

public class PJ_USER {

	String userid;
	String email;
	String lockedyn;

	public PJ_USER() {

	}
	
	public PJ_USER(WKM_USER O_WKM_USER) {
		
		this. userid =O_WKM_USER.getWKU_ID();
		this. email=O_WKM_USER.getWKU_REG_EMAIL();
		this. lockedyn = O_WKM_USER.getWKU_LOCKED_YN();
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLockedyn() {
		return lockedyn;
	}

	public void setLockedyn(String lockedyn) {
		this.lockedyn = lockedyn;
	}
	
	
	
	
	
}
