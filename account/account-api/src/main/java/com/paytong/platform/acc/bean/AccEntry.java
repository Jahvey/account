/* 
 * AccEntry.java  
 * 
 * version TODO
 *
 * 2015年9月7日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.paytong.platform.acc.bean;

import java.io.Serializable;
import java.util.Date;

import com.paytong.platform.acc.bean.enums.AccEntryStatus;
import com.paytong.platform.acc.bean.enums.CRDRType;
import com.paytong.platform.acc.bean.enums.TradeType;
import com.paytong.platform.acc.bean.enums.Usage;
import com.paytong.platform.acc.pojo.Money;
/**
 * Class Description
 * 分录流水Bean
 * @author yangpeng
 * @version
 * @date 2015年9月7日 上午10:32:43
 * @since 
 */
public class AccEntry implements Serializable {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -7075373065683147027L;
    /**凭证号**/
    private Long voucherCode;
    /**账号/科目号**/
    private String acctCode;
    /**借贷标志1-借2-贷**/
    private CRDRType crdr;
    /**金额(分)**/
    private Money amount;
    /**1:本金,2手续费,3其他**/
    private String amtOrFee;
    /**支付订单号**/
    private String payordno;
    /**交易流水号**/
    private String txnseqno;
    /**状态:00-已记账，01-未记账**/
    private AccEntryStatus status;
    /**分录时间**/
    private Date inTime;
    /**交易类型代码**/
    private String busiCode;
    
    private String memberId;
    //账户名
    private String busiAcctName;
    private Usage usage;
    //交易类型
    private TradeType tradeType;
    private String amountYuan;
    
    
    /**
     * @return the amountYuan
     */
    public String getAmountYuan() {
        return amountYuan;
    }
    /**
     * @param amountYuan the amountYuan to set
     */
    public void setAmountYuan(String amountYuan) {
        this.amountYuan = amountYuan;
    }
    /**
     * @return the usage
     */
    public Usage getUsage() {
        return usage;
    }
    /**
     * @param usage the usage to set
     */
    public void setUsage(Usage usage) {
        this.usage = usage;
    }
    /**
     * @return the tradeType
     */
    public TradeType getTradeType() {
        return tradeType;
    }
    /**
     * @param tradeType the tradeType to set
     */
    public void setTradeType(TradeType tradeType) {
        this.tradeType = tradeType;
    }
    /**
     * @return the memberId
     */
    public String getMemberId() {
        return memberId;
    }
    /**
     * @param memberId the memberId to set
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
    /**
     * @return the busiAcctName
     */
    public String getBusiAcctName() {
        return busiAcctName;
    }
    /**
     * @param busiAcctName the busiAcctName to set
     */
    public void setBusiAcctName(String busiAcctName) {
        this.busiAcctName = busiAcctName;
    }
    public Long getVoucherCode() {
        return voucherCode;
    }
    public void setVoucherCode(Long voucherCode) {
        this.voucherCode = voucherCode;
    }
    public String getAcctCode() {
        return acctCode;
    }
    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }
    public CRDRType getCrdr() {
        return crdr;
    }
    public void setCrdr(CRDRType crdr) {
        this.crdr = crdr;
    }
    public Money getAmount() {
        return amount;
    }
    public void setAmount(Money amount) {
        this.amount = amount;
    }
    public String getAmtOrFee() {
        return amtOrFee;
    }
    public void setAmtOrFee(String amtOrFee) {
        this.amtOrFee = amtOrFee;
    }
    public String getPayordno() {
        return payordno;
    }
    public void setPayordno(String payordno) {
        this.payordno = payordno;
    }
    public String getTxnseqno() {
        return txnseqno;
    }
    public void setTxnseqno(String txnseqno) {
        this.txnseqno = txnseqno;
    }
    public AccEntryStatus getStatus() {
        return status;
    }
    public void setStatus(AccEntryStatus status) {
        this.status = status;
    }
    public Date getInTime() {
        return inTime;
    }
    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }
    public String getBusiCode() {
        return busiCode;
    }
    public void setBusiCode(String busiCode) {
        this.busiCode = busiCode;
    }
    
    

}
