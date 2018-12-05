package com.example.demo.pojo;

/**
 * Created by weneryan on 2018/6/13.
 */
public class Student {

  private int id;
  private String number;
  private String name;
  private String sex;
  private String collegeNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCollegeNumber() {
        return collegeNumber;
    }

    public void setCollegeNumber(String collegeNumber) {
        this.collegeNumber = collegeNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", collegeNumber='" + collegeNumber + '\'' +
                '}';
    }

    public Student(int id, String number, String name, String sex) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.sex = sex;
    }


    public Student(String number, String name, String sex) {
        this.number = number;
        this.name = name;
        this.sex = sex;
    }

    public Student() {
    }
}
