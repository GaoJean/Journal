package com.journal.web.service.user;

import com.journal.web.entity.response.user.LoginResponse;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: GaoJean
 * @ClassName: UserService
 * @Description: TODO
 * @date: 2017/10/28
 */
public interface UserService {
    /**
     * 登录
     * @param username
     * @param password
     * @param request
     * @param response
     */
    void login(String username, String password, HttpServletRequest request, LoginResponse response);


    /**
     * 批量新增用户
     *
     * @param userExtList
     * @return
     *//*
    default int addUser(List<UserDTO> userExtList) {
        return 0;
    }*/
}
