package com.journal.web.entity.response.user;


import com.journal.web.entity.BaseResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author: GaoJean
 * @ClassName: AuitRegisterResponse
 * @Description: TODO
 * @date: 2017/11/2
 */
@Getter
@Setter
public class AuitRegisterResponse extends BaseResponse {
    private String rehisterId;

    private String roleId;

    private String userAccount;

    private String userPassword;

    private String userTel;

    private String registerStatus;

    private Date createTime;

}
