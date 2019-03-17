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
@Table(name = "WKR_NOTES_TAGS")
public class WKR_NOTES_TAGS implements Serializable {

	    private static final long serialVersionUID = 2L;

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "WKRNT_AG_ID", unique = true)
	    private Integer WKRNT_AG_ID;

	    @Column(name = "WKRNT_TAG")
	    private String WKRNT_TAG;
	    
	    @ManyToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "WKRNT_ID",foreignKey=@ForeignKey(name ="FK_WKRNT_ID"))
		private WKM_NOTES WKRNT_ID;

		public Integer getWKRNT_AG_ID() {
			return WKRNT_AG_ID;
		}

		public void setWKRNT_AG_ID(Integer wKRNT_AG_ID) {
			WKRNT_AG_ID = wKRNT_AG_ID;
		}

		public String getWKRNT_TAG() {
			return WKRNT_TAG;
		}

		public void setWKRNT_TAG(String wKRNT_TAG) {
			WKRNT_TAG = wKRNT_TAG;
		}

		public WKM_NOTES getWKRNT_ID() {
			return WKRNT_ID;
		}

		public void setWKRNT_ID(WKM_NOTES wKRNT_ID) {
			WKRNT_ID = wKRNT_ID;
		}
		
	    
	    
}
