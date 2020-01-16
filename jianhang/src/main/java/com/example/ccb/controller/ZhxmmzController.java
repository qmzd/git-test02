package com.example.ccb.controller;

import com.example.ccb.model.RspMsg;
import com.example.ccb.service.ZhxmmzService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * @author Mr_zhao
 * @create 2019/11/4 9:54
 * @day 星期一
 */
@RestController
@RequestMapping("/ccb")
@Api(value = "新增",tags = {"测试新增"})
public class ZhxmmzController {

    @Resource
    private ZhxmmzService zhxmmzService;

    @GetMapping("/insert")
    @ApiOperation(value = "测试新增" ,notes = "测试框架可用性" )
    public RspMsg insert(){
        RspMsg insert = zhxmmzService.insert();
        System.out.println("3333333");
        System.out.println("2222222222");
        return insert;
    }

}
