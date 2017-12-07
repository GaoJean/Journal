package com.journal.web.controller.user;

import com.journal.common.verify.Verification;
import com.journal.web.adaptor.user.RegisterAdaptor;
import com.journal.web.entity.BaseResponse;
import com.journal.web.entity.request.user.AuitRegisterRequest;
import com.journal.web.entity.request.user.RegisterRequest;
import com.journal.web.entity.response.user.GetRegisterListResponse;
import com.journal.web.model.ResultModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: GaoJean
 * @ClassName: RegisterController
 * @Description: 注册
 * @date: 2017/10/29
 */
@RequestMapping("/register")
@RestController
public class RegisterController {

    @Autowired
    private RegisterAdaptor registerAdaptor;

    @ApiOperation(value="用户注册", notes="用户注册",response =BaseResponse.class)
    @RequestMapping(value = "/userRegister", method = RequestMethod.POST)
    @Verification(token = false)
    public ResultModel userRegister(@RequestBody RegisterRequest registerRequest) {
        ResultModel resultModel = new ResultModel();
        BaseResponse response = new BaseResponse();
        response.setSuccess(registerAdaptor.userRegister(registerRequest));
        resultModel.setModel(response);
        return resultModel;
    }

    @ApiOperation(value="获取注册列表", notes="获取注册列表",response =GetRegisterListResponse.class)
    @RequestMapping(value = "/getRegisterList", method = RequestMethod.POST)
    @Verification
    public ResultModel getRegisterList(@RequestBody HttpServletRequest httpServletRequest) {
        ResultModel resultModel = new ResultModel();
        GetRegisterListResponse getRegisterListResponse = GetRegisterListResponse.getInstance();
        String result = registerAdaptor.getRegisterList(getRegisterListResponse);
        getRegisterListResponse.setSuccess(result);
        resultModel.setModel(getRegisterListResponse);
        return resultModel;
    }

    @ApiOperation(value="审批注册", notes="审批注册",response =BaseResponse.class)
    @RequestMapping(value = "/auitRegister",method = RequestMethod.POST)
    @ResponseBody
    @Verification
    public ResultModel auitRegister(@RequestBody AuitRegisterRequest auitRegisterRequest){
        ResultModel resultModel = new ResultModel();
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setSuccess(registerAdaptor.auitRegister(auitRegisterRequest));
        return resultModel;
    }
}
