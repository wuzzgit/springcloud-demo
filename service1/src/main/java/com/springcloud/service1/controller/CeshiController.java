package com.springcloud.service1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CeshiController {

    @Value("${server.port}")
     private String port;

    @RequestMapping("/service1")
    public List<String> ceshi(){
        List<String> list =new ArrayList<>();
        list.add("CESHI1");
        list.add("CESHI2");
        list.add("CESHI3");
        list.add(port);
        return list;

    }

    @RequestMapping("/service1ceshi")
    public String ceshi2(){
        return "这是 service1的服务:"+port;

    }


}
