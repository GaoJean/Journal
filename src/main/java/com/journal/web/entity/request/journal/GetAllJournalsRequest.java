package com.journal.web.entity.request.journal;

import java.util.List;

import com.journal.web.entity.BaseRequest;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: GaoJean
 * @ClassName: GetAllJournalsRequest
 * @Description: TODO
 * @date: 2017/11/14
 */
@Getter
@Setter
public class GetAllJournalsRequest extends BaseRequest {

    /**
     * 
     */
    private static final long serialVersionUID = -697730414640957971L;
    @ApiModelProperty(value="登录密码")
    private String timeSort;//降序 desc  升序 asc
    @ApiModelProperty(value="登录密码")
    private List<String> tagList;//标签集合
    @ApiModelProperty(value="登录密码")
    private String department;//部门
}
