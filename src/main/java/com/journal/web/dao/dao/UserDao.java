package com.journal.web.dao.dao;


import com.journal.web.dao.dto.UserDTO;

import java.util.List;
import java.util.Map;

import org.mapstruct.Mapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component(value = "userDao")
@Mapper
public interface UserDao {
    int deleteByPrimaryKey(String userId);

    int insert(UserDTO record);

    int insertSelective(UserDTO record);

    UserDTO selectByPrimaryKey(String userId);

    UserDTO selectUser(Map<String, Object> params);

    int updateByPrimaryKeySelective(UserDTO record);

    int updateByPrimaryKey(UserDTO record);

    int insertUsers(List<UserDTO> record);
}