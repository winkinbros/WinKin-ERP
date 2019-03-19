package com.winkin.erp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
@Table(name = "WKM_ROLE")
public class WKM_ROLE implements Serializable {

	private static final long serialVersionUID = 2L;

	@Id
	@Column(name = "WKMR_ID", unique = true)
	private String WKMR_ID;

	@Column(name = "WKMR_NAME")
	private String WKMR_NAME;

	public String getWKMR_ID() {
		return WKMR_ID;
	}

	public void setWKMR_ID(String wKMR_ID) {
		WKMR_ID = wKMR_ID;
	}

	public String getWKMR_NAME() {
		return WKMR_NAME;
	}

	public void setWKMR_NAME(String wKMR_NAME) {
		WKMR_NAME = wKMR_NAME;
	}

	
	

}
