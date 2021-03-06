package com.journal.web.controller;

import com.journal.common.verify.Verification;
import com.journal.web.adaptor.JournalAdaptor;
import com.journal.web.entity.BaseResponse;
import com.journal.web.entity.request.journal.GetAllJournalsRequest;
import com.journal.web.entity.request.journal.GetJournalByIdRequest;
import com.journal.web.entity.request.journal.WriteJournalRequest;
import com.journal.web.entity.response.journal.JournalDetailResponse;
import com.journal.web.entity.response.journal.JournalListResponse;
import com.journal.web.model.ResultModel;

import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
    @PostMapping(value = "/write")
    @Verification
    public ResultModel writeJournal(@RequestBody WriteJournalRequest request){
        BaseResponse response = new BaseResponse();
        response.setSuccess(journalAdaptor.writeJournal(request));
        return new ResultModel(response);
    }

    /**
     * 获得所有的日志
     * @param request
     * @return
     */
    @ApiOperation(value="获得所有的日志", notes="获得所有的日志",response =BaseResponse.class)
    @PostMapping(value = "/getAll")
    @Verification
    public ResultModel getAllJournals(@RequestBody GetAllJournalsRequest request){
    	JournalListResponse response = new JournalListResponse();
    	
        return new ResultModel(response);
    }
    
    /**
     * 获得所有的日志
     * @param request
     * @return
     */
    @ApiOperation(value="获得所有的日志", notes="获得所有的日志",response =BaseResponse.class)
    @PostMapping(value = "/getById")
    @Verification
    public ResultModel getJournalById(@RequestBody GetJournalByIdRequest request){
    	JournalDetailResponse response = new JournalDetailResponse();
    	
        return new ResultModel(response);
    }

}
