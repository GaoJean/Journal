package com.journal.web.entity.request.user;


import com.journal.web.entity.BaseRequest;

/**
 * @author: GaoJean
 * @ClassName: RegisterRequest
 * @Description: TODO
 * @date: 2017/10/30
 */
public class RegisterRequest  extends BaseRequest {


    private String userAccount;

    private String userPassword;

    private String userTel;

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
}
