package com.pxp.gatewayservice.model;

import java.util.ArrayList;
import java.util.List;

public class StudentModelList {

    private List<StudentModel> studentModelList;

    public List<StudentModel> getStudentModelList() {
        return studentModelList;
    }

    public void setStudentModelList(List<StudentModel> studentModelList) {
        this.studentModelList = studentModelList;
    }

    public StudentModelList() {
        studentModelList = new ArrayList<>();
    }
}
