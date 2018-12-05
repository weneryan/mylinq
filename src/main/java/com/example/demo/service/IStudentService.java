package com.example.demo.service;

import com.example.demo.pojo.Student;

import java.util.List;

/**
 * Created by weneryan on 2018/6/13.
 */
public interface IStudentService {
    public Student queryStudentByNumber(String number);
//    public List<Student> queryStudentByCollegeNumber(String number);
}
