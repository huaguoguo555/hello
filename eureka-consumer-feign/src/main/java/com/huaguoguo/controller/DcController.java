package com.huaguoguo.controller;

import com.huaguoguo.feign.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DcController {

    @Autowired
    DcClient dcClient;

//    @GetMapping("/consumer")
//    public String dc(){
//        return dcClient.consumer();
//    }

    @RequestMapping(value = "/many",method = RequestMethod.GET)
    @ResponseBody
    public String manyBody(){
        Map parma = new HashMap();
        parma.put("id","1");
        parma.put("name","tomcat");
        parma.put("type","1");
        parma.put("carNo","12412414");
        return dcClient.manyBody(parma);
    }
}

