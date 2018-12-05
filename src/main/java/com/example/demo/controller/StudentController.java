package com.example.demo.controller;

import com.example.demo.pojo.Student;
import com.example.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by weneryan on 2018/6/12.
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @RequestMapping(value="/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping(value="/queryStudentByNumber")
    public String queryByNumber(@RequestParam("number") String number,Model model){
        System.out.println("我是controller");
        Student student = studentService.queryStudentByNumber(number);
        model.addAttribute("student",student);
        System.out.println("controller执行完了");
        return "showName";
    }

//    @RequestMapping(value = "/query")
//    public ModelAndView doView() {
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("queryStudent");
//        return mv;
//    }


    @RequestMapping(value = "/query")
//    @ResponseBody
    public String queryStudent() {
//        System.out.println("============");
        return "queryStudent";
    }

//    @RequestMapping(value = "/querybyCollegeNumber")
//    public String queryByCollegeNumber(@RequestParam("number") String number,Model model) {
//        System.out.println("我是A里的controller开始的函数");
//        List<Student> students = studentService.queryStudentByCollegeNumber(number);
//        model.addAttribute("students",students);
//        System.out.println("我是A里的controller完成的函数");
//        System.out.println(students); //可以执行到这里
//        return "showCollegeStudent";
////        return "nulljsp";//404 null
//    }
}
