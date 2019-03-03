package com.tutu.edu.student.mapper.write.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tutu.edu.student.model.StudentExam;
/**
*  @author wang
*/
public interface StudentExamBaseWriteMapper {

    int insertStudentExam(StudentExam object);

    int updateStudentExam(StudentExam object);

    int update(StudentExam.UpdateBuilder object);

}