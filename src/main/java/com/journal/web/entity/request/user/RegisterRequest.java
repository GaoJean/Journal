package com.journal.web.entity.request.user;


import java.io.Serializable;

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
public class RegisterRequest  extends BaseRequest implements Serializable{

	private static final long serialVersionUID = -4358940320110607987L;

	private String userAccount;

    private String userPassword;

    private String userTel;

}
