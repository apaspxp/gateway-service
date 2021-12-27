package com.pxp.gatewayservice.controller;

import com.pxp.gatewayservice.model.ResultModel;
import com.pxp.gatewayservice.service.GatewayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GatewayController {

    @Autowired
    private GatewayService gatewayService;

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String hello(){
        return "Hello...";
    }

    @RequestMapping(value = "student-info/{rollNo}",method = RequestMethod.GET)
    public ResultModel getStudentInfo(@PathVariable String rollNo){
        return gatewayService.getResult(rollNo);
    }

    @RequestMapping(value = "all-student-info",method = RequestMethod.GET)
    public List<ResultModel> allStudentInformation(){
        return gatewayService.getAll();
    }
}
