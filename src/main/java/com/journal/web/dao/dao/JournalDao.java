package com.journal.web.dao.dao;


import com.journal.web.dao.dto.JournalDTO;

public interface JournalDao {
    int deleteByPrimaryKey(String journalId);

    int insert(JournalDTO record);

    int insertSelective(JournalDTO record);

    JournalDTO selectByPrimaryKey(String journalId);

    int updateByPrimaryKeySelective(JournalDTO record);

    int updateByPrimaryKeyWithBLOBs(JournalDTO record);

    int updateByPrimaryKey(JournalDTO record);
}