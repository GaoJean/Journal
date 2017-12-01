package com.journal.web.controller.user;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.journal.web.entity.User;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController  
@RequestMapping(value="/example")
public class Example {  

/*	@ApiOperation(value="��ȡ�û��б�", notes="")
    @RequestMapping(value={"/"}, method=RequestMethod.GET)
    String home() {  
        return "Hello World!";  
    }  
      
    @RequestMapping("/hello/{myName}")  
    String index(@PathVariable String myName) {  
        return "Hello "+myName+"!!!";  
    }  */
	static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());

    @ApiOperation(value="获取用户信息", notes="")
    @RequestMapping(value={""}, method=RequestMethod.GET)
    public List<User> getUserList() {
        List<User> r = new ArrayList<User>(users.values());
        return r;
    }

    @ApiOperation(value="�����û�", notes="����User���󴴽��û�")
    @ApiImplicitParam(name = "user", value = "�û���ϸʵ��user", required = true, dataType = "User")
    @RequestMapping(value="", method=RequestMethod.POST)
    public String postUser(@RequestBody User user) {
        users.put(user.getId(), user);
        return "success";
    }

    @ApiOperation(value="��ȡ�û���ϸ��Ϣ", notes="����url��id����ȡ�û���ϸ��Ϣ")
    @ApiImplicitParam(name = "id", value = "�û�ID", required = true, dataType = "Long")
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public User getUser(@PathVariable Long id) {
        return users.get(id);
    }

    @ApiOperation(value="�����û���ϸ��Ϣ", notes="����url��id��ָ�����¶��󣬲����ݴ�������user��Ϣ�������û���ϸ��Ϣ")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "�û�ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "user", value = "�û���ϸʵ��user", required = true, dataType = "User")
    })
    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public String putUser(@PathVariable Long id, @RequestBody User user) {
        User u = users.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        users.put(id, u);
        return "success";
    }

    /**
     *
     * @param id
     * @return
     */
    @ApiOperation(value="ɾ���û�", notes="����url��id��ָ��ɾ������")
    @ApiImplicitParam(name = "id", value = "�û�ID", required = true, dataType = "Long")
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id) {
        users.remove(id);
        return "success";
    }



}  