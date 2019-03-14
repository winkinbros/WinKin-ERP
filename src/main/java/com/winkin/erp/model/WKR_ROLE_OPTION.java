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
@Table(name = "WKR_ROLE_OPTION")
public class WKR_ROLE_OPTION implements Serializable {

	private static final long serialVersionUID = 2L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "WKRRO_ID", unique = true)
	private Integer WKRRO_ID;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "WKRRO_WKM_ROLE",foreignKey=@ForeignKey(name ="FK_WKRRO_WKM_ROLE"))
	private WKM_ROLE WKRRO_WKM_ROLE;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "WKRRO_WKM_OPTION",foreignKey=@ForeignKey(name ="FK_WKRRO_WKM_OPTION"))
	private WKM_OPTION WKRRO_WKM_OPTION;
	

}
