package com.journal.web.dao.dao;


import com.journal.web.dao.dto.RoleDTO;

public interface RoleDao {
    int deleteByPrimaryKey(String roleId);

    int insert(RoleDTO record);

    int insertSelective(RoleDTO record);

    RoleDTO selectByPrimaryKey(String roleId);

    int updateByPrimaryKeySelective(RoleDTO record);

    int updateByPrimaryKey(RoleDTO record);
}