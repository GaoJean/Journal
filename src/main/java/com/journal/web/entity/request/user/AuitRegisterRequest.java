package com.journal.web.entity.request.user;

import com.journal.web.entity.BaseRequest;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: GaoJean
 * @ClassName: AuitRegisterRequest
 * @Description: TODO
 * @date: 2017/11/2
 */
@Getter
@Setter
public class AuitRegisterRequest extends BaseRequest implements Serializable{

	private static final long serialVersionUID = -3214673077131113929L;
	private List<AuitRegister> auitRegisterList;

	public static class AuitRegister {
		@ApiModelProperty(value = "登录密码")
		private String rehisterId;
		@ApiModelProperty(value = "登录密码")
		private String auitStatus;
	}
}
