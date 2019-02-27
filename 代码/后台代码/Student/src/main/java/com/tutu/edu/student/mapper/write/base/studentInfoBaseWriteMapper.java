package mapper.write.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import model.studentInfo;
/**
*  @author wang
*/
public interface studentInfoBaseWriteMapper {

    int insertstudentInfo(studentInfo object);

    int updatestudentInfo(studentInfo object);

    int update(studentInfo.UpdateBuilder object);

}