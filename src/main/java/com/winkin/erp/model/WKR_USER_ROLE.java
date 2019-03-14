package com.winkin.erp.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
@Table(name = "WKR_USER_ROLE")
public class WKR_USER_ROLE implements Serializable {

	private static final long serialVersionUID = 2L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "WKRUR_ID", unique = true)
	private Integer WKRUR_ID;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "WKRUR_WKM_ROLE",foreignKey=@ForeignKey(name ="FK_WKRUR_WKM_ROLE"))
	private WKM_ROLE WKRUR_WKM_ROLE;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "WKRUR_WKM_USER",foreignKey=@ForeignKey(name ="FK_WKRUR_WKM_USER"))
	private WKM_USER WKRUR_WKM_USER;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "WKRUR_WKM_COMPANY",foreignKey=@ForeignKey(name ="FK_WKRUR_WKM_COMPANY"))
	private WKM_COMPANY WKRUR_WKM_COMPANY;
	
}
