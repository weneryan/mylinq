package com.example.demo.service.impl;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.pojo.Student;
import com.example.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by weneryan on 2018/6/13.
 */
@Service
public class StudentService implements IStudentService{

    @Autowired
    private StudentMapper studentMapper;

    public Student queryStudentByNumber(String number){
        System.out.println("我是service");
        return studentMapper.queryStudentByNumber(number);
    }


//    public List<Student> queryStudentByCollegeNumber(String number){
//        System.out.println("我是A里的service开始的函数");
//        return studentMapper.queryStudentByCollegeNumber(number);
//    }
}
