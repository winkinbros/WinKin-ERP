package com.winkin.erp.model;



import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@DynamicUpdate
@Table(name = "WKM_USER")
public class WKM_USER  implements Serializable {

    private static final long serialVersionUID = 2L;

    @Id
    @Column(name = "WKU_ID", unique = true)
    private String WKU_ID;

    @Column(name = "WKU_REG_MOBILE")
    private String WKU_REG_MOBILE;
    
    @Column(name = "WKU_REG_EMAIL")
    private String WKU_REG_EMAIL;

    @Column(name = "WKU_OTP_HASH")
    private String WKU_OTP_HASH;

    @Column(name = "WKU_OTP")
    private String WKU_OTP;

    @Column(name = "WKU_LOCKED_YN")
    private String WKU_LOCKED_YN;

    @Column(name = "WKU_STATUS_YN")
    private String WKU_STATUS_YN;

}