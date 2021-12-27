package com.pxp.gatewayservice.model;

public class StudentModel {

    private String rollNo;
    private String firstName;
    private String lastName;

    public StudentModel() {
    }

    public StudentModel(String rollNo, String firstName, String lastName) {
        this.rollNo = rollNo;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
