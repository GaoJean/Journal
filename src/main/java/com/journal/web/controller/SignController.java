package com.journal.web.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.journal.common.util.PagerInfo;
import com.journal.common.verify.Verification;
import com.journal.web.adaptor.SignAdaptor;
import com.journal.web.entity.BaseResponse;
import com.journal.web.entity.request.journal.WriteJournalRequest;
import com.journal.web.entity.request.sign.AddSignRequest;
import com.journal.web.entity.response.sign.GetSignListResponse;
import com.journal.web.model.ResultModel;

@RestController
@RequestMapping(value = "/sign")
public class SignController {

	@Resource
	private SignAdaptor signAdaptor;

	/**
	 * 新增签到记录
	 * 
	 * @param request
	 * @return
	 */
	@ApiOperation(value = "新增签到记录", notes = "新增签到记录", response = BaseResponse.class)
	@PostMapping(value = "/add")
	@Verification
	public ResultModel add(@RequestBody AddSignRequest request) {
		BaseResponse response = new BaseResponse();
		response.setSuccess(signAdaptor.add(request));
		return new ResultModel(response);
	}

	/**
	 * 获取所有的签到记录
	 * 
	 * @param request
	 * @return
	 */
	@ApiOperation(value = "获取所有的签到记录", notes = "获取所有的签到记录")
	@GetMapping(value = "/getAll")
	@Verification
	public ResultModel getAll(
			@RequestParam(value = "signMouth", required = false) Date signMouth,
			@RequestParam(value = "userId", required = false) String userId,
			@RequestParam(value = "page", defaultValue = "1", required = false) Integer page,
			@RequestParam(value = "size", defaultValue = "15", required = false) Integer size) {
		
		GetSignListResponse response = new GetSignListResponse();
		PagerInfo pagerInfo = new PagerInfo(page, size);
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("offset", pagerInfo.getStart());
		params.put("size", pagerInfo.getPageSize());
		params.put("userId", userId);
		params.put("signMouth", signMouth);
		response.setSuccess(signAdaptor.getAll(params, response));
		return new ResultModel(response);
	}
}
