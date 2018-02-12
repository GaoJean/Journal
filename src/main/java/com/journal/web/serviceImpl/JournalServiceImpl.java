package com.journal.web.serviceImpl;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.stereotype.Service;

import com.journal.common.logger.Logger;
import com.journal.common.logger.LoggerFactory;
import com.journal.web.corentity.JournalEntity;
import com.journal.web.dto.JournalDTO;
import com.journal.web.mapper.JournalMapper;
import com.journal.web.service.JournalService;

@Service("journalService")
public class JournalServiceImpl implements JournalService {

	private final static Logger logger = LoggerFactory.getLogger(JournalServiceImpl.class);

	@Resource
	private JournalMapper journalMapper;

	@Override
	public int addJournalRecords(JournalEntity journalEntity) {
		try {
			logger.info("====增加日志====,param={}", journalEntity);
			JournalDTO journalDTO = new JournalDTO();
			BeanUtils.copyProperties(journalEntity, journalDTO);
			int result = 0;
			logger.info("====增加日志====,结果为{}", result > 0 ? true : false);
		} catch (BeansException e) {
			e.printStackTrace();
			logger.info("====增加日志====ERR:", e);
			return 1;
		}
		return 0;
	}

}
