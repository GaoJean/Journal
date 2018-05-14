package com.journal.web.adaptor.journal;

import com.journal.common.constant.Constant;
import com.journal.web.entity.request.journal.WriteJournalRequest;
import com.journal.web.service.user.UserService;

import org.springframework.beans.factory.annotation.Autowired;
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
    
    @Autowired
    private UserService userService;
    public String writeJournal(WriteJournalRequest request) {
        if(StringUtils.isEmpty(request.getContent()) || StringUtils.isEmpty(request.getTag()) ||StringUtils.isEmpty(request.getTheme())
                ||StringUtils.isEmpty(request.getTitle())){
            return Constant.ServiceCode.CODE_1;
        }

        return "";
    }

    /**
     * @return
     */
    public int insert() {
        return userService.insert();
    }
}
 