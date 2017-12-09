package com.journal.web.adaptor.user;
import com.journal.web.entity.response.user.LoginResponse;
import com.journal.web.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static com.journal.common.constant.Constant.SESSION_AND_COOKIE.*;


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

    private void initLoginResponse(HttpServletRequest request, LoginResponse loginResponse) {
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

    public String login(String username, String password, HttpServletRequest request, LoginResponse loginResponse){
        /*if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            return Constant.ServiceCode.CODE_1;
        }
        Map<String,Object> resultMap = new HashMap<String, Object>();
        UserDTO userEntity = null;
        RegisterDTO registerExt = null;
        HttpSession session = request.getSession();
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("userAccount", username);
        params.put("userPassword", password);
        userEntity = userDao.selectUser(params);
        registerExt = registerDao.selectRegister(params);
       if(resultMap.get("01") != null){

       }else if (resultMap.get("01") != null){

       } else if (resultMap.get("01") != null){

       }*/
        userService.login(username,password,request,loginResponse);
        return "";

    }


    /*//将用户数据保存在session中
    private void initSession(HttpServletRequest request, UserDTO userEntity) {
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
    }*/
}
