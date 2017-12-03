package com.journal.web.entity.response.user;


import com.journal.web.entity.BaseResponse;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: GaoJean
 * @ClassName: LoginResponse
 * @Description: TODO
 * @date: 2017/10/29
 */
@Getter
@Setter
public class LoginResponse extends BaseResponse {
    @ApiModelProperty(value="用户id")
    private String userId;
    @ApiModelProperty(value="用户名")
    private String userName;
    @ApiModelProperty(value="用户年龄")
    private String userAge;
    @ApiModelProperty(value="角色id")
    private String roleId;
    @ApiModelProperty(value="登录名")
    private String userAccount;
    @ApiModelProperty(value="用户电话")
    private String userTel;
    @ApiModelProperty(value="用户头像URL")
    private String userPortraitUrl;
    @ApiModelProperty(value="token")
    private String token;

}
