package com.tutu.edu.student.mapper.read.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tutu.edu.student.model.StuGroupRelation;
/**
*  @author wang
*/
public interface StuGroupRelationBaseReadMapper {


    List<StuGroupRelation> queryStuGroupRelation(StuGroupRelation object);

    StuGroupRelation queryStuGroupRelationLimit1(StuGroupRelation object);

}