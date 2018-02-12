package com.journal.web.mapper;

import java.util.Map;

import com.journal.web.dto.UserDTO;

public interface UserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(UserDTO record);

    int insertSelective(UserDTO record);

    UserDTO selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(UserDTO record);

    int updateByPrimaryKey(UserDTO record);
    
    UserDTO login(Map<String, Object> params);
}