package com.journal.web.entity.response.user;


import com.journal.web.entity.BaseResponse;

import java.util.Date;

/**
 * @author: GaoJean
 * @ClassName: AuitRegisterResponse
 * @Description: TODO
 * @date: 2017/11/2
 */
public class AuitRegisterResponse extends BaseResponse {
    private String rehisterId;

    private String roleId;

    private String userAccount;

    private String userPassword;

    private String userTel;

    private String registerStatus;

    private Date createTime;

    public String getRehisterId() {
        return rehisterId;
    }

    public void setRehisterId(String rehisterId) {
        this.rehisterId = rehisterId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getRegisterStatus() {
        return registerStatus;
    }

    public void setRegisterStatus(String registerStatus) {
        this.registerStatus = registerStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
