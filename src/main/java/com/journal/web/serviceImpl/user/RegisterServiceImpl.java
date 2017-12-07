package com.journal.web.serviceImpl.user;

import com.journal.web.dao.dao.RegisterDao;
import com.journal.web.dao.dto.RegisterDTO;
import com.journal.web.service.user.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: GaoJean
 * @ClassName: RegisterServiceImpl
 * @Description: 注册实现类
 * @date: 2017/10/30
 */
@Service("registerService")
public class RegisterServiceImpl implements RegisterService {

   /* @Autowired
    private RegisterDao registerDao;
*/
    public int addRegisterRecord(RegisterDTO registerExt) {
//        return registerDao.insertSelective(registerExt);
        return 1;
    }

    @Override
    public List<RegisterDTO> getRegisterRecords(List<RegisterDTO> paramList) {
        List<RegisterDTO> registerExtList = null;
        /*for (RegisterDTO registerExt : paramList){
            registerExtList = registerDao.selectRegisterList(registerExt);
        }*/
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
