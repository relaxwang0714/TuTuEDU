package com.tutu.edu.student.mapper.read.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tutu.edu.student.model.StudentInfo;
/**
*  @author wang
*/
public interface StudentInfoBaseReadMapper {


    List<StudentInfo> queryStudentInfo(StudentInfo object);

    StudentInfo queryStudentInfoLimit1(StudentInfo object);

}