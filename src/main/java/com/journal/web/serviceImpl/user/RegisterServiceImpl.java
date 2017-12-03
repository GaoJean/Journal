package com.journal.web.serviceImpl.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.journal.web.dao.dao.RegisterDao;
import com.journal.web.dao.dto.RegisterDTO;
import com.journal.web.service.user.RegisterService;

/**
 * @author: GaoJean
 * @ClassName: RegisterServiceImpl
 * @Description: 注册实现类
 * @date: 2017/10/30
 */
@Component 
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private RegisterDao registerDao;

    @Override
    public int addRegisterRecord(RegisterDTO registerExt) {
        return registerDao.insertSelective(registerExt);
    }

    @Override
    public List<RegisterDTO> getRegisterRecords(List<RegisterDTO> paramList) {
        List<RegisterDTO> registerExtList = null;
        for (RegisterDTO registerExt : paramList){
            registerExtList = registerDao.selectRegisterList(registerExt);
        }
        return registerExtList;
    }

//    @Override
//    public int updateBatchRegisterRecords(List<AuitRegisterRequest.AuitRegister> auitRegisters) {
//        return registerDao.updateBatchRegisterRecords(auitRegisters);
//    }

    /**
     * 根据注册id批量获取注册数据
     *
     * @param registerIdList
     * @return
     */
    @Override
    public List<RegisterDTO> selectAuitRegister(List<String> registerIdList) {
        return null;
    }
}
