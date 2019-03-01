package com.tutu.edu.student.mapper.read.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tutu.edu.student.model.StuGroup relation;
/**
*  @author wang
*/
public interface StuGroup relationBaseReadMapper {


    List<StuGroup relation> queryStuGroup relation(StuGroup relation object);

    StuGroup relation queryStuGroup relationLimit1(StuGroup relation object);

}