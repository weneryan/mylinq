package com.example.demo.mapper;

import com.example.demo.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by weneryan on 2018/6/14.
 */
@Mapper
public interface StudentMapper {
    @Select("select * from student where number = #{number}")
    Student queryStudentByNumber(String number);

//    @Select("select * from student where collegeNumber = #{number}")
//    List<Student> queryStudentByCollegeNumber(String number);
}
