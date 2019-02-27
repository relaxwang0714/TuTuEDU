package mapper.read.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import model.studentInfo;
/**
*  @author wang
*/
public interface studentInfoBaseReadMapper {


    List<studentInfo> querystudentInfo(studentInfo object);

    studentInfo querystudentInfoLimit1(studentInfo object);

}