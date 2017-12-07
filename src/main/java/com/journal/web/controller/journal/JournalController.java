package com.journal.web.controller.journal;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.*;

import com.journal.common.verify.Verification;
import com.journal.web.adaptor.journal.JournalAdaptor;
import com.journal.web.entity.BaseResponse;
import com.journal.web.entity.request.journal.GetAllJournalsRequest;
import com.journal.web.entity.request.journal.WriteJournalRequest;
import com.journal.web.model.ResultModel;

import io.swagger.annotations.ApiOperation;

/**
 * @author: GaoJean
 * @ClassName: JournalController
 * @Description: 日志
 * @date: 2017/11/8
 */
@RestController  
@RequestMapping(value="/journal")
public class JournalController {
    
    @Resource
    private JournalAdaptor journalAdaptor;

    /**
     * 编写日志
     * @param request
     * @return
     */
    @ApiOperation(value="编写日志", notes="编写日志",response =BaseResponse.class)
    @PostMapping(value = "/writeJournal")
    @Verification
    public ResultModel writeJournal(@RequestBody WriteJournalRequest request){
        BaseResponse response = new BaseResponse();
        response.setSuccess(journalAdaptor.writeJournal(request));
        return new ResultModel(response);
    }


    /**
     *
     * @param request
     * @return
     */
    @ApiOperation(value="获得所有的日志", notes="获得所有的日志",response =BaseResponse.class)
    @PostMapping(value = "/getAllJournals")
    @Verification
    public ResultModel getAllJournals(@RequestBody GetAllJournalsRequest request){

        return new ResultModel();
    }

}
