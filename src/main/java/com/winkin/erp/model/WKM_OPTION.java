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


	
	
	
	
}
