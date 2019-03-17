package com.winkin.erp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
@Table(name = "WKM_OPTION")
public class WKM_OPTION implements Serializable {

    private static final long serialVersionUID = 2L;

    @Id
    @Column(name = "WKO_ID", unique = true)
    private String WKO_ID;

    @Column(name = "WKO_FLAG")
    private String WKO_FLAG;
    
    @Column(name = "WKO_NAME")
    private String WKO_NAME;
    
    @Column(name = "WKO_SHOW_ORDER")
    private Integer WKO_SHOW_ORDER;

	public String getWKO_ID() {
		return WKO_ID;
	}

	public void setWKO_ID(String wKO_ID) {
		WKO_ID = wKO_ID;
	}

	public String getWKO_FLAG() {
		return WKO_FLAG;
	}

	public void setWKO_FLAG(String wKO_FLAG) {
		WKO_FLAG = wKO_FLAG;
	}

	public String getWKO_NAME() {
		return WKO_NAME;
	}

	public void setWKO_NAME(String wKO_NAME) {
		WKO_NAME = wKO_NAME;
	}


	
	
	
	
}
