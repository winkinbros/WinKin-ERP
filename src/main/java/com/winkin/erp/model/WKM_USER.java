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

    @Column(name = "WKU_REG_MOBILE", unique = true)
    private String WKU_REG_MOBILE;

    @Column(name = "WKU_OTP_HASH", unique = true)
    private String WKU_OTP_HASH;

    @Column(name = "WKU_OTP")
    private String WKU_OTP;

    @Column(name = "WKU_LOCKED_YN")
    private String WKU_LOCKED_YN;

    @Column(name = "WKU_STATUS_YN")
    private String WKU_STATUS_YN;

    public String getWKU_ID() {
        return WKU_ID;
    }

    public void setWKU_ID(String WKU_ID) {
        this.WKU_ID = WKU_ID;
    }

    public String getWKU_REG_MOBILE() {
        return WKU_REG_MOBILE;
    }

    public void setWKU_REG_MOBILE(String WKU_REG_MOBILE) {
        this.WKU_REG_MOBILE = WKU_REG_MOBILE;
    }

    public String getWKU_OTP_HASH() {
        return WKU_OTP_HASH;
    }

    public void setWKU_OTP_HASH(String WKU_OTP_HASH) {
        this.WKU_OTP_HASH = WKU_OTP_HASH;
    }

    public String getWKU_OTP() {
        return WKU_OTP;
    }

    public void setWKU_OTP(String WKU_OTP) {
        this.WKU_OTP = WKU_OTP;
    }

    public String getWKU_LOCKED_YN() {
        return WKU_LOCKED_YN;
    }

    public void setWKU_LOCKED_YN(String WKU_LOCKED_YN) {
        this.WKU_LOCKED_YN = WKU_LOCKED_YN;
    }

    public String getWKU_STATUS_YN() {
        return WKU_STATUS_YN;
    }

    public void setWKU_STATUS_YN(String WKU_STATUS_YN) {
        this.WKU_STATUS_YN = WKU_STATUS_YN;
    }
}