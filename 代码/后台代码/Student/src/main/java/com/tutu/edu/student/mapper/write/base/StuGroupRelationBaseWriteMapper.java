package com.tutu.edu.student.mapper.write.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.tutu.edu.student.model.StuGroupRelation;
/**
*  @author wang
*/
public interface StuGroupRelationBaseWriteMapper {

    int insertStuGroupRelation(StuGroupRelation object);

    int updateStuGroupRelation(StuGroupRelation object);

    int update(StuGroupRelation.UpdateBuilder object);

}