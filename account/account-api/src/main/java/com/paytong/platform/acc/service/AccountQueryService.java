/* 
 * CheckAccount.java  
 * 
 * version TODO
 *
 * 2015年9月7日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.paytong.platform.acc.service;

import java.util.Date;
import java.util.List;

import com.paytong.platform.acc.bean.AccEntry;
import com.paytong.platform.acc.bean.AccEntryQuery;
import com.paytong.platform.acc.bean.Account;
import com.paytong.platform.acc.bean.BusiAcct;
import com.paytong.platform.acc.bean.BusiAcctQuery;
import com.paytong.platform.acc.bean.QueryAccount;
import com.paytong.platform.member.commons.bean.PagedResult;
import com.paytong.platform.member.commons.service.IBasePageService;

/**
 * Class Description
 *账户查询 功能有
 *业务账户查询
 *业务账户余额查询
 *业务账户状态查询
 *分录流水查询
 * @author yangpeng
 * @version
 * @date 2015年9月7日 上午10:00:47
 * @since 
 */
public interface AccountQueryService extends IBasePageService<QueryAccount, BusiAcctQuery>{
    /**
     * 根据业务账户号得到会计账户
     * @param accountId
     * @return Account
     */
    public BusiAcctQuery getMemberQueryByID(String busiAcctCode);
    
    /**
     * 根据业务账户号得到分录流水
     * @param accountId
     * @return List<AccEntry>
     */
    public  PagedResult<AccEntry>  getAccEntryByCode(int page,int pageSize, String busiAcctCode, Date startTime,Date endTime);
    
    /**
     * @param accountId
     * @return Account
     * 根据会计账户ID得到会计账户信息
     */
    public Account getAccountByID(long accountId);
    
    /**
     * 根据条件得到分录流水
     * @param accountId
     * @return List<AccEntry>
     */
    public  PagedResult<AccEntry>  getAccEntryByQuery(int page,int pageSize,AccEntryQuery eQuery);
        /**
         * 根据会员号得到业务账户
         * @param memberid
         * @return BusiAcct
         */
    public List<BusiAcct> getBusiACCByMid(String memberid);
        /**
         * 根据会员号得到所有账户信息
         * @param memberId
         * 
         * @return List<MemberQuery>
         */
    public List<BusiAcctQuery> getAllBusiByMId(String memberId);
    /**
     * 根据业务账户号得到账户信息
     * @param busiAcctCode
     * @return List<MemberQuery>
     */
    public BusiAcctQuery getBusiQueryBybCode(String busiAcctCode);
}
