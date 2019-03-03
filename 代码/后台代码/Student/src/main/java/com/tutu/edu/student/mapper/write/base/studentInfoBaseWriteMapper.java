package com.tutu.edu.student.mapper.write.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tutu.edu.student.model.studentInfo;
/**
*  @author wang
*/
public interface studentInfoBaseWriteMapper {

    int insertstudentInfo(studentInfo object);

    int updatestudentInfo(studentInfo object);

    int update(studentInfo.UpdateBuilder object);

}