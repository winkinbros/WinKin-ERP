package com.winkin.erp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
@Table(name = "WKM_COMPANY")
public class WKM_COMPANY implements Serializable {

	private static final long serialVersionUID = 2L;

	@Id
	@Column(name = "WKMC_ID", unique = true)
	private String WKMC_ID;

	@Column(name = "WKMC_NAME")
	private String WKMC_NAME;

	
}
