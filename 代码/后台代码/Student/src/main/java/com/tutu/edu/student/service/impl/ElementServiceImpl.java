package com.tutu.edu.student.service.impl;

import com.tutu.edu.student.mapper.write.base.StudentInfoBaseWriteMapper;
import com.tutu.edu.student.model.StudentInfo;
import com.tutu.edu.student.service.ElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Service
public class ElementServiceImpl implements ElementService {
    @Autowired
    private StudentInfoBaseWriteMapper studentInfoBaseWriteMapper;
    @Override
    public ArrayList<StudentInfo> QueryAllList() {
       // studentinfo.QueryBuild();

        return null;
    }

    @Override
    public ArrayList<StudentInfo> QueryByCollegeList() {
        return null;
    }

    @Override
    public ArrayList<StudentInfo> QuerySingle() {
        return null;
    }

    @Override
    public int insertstudentInfo(StudentInfo object) {
        StudentInfo stu = new StudentInfo();
        String[] name={"孙同学","何同学","夏同学","王同学","张同学","梅同学","柳同学","徐同学","丁同学","章同学","赵同学","钱同学","邵同学","高同学","陈同学"};
        int stuNumber =11100010;
        String[] sex={"男","女"};
       long  phone =13700000000L;
       long specility=11000001;
       long classid =11000001;
       long college =11000001;
       long faculty =11000001;
        LocalDateTime localDateTime = LocalDateTime.now();
        try{
            for (long i=0;i<200;i++) {
                stu.setClassId(classid+(i%20));
                stu.setCollegeId(college+(i%2000));
                stu.setDataCreate(localDateTime);
                stu.setStudentName(name[(int)Math.random()*15]);
                stu.setStudentPhone(phone+i);
                stu.setDataCreate(localDateTime);
                stu.setStudentNum(stuNumber+(int)i);
                stu.setFacultyId(classid+(i%200));
                stu.setSpecialtyId(classid+(i%100));
                studentInfoBaseWriteMapper.insertStudentInfo(stu);
            }
        }
        catch (Exception e){
            System.out.println(e);
            return 0;

        }
        return 1;
    }
}
