package com.journal.web.corentity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserEntity {
    private String userId;

    private String userName;

    private String userAge;

    private String roleId;

    private String userAccount;

    private String userPassword;

    private String userTel;

    private String userPortraitUrl;

    private Date createTime;

    private Date modifyTime;

}