package com.journal.web.entity.response.sign;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.journal.web.entity.BaseResponse;

@Getter
@Setter
public class GetSignListResponse extends BaseResponse implements Serializable {
	private static final long serialVersionUID = -6083538893970852018L;

	private List<SignModel> signList;

	public static class SignModel {
		@ApiModelProperty(value = "签到id")
		private String signId;

		@ApiModelProperty(value = "签到用户")
		private String signPerson;

		@ApiModelProperty(value = "签到时间")
		private Date signTime;
	}

}
