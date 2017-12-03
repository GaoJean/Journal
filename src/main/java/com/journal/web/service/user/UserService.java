package com.journal.web.service.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.journal.web.dao.dto.UserDTO;
import com.journal.web.entity.response.user.LoginResponse;

/**
 * @author: GaoJean
 * @ClassName: UserService
 * @Description: TODO
 * @date: 2017/10/28
 */
@Component
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
     * @param userExtList
     * @return
     */
    int addUser(List<UserDTO> userExtList);
}
