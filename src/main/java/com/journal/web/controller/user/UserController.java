package com.journal.web.controller.user;

import io.swagger.annotations.ApiOperation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.journal.web.entity.User;

/**
 * Created by Jianjian on 2017/12/1.
 */
@RestController  
@RequestMapping(value="/user")
public class UserController {
	static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());
	 @ApiOperation(value="获取用户信息", notes="")
	    @RequestMapping(value={""}, method=RequestMethod.GET)
	    public List<User> getUserList() {
	        List<User> r = new ArrayList<User>(users.values());
	        return r;
	    }
}
