package com.journal.web.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by GaoJean on 2017/10/26.
 */
public class BaseResponse implements Serializable{
    /**
     * 成功与否 0-成功 1-失败 其他-由具体接口定义
     */
	@ApiModelProperty(value="业务成功code")
    private String success;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

}
