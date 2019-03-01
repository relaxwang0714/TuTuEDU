package com.tutu.edu.student.mapper.read.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tutu.edu.student.model.StudentCourse;
/**
*  @author wang
*/
public interface StudentCourseBaseReadMapper {


    List<StudentCourse> queryStudentCourse(StudentCourse object);

    StudentCourse queryStudentCourseLimit1(StudentCourse object);

}