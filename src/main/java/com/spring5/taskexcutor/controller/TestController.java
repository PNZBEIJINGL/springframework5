package com.spring5.taskexcutor.controller;

import com.spring5.taskexcutor.announce.AsyncTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private AsyncTaskService asyncTaskService;


    @RequestMapping("/recharege")
    public String index()
    {
        asyncTaskService.executeAsynTask(10);
        return "OK";
    }
}
