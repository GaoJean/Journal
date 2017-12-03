package com.journal.web.entity.request.user;


import com.journal.web.entity.BaseRequest;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author: GaoJean
 * @ClassName: AuitRegisterRequest
 * @Description: TODO
 * @date: 2017/11/2
 */
public class AuitRegisterRequest extends BaseRequest {

    private List<AuitRegister> auitRegisterList;

    public static class AuitRegister{
        @ApiModelProperty(value="登录密码")
        private String rehisterId;
        @ApiModelProperty(value="登录密码")
        private String auitStatus;

        public String getRehisterId() {
            return rehisterId;
        }

        public void setRehisterId(String rehisterId) {
            this.rehisterId = rehisterId;
        }

        public String getAuitStatus() {
            return auitStatus;
        }

        public void setAuitStatus(String auitStatus) {
            this.auitStatus = auitStatus;
        }
    }

    public List<AuitRegister> getAuitRegisterList() {
        return auitRegisterList;
    }

    public void setAuitRegisterList(List<AuitRegister> auitRegisterList) {
        this.auitRegisterList = auitRegisterList;
    }
}
