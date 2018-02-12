package com.journal.web.entity.request.journal;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import com.journal.web.entity.BaseRequest;

/**
 * @author: GaoJean
 * @ClassName: GetAllJournalsRequest
 * @Description: TODO
 * @date: 2017/11/14
 */
@Getter
@Setter
public class GetAllJournalsRequest extends BaseRequest implements Serializable{

	private static final long serialVersionUID = -697730414640957971L;
	@ApiModelProperty(value = "时间排序")
	private String timeSort;// 降序-01; 升序-02
	
	@ApiModelProperty(value = "查询起始时间")
	private String startTime;// 查询起始时间
	
	@ApiModelProperty(value = "查询结束时间")
	private String endTime;// 查询结束时间
	
	@ApiModelProperty(value = "用户id")
	private String userId;// 用户id
}
