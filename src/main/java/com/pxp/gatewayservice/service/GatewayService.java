package com.pxp.gatewayservice.service;

import com.pxp.gatewayservice.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class GatewayService {

    Logger logger = LoggerFactory.getLogger(GatewayService.class);
    @Autowired
    private RestTemplate restTemplate;

    public ResultModel getResult(String rollNo){
        StudentModel studentModel = restTemplate.getForObject("http://student-service:8081/get-a-student/" + rollNo, StudentModel.class);
        StudentMarkModel studentMarkModel = restTemplate.getForObject("http://student-mark-service:8082/get-student-mark/" + rollNo, StudentMarkModel.class);
        return new ResultModel(studentModel.getRollNo(),studentModel.getFirstName(),studentModel.getLastName(),studentMarkModel.getMaths(),studentMarkModel.getScience(),studentMarkModel.getGeography(),studentMarkModel.getHistory(),studentMarkModel.getEnglish());
    }

    public List<ResultModel> getAll(){
        logger.info("Entered into method getAll()");
        StudentModelList studentModelList = restTemplate.getForObject("http://student-service:8081/get-all-students",StudentModelList.class);
        logger.info("After calling get-all-students");
        StudentMarkModelList studentMarkModelList = restTemplate.getForObject("http://student-mark-service:8082/get-all-student-marks", StudentMarkModelList.class);
        logger.info("After calling get-all-student-marks");
        List<ResultModel> resultModelList = new ArrayList<>();
        studentModelList.getStudentModelList().stream().forEach(s -> {
            StudentMarkModel studentMarkModel = studentMarkModelList.getStudentMarkModelList().stream().filter(s1 -> s.getRollNo().equalsIgnoreCase(s1.getRollNo())).findFirst().orElse(new StudentMarkModel());
            ResultModel resultModel = new ResultModel(s.getRollNo(),s.getFirstName(),s.getLastName(),studentMarkModel.getMaths(),studentMarkModel.getScience(),studentMarkModel.getGeography(),studentMarkModel.getHistory(),studentMarkModel.getEnglish());
            resultModelList.add(resultModel);
        });
        return resultModelList;
    }
}
