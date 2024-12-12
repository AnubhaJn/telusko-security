package com.example.Security.DTO;


public class Student {
    private Integer rollNo;
    private String name;
    private  String tech;

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public Student(Integer rollNo, String name, String tech) {
        this.rollNo = rollNo;
        this.name = name;
        this.tech = tech;
    }
}
