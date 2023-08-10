package com.qf.controller;

import lombok.Lombok;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version 1.0
 * @author: qc
 * @date 2023/8/7 17:55
 */
@Controller
public class DemoController {

    @ResponseBody
    @RequestMapping("hello")
    public String demo(){
        return "hello";
    }


}
