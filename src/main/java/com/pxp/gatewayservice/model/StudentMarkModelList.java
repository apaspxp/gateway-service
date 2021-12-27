package com.pxp.gatewayservice.model;

import java.util.ArrayList;
import java.util.List;

public class StudentMarkModelList {
    private List<StudentMarkModel> studentMarkModelList;

    public List<StudentMarkModel> getStudentMarkModelList() {
        return studentMarkModelList;
    }

    public void setStudentMarkModelList(List<StudentMarkModel> studentMarkModelList) {
        this.studentMarkModelList = studentMarkModelList;
    }

    public StudentMarkModelList() {
        studentMarkModelList = new ArrayList<>();
    }
}
