package com.journal.web.entity.request.user;


import com.journal.web.entity.BaseRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: GaoJean
 * @ClassName: RegisterRequest
 * @Description: TODO
 * @date: 2017/10/30
 */
@Getter
@Setter
public class RegisterRequest  extends BaseRequest {


    private String userAccount;

    private String userPassword;

    private String userTel;

}
