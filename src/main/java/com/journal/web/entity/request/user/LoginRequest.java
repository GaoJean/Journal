package com.journal.web.entity.request.user;


import com.journal.web.entity.BaseRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: GaoJean
 * @ClassName: UserRequest
 * @Description: TODO
 * @date: 2017/10/28
 */
@Getter
@Setter
public class LoginRequest extends BaseRequest {

    @ApiModelProperty(value="登录名")
    private String username;
    @ApiModelProperty(value="登录密码")
    private String password;

}
