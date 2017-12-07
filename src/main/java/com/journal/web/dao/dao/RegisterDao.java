package com.journal.web.dao.dao;


import java.util.List;
import java.util.Map;

import org.mapstruct.Mapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.journal.web.dao.dto.RegisterDTO;
import org.springframework.stereotype.Repository;

@Component(value = "registerDao")
@Mapper
public interface RegisterDao {
    int deleteByPrimaryKey(String rehisterId);

    int insert(RegisterDTO record);

    int insertSelective(RegisterDTO record);

    RegisterDTO selectByPrimaryKey(String rehisterId);

    RegisterDTO selectRegister(Map<String, Object> paramsMap);

    int updateByPrimaryKeySelective(RegisterDTO record);

    int updateByPrimaryKey(RegisterDTO record);

    List<RegisterDTO> selectRegisterList(RegisterDTO paramsList);

    //int updateBatchRegisterRecords(List<AuitRegister> auitRegisters);
}