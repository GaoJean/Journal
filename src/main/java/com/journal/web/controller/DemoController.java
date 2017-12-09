package com.journal.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: GaoJean
 * @ClassName: DemoController
 * @Description: TODO
 * @date: 2017/12/9
 */
@RestController
public class DemoController {

    @GetMapping(value = "/hello")
    public  String hello(){
        return "hello SpringBoot!";
    }
}
