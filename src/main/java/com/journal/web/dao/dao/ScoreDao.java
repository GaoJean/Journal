package com.journal.web.dao.dao;


import com.journal.web.dao.dto.ScoreDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreDao {
    //int deleteByPrimaryKey(ScoreKey key);

    int insert(ScoreDTO record);

    int insertSelective(ScoreDTO record);

    //ScoreDTO selectByPrimaryKey(ScoreKey key);

    int updateByPrimaryKeySelective(ScoreDTO record);

    int updateByPrimaryKey(ScoreDTO record);
}