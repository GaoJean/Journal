package com.journal.web.serviceImpl.user;

import com.journal.web.DTO.UserDTO;
import com.journal.web.entity.response.user.LoginResponse;
import com.journal.web.mapper.UserDTOMapper;
import com.journal.web.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: GaoJean
 * @ClassName: UserServiceImpl
 * @Description: 用户实现类
 * @date: 2017/10/28
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDTOMapper userDTOMapper;
    /**
     * 登录
     *
     * @param username
     * @param password
     * @param request
     * @param loginResponse
     */
    @Override
    public void login(String username, String password, HttpServletRequest request, LoginResponse loginResponse) {
        /*if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            loginResponse.setSuccess(Constant.ServiceCode.CODE_2);
        } else {
            UserDTO userEntity = null;
            RegisterDTO registerExt = null;
            HttpSession session = request.getSession();
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("userAccount", username);
            params.put("userPassword", password);
            userEntity = userDao.selectUser(params);
            registerExt = registerDao.selectRegister(params);

            if (userEntity == null && registerExt == null) {//账号不存在
                loginResponse.setSuccess(Constant.ServiceCode.CODE_3);
            } else if (registerExt != null && userEntity == null) {//已注册，但还没通过
                loginResponse.setSuccess(Constant.ServiceCode.CODE_4);
            } else if (registerExt != null && userEntity != null) {//已注册，已通过
                initSession(request, userEntity);
                initLoginResponse(request, loginResponse);
                loginResponse.setSuccess(Constant.ServiceCode.CODE_0);
            } else {
                loginResponse.setSuccess(Constant.ServiceCode.CODE_1);
            }
        }*/

        UserDTO userDTO = userDTOMapper.selectByPrimaryKey("1");
        System.out.println(userDTO.getUserAccount());
    }
}
