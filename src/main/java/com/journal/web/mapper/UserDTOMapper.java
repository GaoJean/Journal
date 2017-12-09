package com.journal.web.mapper;

import com.journal.web.DTO.UserDTO;

public interface UserDTOMapper {
    int deleteByPrimaryKey(String userId);

    int insert(UserDTO record);

    int insertSelective(UserDTO record);

    UserDTO selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(UserDTO record);

    int updateByPrimaryKey(UserDTO record);
}