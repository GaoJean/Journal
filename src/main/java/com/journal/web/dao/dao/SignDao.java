package com.journal.web.dao.dao;


import com.journal.web.dao.dto.SignDTO;

public interface SignDao {
    int deleteByPrimaryKey(String signId);

    int insert(SignDTO record);

    int insertSelective(SignDTO record);

    SignDTO selectByPrimaryKey(String signId);

    int updateByPrimaryKeySelective(SignDTO record);

    int updateByPrimaryKey(SignDTO record);
}