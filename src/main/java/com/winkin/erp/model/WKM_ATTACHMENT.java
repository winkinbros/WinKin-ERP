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
@Table(name = "WKM_ATTACHMENT")
public class WKM_ATTACHMENT implements Serializable{
	
	private static final long serialVersionUID = 2L;
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "WKMA_AG_ID", unique = true)
	    private Integer WKMA_AG_ID;

	    @Column(name = "WKMA_LINK")
	    private String WKMA_LINK;
	    
	    @Column(name = "WKMA_FLAG")
	    private String WKMA_FLAG;

	    @Column(name = "WKMA_P_ID")
	    private Integer WKMA_P_ID;
	    
		public Integer getWKMA_AG_ID() {
			return WKMA_AG_ID;
		}

		public void setWKMA_AG_ID(Integer wKMA_AG_ID) {
			WKMA_AG_ID = wKMA_AG_ID;
		}

		public String getWKMA_LINK() {
			return WKMA_LINK;
		}

		public void setWKMA_LINK(String wKMA_LINK) {
			WKMA_LINK = wKMA_LINK;
		}

		public String getWKMA_FLAG() {
			return WKMA_FLAG;
		}

		public void setWKMA_FLAG(String wKMA_FLAG) {
			WKMA_FLAG = wKMA_FLAG;
		}

		public Integer getWKMA_P_ID() {
			return WKMA_P_ID;
		}

		public void setWKMA_P_ID(Integer wKMA_P_ID) {
			WKMA_P_ID = wKMA_P_ID;
		}
	    
		

}
