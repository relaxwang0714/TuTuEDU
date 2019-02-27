package com.tutu.edu.student.mapper.write.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tutu.edu.student.model.StuGroup relation;
/**
*  @author wang
*/
public interface StuGroup relationBaseWriteMapper {

    int insertStuGroup relation(StuGroup relation object);

    int updateStuGroup relation(StuGroup relation object);

    int update(StuGroup relation.UpdateBuilder object);

}