package com.tutu.edu.student.mapper.read.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tutu.edu.student.model.StudentExam;
/**
*  @author wang
*/
public interface StudentExamBaseReadMapper {


    List<StudentExam> queryStudentExam(StudentExam object);

    StudentExam queryStudentExamLimit1(StudentExam object);

}