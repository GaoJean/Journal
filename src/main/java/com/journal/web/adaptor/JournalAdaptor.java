package com.journal.web.adaptor;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.journal.common.constant.Constant;
import com.journal.web.corentity.JournalEntity;
import com.journal.web.entity.request.journal.WriteJournalRequest;
import com.journal.web.service.JournalService;

/**
 * @author: GaoJean
 * @ClassName: JournalController
 * @Description: 日志
 * @date: 2017/11/8
 */
@Component
public class JournalAdaptor {

	@Resource
	private JournalService journalService;

	public String writeJournal(WriteJournalRequest request) {
		if (StringUtils.isEmpty(request.getJournalContent())
				|| StringUtils.isEmpty(request.getTag())
				|| StringUtils.isEmpty(request.getTheme())
				|| StringUtils.isEmpty(request.getTitle())) {
			return Constant.ServiceCode.CODE_1;
		}
		JournalEntity journalEntity = new JournalEntity();
		int addResult = journalService.addJournalRecords(journalEntity);
		return String.valueOf(addResult);
	}
}
