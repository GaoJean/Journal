package com.journal.web.entity.response.journal;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

import com.journal.web.entity.BaseResponse;

@Getter
@Setter
public class JournalDetailResponse extends BaseResponse implements Serializable{

	private static final long serialVersionUID = -2659189922966001023L;
	
	@ApiModelProperty(value = "日志id")
	private String id;
	
	@ApiModelProperty(value = "日志标题")
	private String journalTitle;
	
	@ApiModelProperty(value = "日志内容")
	private String journalContent;
	
	@ApiModelProperty(value = "创建时间")
	private Date createTime;
	
	@ApiModelProperty(value = "更新时间")
	private Date updateTime;

}
