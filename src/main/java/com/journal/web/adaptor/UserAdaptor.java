package com.journal.web.adaptor;

import static com.journal.common.constant.Constant.SESSION_AND_COOKIE.SESSION_ROLE_ID;
import static com.journal.common.constant.Constant.SESSION_AND_COOKIE.SESSION_TEL;
import static com.journal.common.constant.Constant.SESSION_AND_COOKIE.SESSION_TOKEN;
import static com.journal.common.constant.Constant.SESSION_AND_COOKIE.SESSION_USER;
import static com.journal.common.constant.Constant.SESSION_AND_COOKIE.SESSION_USER_ACCOUNT;
import static com.journal.common.constant.Constant.SESSION_AND_COOKIE.SESSION_USER_AGE;
import static com.journal.common.constant.Constant.SESSION_AND_COOKIE.SESSION_USER_ID;
import static com.journal.common.constant.Constant.SESSION_AND_COOKIE.SESSION_USER_NAME;
import static com.journal.common.constant.Constant.SESSION_AND_COOKIE.SESSION_USER_PORTRAIT_URL;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.journal.common.util.GenerateUUIDUtil;
import com.journal.web.corentity.UserEntity;
import com.journal.web.entity.response.user.LoginResponse;
import com.journal.web.service.UserService;


/**
 * @author: GaoJean
 * @ClassName: UserAdaptor
 * @Description: user视图层，方便组装用户数据
 * @date: 2017/10/29
 */
@Component
public class UserAdaptor {

    @Autowired
    private UserService userService;
    
    public int login(String username, String password, HttpServletRequest request, LoginResponse loginResponse){
    	if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
    		return 1;
    	}
    	UserEntity userEntity = null;
    	Map<String, Object> params = new HashMap<String, Object>();
    	params.put("userAccount", username);
    	params.put("userPassword", password);
    	userEntity = userService.login(params);
    	if (userEntity != null) {// 正常登陆
    		initSession(request,userEntity);
    		return 0;
    	} else {//用户不存在
    		return 1;
    	}
    }

    public void initLoginResponse(HttpServletRequest request, LoginResponse loginResponse) {
        HttpSession session = request.getSession();
        loginResponse.setUserAccount((String) session.getAttribute(SESSION_USER));
        loginResponse.setUserAge((String) session.getAttribute(SESSION_USER_AGE));
        loginResponse.setUserId((String) session.getAttribute(SESSION_USER_ID));
        loginResponse.setUserName((String) session.getAttribute(SESSION_USER_NAME));
        loginResponse.setUserPortraitUrl((String) session.getAttribute(SESSION_USER_PORTRAIT_URL));
        loginResponse.setUserTel((String) session.getAttribute(SESSION_TEL));
        loginResponse.setRoleId((String) session.getAttribute(SESSION_ROLE_ID));
        loginResponse.setToken((String) session.getAttribute(SESSION_TOKEN));
    }

    //将用户数据保存在session中
    private void initSession(HttpServletRequest request, UserEntity userEntity) {
        HttpSession session = request.getSession();
        session.setAttribute(SESSION_USER, userEntity);
        session.setAttribute(SESSION_USER_ID, userEntity.getUserId());
        session.setAttribute(SESSION_ROLE_ID, userEntity.getRoleId());
        session.setAttribute(SESSION_USER_ACCOUNT, userEntity.getUserAccount());
        session.setAttribute(SESSION_USER_AGE, userEntity.getUserAge());
        session.setAttribute(SESSION_USER_NAME, userEntity.getUserName());
        session.setAttribute(SESSION_USER_ID, userEntity.getUserPassword());
        session.setAttribute(SESSION_TEL, userEntity.getUserTel());
        session.setAttribute(SESSION_USER_PORTRAIT_URL, userEntity.getUserPortraitUrl());
        session.setAttribute(SESSION_TOKEN, GenerateUUIDUtil.randomPK());
    }
}
