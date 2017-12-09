package com.journal.web.entity.request.journal;

import com.journal.web.entity.BaseRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: GaoJean
 * @ClassName: WriteJournalRequest
 * @Description: TODO
 * @date: 2017/11/8
 */
@SuppressWarnings("serial")
@Setter
@Getter
public class WriteJournalRequest extends BaseRequest{

    private String content;
    private String title;
    private String tag;
    private String theme;

}
