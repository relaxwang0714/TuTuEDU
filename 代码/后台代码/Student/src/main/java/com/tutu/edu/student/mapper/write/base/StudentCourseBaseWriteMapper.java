package com.tutu.edu.student.mapper.write.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tutu.edu.student.model.StudentCourse;
/**
*  @author wang
*/
public interface StudentCourseBaseWriteMapper {

    int insertStudentCourse(StudentCourse object);

    int updateStudentCourse(StudentCourse object);

    int update(StudentCourse.UpdateBuilder object);

}