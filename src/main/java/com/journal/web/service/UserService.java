package com.journal.web.service;

import java.util.Map;

import com.journal.web.corentity.UserEntity;

/**
 * @author: GaoJean
 * @ClassName: UserService
 * @Description: TODO
 * @date: 2017/10/28
 */
public interface UserService {
	
   /**
    * 登录
    * @param params
    * @return
    */
	UserEntity login( Map<String, Object> params);

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
