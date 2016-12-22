/* 
 * Subject.java  
 * 
 * version 1.0
 *
 * 2015年8月20日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.paytong.platform.acc.bean;

import java.io.Serializable;

import com.paytong.platform.acc.bean.enums.AcctElementType;
import com.paytong.platform.acc.bean.enums.CRDRType;

/**
 * Subject
 *
 * @author yangying
 * @version
 * @date 2015年8月20日 下午1:55:45
 * @since
 */
public class Subject implements Serializable {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -3447431864790574492L;

    private long id;

    private String acctCode;

    private String acctCodeName;

    private CRDRType crdr;

    private AcctElementType acctElement;

    private String dac;

    private String notes;

    private String remarks;

    private Subject parentSubject;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAcctCode() {
        return acctCode;
    }

    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }

    public String getAcctCodeName() {
        return acctCodeName;
    }

    public void setAcctCodeName(String acctCodeName) {
        this.acctCodeName = acctCodeName;
    }

    public CRDRType getCrdr() {
        return crdr;
    }

    public void setCrdr(CRDRType crdr) {
        this.crdr = crdr;
    }

    public AcctElementType getAcctElement() {
        return acctElement;
    }

    public void setAcctElement(AcctElementType acctElement) {
        this.acctElement = acctElement;
    }

    public String getDac() {
        return dac;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setDac(String dac) {
        this.dac = dac;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Subject getParentSubject() {
        return parentSubject;
    }

    public void setParentSubject(Subject parentSubject) {
        this.parentSubject = parentSubject;
    }

 
    
}
