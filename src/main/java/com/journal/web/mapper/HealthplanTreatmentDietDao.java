package com.journal.web.mapper;

import com.journal.web.DTO.HealthplanTreatmentDietEntity;

public interface HealthplanTreatmentDietDao {
    int deleteByPrimaryKey(Long id);

    int insert(HealthplanTreatmentDietEntity record);

    int insertSelective(HealthplanTreatmentDietEntity record);

    HealthplanTreatmentDietEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HealthplanTreatmentDietEntity record);

    int updateByPrimaryKey(HealthplanTreatmentDietEntity record);
}