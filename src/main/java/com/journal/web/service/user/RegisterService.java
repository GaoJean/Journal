package com.journal.web.service.user;

import java.util.List;

import org.springframework.stereotype.Component;

import com.journal.web.dao.dto.RegisterDTO;

/**
 * @author: GaoJean
 * @ClassName: RegisterService
 * @Description: TODO
 * @date: 2017/10/30
 */
@Component
public interface RegisterService {

    /**
     * 注册
     * @param registerExt
     * @return
     */
    int addRegisterRecord(RegisterDTO registerExt);

    /**
     * 批量查询
     * @param paramList
     * @return
     */
    List<RegisterDTO> getRegisterRecords(List<RegisterDTO> paramList);

//    /**
//     * 批量更新
//     * @param auitRegisters
//     */
//    int updateBatchRegisterRecords(List<AuitRegister> auitRegisters);

    /**
     * 根据注册id批量获取注册数据
     * @param registerIdList
     * @return
     */
    List<RegisterDTO> selectAuitRegister(List<String> registerIdList);
}
