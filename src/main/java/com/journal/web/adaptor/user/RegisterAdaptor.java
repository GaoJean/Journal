package com.journal.web.adaptor.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.journal.common.constant.Constant;
import com.journal.common.util.GenerateUUIDUtil;
import com.journal.web.dao.dto.RegisterDTO;
import com.journal.web.dao.dto.UserDTO;
import com.journal.web.entity.request.user.AuitRegisterRequest;
import com.journal.web.entity.request.user.AuitRegisterRequest.AuitRegister;
import com.journal.web.entity.request.user.RegisterRequest;
import com.journal.web.entity.response.user.GetRegisterListResponse;
import com.journal.web.entity.response.user.GetRegisterListResponse.RegisterModel;
import com.journal.web.service.user.RegisterService;
import com.journal.web.service.user.UserService;

/**
 * @author: GaoJean
 * @ClassName: RegisterAdaptor
 * @Description: 注册视图业务层
 * @date: 2017/10/30
 */
@Component
public class RegisterAdaptor {

    @Autowired
    private RegisterService registerService;

    @Autowired
    private UserService userService;

    //注册
    public String userRegister(RegisterRequest registerRequest) {
        String userAccount = registerRequest.getUserAccount();
        String userTel = registerRequest.getUserTel();
        String userPassword = registerRequest.getUserPassword();
        if (StringUtils.isEmpty(userAccount) || StringUtils.isEmpty(userPassword) || StringUtils.isEmpty(userTel)) {
            return Constant.ServiceCode.CODE_2;
        }
        List<RegisterDTO> paramList = new ArrayList<>();
        RegisterDTO param = new RegisterDTO();
        param.setUserPassword(userPassword);
        param.setUserAccount(userAccount);
        param.setUserTel(userTel);
        param.setRegisterStatus(Constant.APPROVAL_STATUS.APPROVAL_PENDING);
        paramList.add(param);
        List<RegisterDTO> registerExt1 = registerService.getRegisterRecords(paramList);
        if (registerExt1.size() > 0) {
            return Constant.ServiceCode.CODE_3;
        }
        RegisterDTO registerExt = new RegisterDTO();
        registerExt.setRehisterId(GenerateUUIDUtil.randomPK());
        registerExt.setRoleId(Constant.ROLE.ROLE_USER);
        registerExt.setRegisterStatus(Constant.APPROVAL_STATUS.APPROVAL_PENDING);
        registerExt.setUserAccount(userAccount);
        registerExt.setUserTel(userTel);
        registerExt.setUserPassword(userPassword);
        int result = registerService.addRegisterRecord(registerExt);
        if (result == 0) {
            return Constant.ServiceCode.CODE_1;
        }
        return Constant.ServiceCode.CODE_0;

    }

    //获取注册列表
    public String getRegisterList(GetRegisterListResponse getRegisterListResponse) {
        List<RegisterDTO> paramList = new ArrayList<>();
        RegisterDTO param = new RegisterDTO();
        param.setRegisterStatus(Constant.APPROVAL_STATUS.APPROVAL_PENDING);
        paramList.add(param);
        List<RegisterDTO> registerExt1 = registerService.getRegisterRecords(paramList);
        if (registerExt1 == null || registerExt1.isEmpty()) {
            return Constant.ServiceCode.CODE_1;
        }
        List<RegisterModel> registerList = new ArrayList<>();
        RegisterModel registerModel = null;
        for (RegisterDTO registerExt : registerExt1) {
            registerModel = new RegisterModel();
            BeanUtils.copyProperties(registerExt, registerModel);
            registerList.add(registerModel);
        }
        getRegisterListResponse.setRegisterList(registerList);
        return Constant.ServiceCode.CODE_0;
    }

    //审批
    public String auitRegister(AuitRegisterRequest auitRegisterRequest) {
        List<AuitRegister> auitRegisters = auitRegisterRequest.getAuitRegisterList();
        List<String> registerIdList = new ArrayList<>();
        List<UserDTO> userExtList = new ArrayList<>();
        UserDTO userExt = null;
        for (AuitRegister auitRegister : auitRegisters) {
            registerIdList.add(auitRegister.getRehisterId());
        }
        List<RegisterDTO> getRegister = registerService.selectAuitRegister(registerIdList);
        for (RegisterDTO registerExt : getRegister) {
            if (!registerExt.getRegisterStatus().equals(Constant.APPROVAL_STATUS.APPROVAL_PENDING)) {
                return Constant.ServiceCode.CODE_2;//审批状态发生变化
            }
        }
        int registerResult = 0;
//        int registerResult = registerService.updateBatchRegisterRecords(auitRegisters);
        if (registerResult == 0) {
            for (RegisterDTO registerExt : getRegister) {
                userExt = new UserDTO();
                userExt.setUserId(GenerateUUIDUtil.randomPK());
                userExt.setRoleId(registerExt.getRoleId());
                userExt.setUserName(registerExt.getUserAccount());
                userExt.setUserAccount(registerExt.getUserAccount());
                userExt.setUserPassword(registerExt.getUserPassword());
                userExt.setUserTel(registerExt.getUserTel());
                userExt.setCreateTime(new Date());

                userExtList.add(userExt);
            }
            int addResult =  userService.addUser(userExtList);
            if (addResult != 0){
                return Constant.ServiceCode.CODE_1;
            }
        }
        return Constant.ServiceCode.CODE_0;
    }
}
