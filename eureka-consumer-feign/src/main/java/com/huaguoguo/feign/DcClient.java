package com.huaguoguo.feign;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient("eureka-client")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();

    @RequestMapping(value = "/many",method = RequestMethod.POST)
    String manyBody(Map param);
}
