package com.qf.controller;

import org.apache.juli.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version 1.0
 * @author: qc
 * @date 2023/8/8 14:12
 */
@Controller
@RequestMapping("demo")
public class DemoControllers {

//    代码
    @RequestMapping("info")
    @ResponseBody
    public String demo(){
        return "hello 2.1.2";

    }
}
