package com.journal.web.entity.request.sign;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

import com.journal.web.entity.BaseRequest;

@Getter
@Setter
public class AddSignRequest extends BaseRequest implements Serializable{

	private static final long serialVersionUID = -7178583854215492899L;

	@ApiModelProperty(value = "签到时间")
	private Date signTime;
	
	@ApiModelProperty(value = "签到用户")
	private String userId;
}
