package service1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CeshiController {

    @Autowired
    private  Service2service service2service;
    @RequestMapping("/service2")
    public List<String> ceshi(){
        List<String> list =new ArrayList<>();
        list.add("CESHI1");
        return list;
    }

    @RequestMapping("/service2ceshi")
    public String ceshi2(){
        return "这是 service2的服务";

    }

/*
    @RequestMapping("/service3")
    public List<String> ceshi3(){
        return service2service.getList();
    }
*/

}
