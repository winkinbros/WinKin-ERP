package com.winkin.erp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
@Table(name = "WKM_DEPT")
public class WKM_DEPT implements Serializable {

	private static final long serialVersionUID = 2L;

	@Id
	@Column(name = "WKMD_ID", unique = true)
	private String WKMD_ID;

	@Column(name = "WKMD_NAME")
	private String WKMD_NAME;

	
}
