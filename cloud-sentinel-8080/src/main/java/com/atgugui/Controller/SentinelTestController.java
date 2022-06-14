package com.atgugui.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangchuantang 2022.1.30 email: yct20210715@163.com
 */


@RestController
public class SentinelTestController {
    @GetMapping("/test1")
    public String test1(){
        return "test1";
    }
}
