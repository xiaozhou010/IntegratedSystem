package com.bobo.controller;

import com.bobo.systemset.ISystemSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016/9/28.
 */
@RestController
@RequestMapping(value = "/api")
public class TestController {

    @Autowired
    ISystemSetService iSystemSetService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String test(){
        iSystemSetService.save();
        return "hello";
    }
}
