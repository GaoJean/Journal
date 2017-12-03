package com.journal.web.serviceImpl.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.journal.common.constant.Constant;
import com.journal.common.util.GenerateUUIDUtil;
import com.journal.web.dao.dao.RegisterDao;
import com.journal.web.dao.dao.UserDao;
import com.journal.web.dao.dto.RegisterDTO;
import com.journal.web.dao.dto.UserDTO;
import com.journal.web.entity.response.user.LoginResponse;
import com.journal.web.service.user.UserService;

/**
 * @author: GaoJean
 * @ClassName: UserServiceImpl
 * @Description: 用户实现类
 * @date: 2017/10/28
 */
@Component 
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Resource
    private RegisterDao registerDao;


    /**
     * 登录
     *
     * @param username
     * @param password
     * @param request
     * @param loginResponse
     */
    @Override
    public void login(String username, String password, HttpServletRequest request, LoginResponse loginResponse) {
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            loginResponse.setSuccess(Constant.ServiceCode.CODE_2);
        } else {
            UserDTO userEntity = null;
            RegisterDTO registerExt = null;
            HttpSession session = request.getSession();
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("userAccount", username);
            params.put("userPassword", password);
            userEntity = userDao.selectUser(params);
            registerExt = registerDao.selectRegister(params);

            if (userEntity == null && registerExt == null) {//账号不存在
                loginResponse.setSuccess(Constant.ServiceCode.CODE_3);
            } else if (registerExt != null && userEntity == null) {//已注册，但还没通过
                loginResponse.setSuccess(Constant.ServiceCode.CODE_4);
            } else if (registerExt != null && userEntity != null) {//已注册，已通过
                initSession(request, userEntity);
                initLoginResponse(request, loginResponse);
                loginResponse.setSuccess(Constant.ServiceCode.CODE_0);
            } else {
                loginResponse.setSuccess(Constant.ServiceCode.CODE_1);
            }
        }

    }

    /**
     * 批量新增用户
     *
     * @param userExtList
     * @return
     */
    @Override
    public int addUser(List<UserDTO> userExtList) {
        int result = 1;
        try {
             result = userDao.insertUsers(userExtList);
        } catch (Exception e) {
            e.printStackTrace();
            return result;
        }
        return result;
    }

    private void initLoginResponse(HttpServletRequest request, LoginResponse loginResponse) {
        HttpSession session = request.getSession();
        loginResponse.setUserAccount((String) session.getAttribute(Constant.SESSION_AND_COOKIE.SESSION_USER_ACCOUNT));
        loginResponse.setUserAge((String) session.getAttribute(Constant.SESSION_AND_COOKIE.SESSION_USER_AGE));
        loginResponse.setUserId((String) session.getAttribute(Constant.SESSION_AND_COOKIE.SESSION_USER_ID));
        loginResponse.setUserName((String) session.getAttribute(Constant.SESSION_AND_COOKIE.SESSION_USER_NAME));
        loginResponse.setUserPortraitUrl((String) session.getAttribute(Constant.SESSION_AND_COOKIE.SESSION_USER_PORTRAIT_URL));
        loginResponse.setUserTel((String) session.getAttribute(Constant.SESSION_AND_COOKIE.SESSION_TEL));
        loginResponse.setRoleId((String) session.getAttribute(Constant.SESSION_AND_COOKIE.SESSION_ROLE_ID));
        loginResponse.setToken((String) session.getAttribute(Constant.SESSION_AND_COOKIE.SESSION_TOKEN));
    }


    //将用户数据保存在session中
    private void initSession(HttpServletRequest request, UserDTO userEntity) {
        HttpSession session = request.getSession();
        session.setAttribute(Constant.SESSION_AND_COOKIE.SESSION_USER, userEntity);
        session.setAttribute(Constant.SESSION_AND_COOKIE.SESSION_USER_ID, userEntity.getUserId());
        session.setAttribute(Constant.SESSION_AND_COOKIE.SESSION_ROLE_ID, userEntity.getRoleId());
        session.setAttribute(Constant.SESSION_AND_COOKIE.SESSION_USER_ACCOUNT, userEntity.getUserAccount());
        session.setAttribute(Constant.SESSION_AND_COOKIE.SESSION_USER_AGE, userEntity.getUserAge());
        session.setAttribute(Constant.SESSION_AND_COOKIE.SESSION_USER_NAME, userEntity.getUserName());
        session.setAttribute(Constant.SESSION_AND_COOKIE.SESSION_USER_ID, userEntity.getUserPassword());
        session.setAttribute(Constant.SESSION_AND_COOKIE.SESSION_TEL, userEntity.getUserTel());
        session.setAttribute(Constant.SESSION_AND_COOKIE.SESSION_USER_PORTRAIT_URL, userEntity.getUserPortraitUrl());
        session.setAttribute(Constant.SESSION_AND_COOKIE.SESSION_TOKEN, GenerateUUIDUtil.randomPK());
    }

}
