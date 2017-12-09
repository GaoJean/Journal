package com.journal.web.controller.user;

import com.journal.common.verify.Verification;
import com.journal.web.adaptor.user.UserAdaptor;
import com.journal.web.entity.request.user.LoginRequest;
import com.journal.web.entity.response.user.LoginResponse;
import com.journal.web.model.ResultModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author: GaoJean
 * @ClassName: UserController
 * @Description: 用户
 * @date: 2017/10/28
 */
@RestController  
@RequestMapping(value="/user")
public class UserController {

	@Resource
	private UserAdaptor userAdaptor;

	@ApiOperation(value="登录", notes="登录",response =LoginResponse.class)
	@PostMapping(value = "/login")
    @Verification(token = false)
	public ResultModel login(@RequestBody LoginRequest loginRequest, HttpServletRequest request){
		ResultModel resultModel = new ResultModel();
		LoginResponse loginResponse = new LoginResponse();
		String username = loginRequest.getUsername();
		String password = loginRequest.getPassword();
		String result = userAdaptor.login(username,password,request,loginResponse);
		loginResponse.setSuccess(result);
		resultModel.setModel(loginResponse);
		return resultModel;
	}
}
