package com.winkin.erp.pojo;

import com.winkin.erp.model.WKM_USER;

public class PJ_USER {

	String userid;
	String email;
	String lockedyn;
	String statusyn;

	public PJ_USER() {

	}

	public PJ_USER(WKM_USER O_WKM_USER) {

		this.userid = O_WKM_USER.getWKU_ID();
		this.email = O_WKM_USER.getWKU_REG_EMAIL();
		this.lockedyn = O_WKM_USER.getWKU_LOCKED_YN();
		this.statusyn = O_WKM_USER.getWKU_STATUS_YN();
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

	public String getStatusyn() {
		return statusyn;
	}

	public void setStatusyn(String statusyn) {
		this.statusyn = statusyn;
	}

}
