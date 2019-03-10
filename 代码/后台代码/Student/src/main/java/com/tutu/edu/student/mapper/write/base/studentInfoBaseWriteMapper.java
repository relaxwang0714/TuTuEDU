package com.tutu.edu.student.mapper.write.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tutu.edu.student.model.StudentInfo;
/**
*  @author wang
*/
public interface StudentInfoBaseWriteMapper {

    int insertStudentInfo(StudentInfo object);

    int updateStudentInfo(StudentInfo object);

    int update(StudentInfo.UpdateBuilder object);

}