package com.qf.controller;

import com.qf.service.InfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version 1.0
 * @author: qc
 * @date 2023/8/7 17:55
 */
@Controller
@Api("事件信息查询管理模块")
public class DemoController {

    @ResponseBody
    @RequestMapping("hello")
    public String demo(){
        return "hello";
    }

    @Autowired
    private InfoService infoService;

    @ResponseBody
    @RequestMapping("info")
    @ApiOperation(value = "事件信息地区模糊查询",notes = "根据时间原因eventReasons查询")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "eventReasons", value = "事件模糊原因", required = true, dataType = "String", example = "不稳定"),
        @ApiImplicitParam(name = "page", value = "页数", required = false,dataType = "int", example = "1"),
        @ApiImplicitParam(name = "pageSize",value = "每页页数",required = false,dataType = "int",example = "5")
    })
    public Object infoList(@RequestParam(required = false) String eventReasons,
                           @RequestParam(defaultValue = "1") Integer page,
                           @RequestParam(defaultValue = "5") Integer pageSize
                           ){
        return infoService.selectList(eventReasons,page,pageSize);
    };
}
