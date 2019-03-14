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

	
	

}
