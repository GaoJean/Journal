package com.journal.web.entity.request.journal;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

import com.journal.web.entity.BaseRequest;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: GaoJean
 * @ClassName: WriteJournalRequest
 * @Description: TODO
 * @date: 2017/11/8
 */
@Setter
@Getter
public class WriteJournalRequest extends BaseRequest implements Serializable{

	private static final long serialVersionUID = 734066643249892687L;

	@ApiModelProperty(value = "日志内容")
    private String journalContent;
	
	@ApiModelProperty(value = "日志标题")
    private String title;
	
	@ApiModelProperty(value = "日志标签")
    private String tag;
	
	@ApiModelProperty(value = "日志主题")
    private String theme;

}
