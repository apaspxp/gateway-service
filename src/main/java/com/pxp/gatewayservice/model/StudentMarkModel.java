package com.pxp.gatewayservice.model;

public class StudentMarkModel {
    private String rollNo;
    private int maths;
    private int science;
    private int geography;
    private int history;
    private int english;

    public StudentMarkModel() {
    }

    public StudentMarkModel(String rollNo, int maths, int science, int geography, int history, int english) {
        this.rollNo = rollNo;
        this.maths = maths;
        this.science = science;
        this.geography = geography;
        this.history = history;
        this.english = english;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getGeography() {
        return geography;
    }

    public void setGeography(int geography) {
        this.geography = geography;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }
}
