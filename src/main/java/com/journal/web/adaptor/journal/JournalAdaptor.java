package com.journal.web.adaptor.journal;

import com.journal.common.constant.Constant;
import com.journal.web.entity.request.journal.WriteJournalRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @author: GaoJean
 * @ClassName: JournalController
 * @Description: 日志
 * @date: 2017/11/8
 */
@Component
public class JournalAdaptor {
    public String writeJournal(WriteJournalRequest request) {
        if(StringUtils.isEmpty(request.getContent()) || StringUtils.isEmpty(request.getTag()) ||StringUtils.isEmpty(request.getTheme())
                ||StringUtils.isEmpty(request.getTitle())){
            return Constant.ServiceCode.CODE_1;
        }

        return "";
    }
}
 