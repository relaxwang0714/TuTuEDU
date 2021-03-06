package com.tutu.edu.student.service;

import com.tutu.edu.student.model.StudentInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


public interface ElementService {
    //查询学生信息
    ArrayList<StudentInfo> QueryAllList();
    //根据院校查学生基本信息
    ArrayList<StudentInfo> QueryByCollegeList();
    //查询单个学生的信息，小程序使用
    ArrayList<StudentInfo> QuerySingle();
    int insertstudentInfo(StudentInfo object);
}
