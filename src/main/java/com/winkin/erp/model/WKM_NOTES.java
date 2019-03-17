package com.winkin.erp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
@Table(name = "WKM_NOTES")
public class WKM_NOTES implements Serializable {

    private static final long serialVersionUID = 2L;
    	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "WKM_N_AG_ID", unique = true)
    private Integer WKM_N_AG_ID;

    @Column(name = "WKMN_TITLE")
    private String WKMN_TITLE;
    
    @Column(name = "WKMN_CONTENT")
    private String WKMN_CONTENT;

	public Integer getWKM_N_AG_ID() {
		return WKM_N_AG_ID;
	}

	public void setWKM_N_AG_ID(Integer wKM_N_AG_ID) {
		WKM_N_AG_ID = wKM_N_AG_ID;
	}

	public String getWKMN_TITLE() {
		return WKMN_TITLE;
	}

	public void setWKMN_TITLE(String wKMN_TITLE) {
		WKMN_TITLE = wKMN_TITLE;
	}

	public String getWKMN_CONTENT() {
		return WKMN_CONTENT;
	}

	public void setWKMN_CONTENT(String wKMN_CONTENT) {
		WKMN_CONTENT = wKMN_CONTENT;
	}

	
	
	
}
