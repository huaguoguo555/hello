package com.huaguoguo.controller;

import com.huaguoguo.pojo.Car;
import com.huaguoguo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

@RestController
public class DcController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc(){
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }


    @RequestMapping(value = "/many",method = RequestMethod.POST)
    @ResponseBody
    public String manyBody(@RequestBody Car car,@RequestBody User user){
        System.out.println(car);
        System.out.println(user);
        return "ok";
    }
}
