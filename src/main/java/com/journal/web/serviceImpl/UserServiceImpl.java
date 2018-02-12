package com.journal.web.serviceImpl;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.journal.common.constant.Constant;
import com.journal.common.logger.Logger;
import com.journal.common.logger.LoggerFactory;
import com.journal.web.corentity.UserEntity;
import com.journal.web.dto.UserDTO;
import com.journal.web.mapper.UserMapper;
import com.journal.web.service.UserService;

/**
 * @author: GaoJean
 * @ClassName: UserServiceImpl
 * @Description: 用户实现类
 * @date: 2017/10/28
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	private final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
    @Autowired
    private UserMapper userMapper;
    
    /**
     * 登录
     *
     * @param username
     * @param password
     * @param request
     * @param loginResponse
     */
    @Override
    public UserEntity login( Map<String, Object> params) {
    	UserEntity userEntity = null;
		try {
			logger.info("====登陆====IN,params={}",JSONObject.toJSONString(params));
			params.put("logicDeleteFlg", Constant.NOT_LOGIC_DELETE);
			UserDTO userDTO = userMapper.login(params);
			BeanUtils.copyProperties(userDTO, userEntity);
		} catch (BeansException e) {
			e.printStackTrace();
			logger.info("====登陆====ERR",e);
		}
        return userEntity;
    }
}
