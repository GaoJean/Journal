package com.journal.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.journal.common.util.POIUtil;
import com.journal.web.adaptor.journal.JournalAdaptor;
import com.journal.web.entity.User;

/**
 * @author: GaoJean
 * @ClassName: DemoController
 * @Description: TODO
 * @date: 2017/12/9
 */
@RestController
public class DemoController {

    @Autowired
    private JournalAdaptor journalAdaptor;
    
    
    @GetMapping(value = "/hello")
    public String hello() {
        Map<String, Object> param = new HashMap<String, Object>();
        int result = journalAdaptor.insert();
        /*param.put("allUsers", allUsers);
        this.userService.insertUsers(param);*/
        return "";
    }
    
    /** 
     * 读取excel文件中的用户信息，保存在数据库中 
     * @param excelFile 
     */  
    @RequestMapping("/readExcel")  
    public void readExcel(@RequestParam(value = "excelFile") MultipartFile excelFile,HttpServletRequest req,HttpServletResponse resp){  
        Map<String, Object> param = new HashMap<String, Object>();  
        List<User> allUsers = new ArrayList<User>();  
        try {  
            List<String[]> userList = POIUtil.readExcel(excelFile);  
            for(int i = 0;i<userList.size();i++){  
              String[] users = userList.get(i);  
              User user = new User();  
              user.setAge(Integer.parseInt(users[2]));  
              allUsers.add(user);  
             }  
           } catch (IOException e) {  
           }  
         param.put("allUsers", allUsers);  
//         this.userService.insertUsers(param);  
    }  
}
