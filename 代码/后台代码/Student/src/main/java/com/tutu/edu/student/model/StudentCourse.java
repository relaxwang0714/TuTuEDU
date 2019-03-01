package com.tutu.edu.student.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author wang
*/
public class StudentCourse implements Serializable {

    private static final long serialVersionUID = 1551254467992L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
    * 
    * isNullAble:0
    */
    private Long courseId;

    /**
    * 
    * isNullAble:0
    */
    private Integer studentNum;

    /**
    * 
    * isNullAble:0
    */
    private String className;

    /**
    * 
    * isNullAble:0
    */
    private String classTeacher;

    /**
    * 
    * isNullAble:0
    */
    private java.time.LocalDateTime dataCreate;

    /**
    * 主键
    * 
    * isNullAble:0
    */
    private java.time.LocalDateTime dataModified;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setCourseId(Long courseId){this.courseId = courseId;}

    public Long getCourseId(){return this.courseId;}

    public void setStudentNum(Integer studentNum){this.studentNum = studentNum;}

    public Integer getStudentNum(){return this.studentNum;}

    public void setClassName(String className){this.className = className;}

    public String getClassName(){return this.className;}

    public void setClassTeacher(String classTeacher){this.classTeacher = classTeacher;}

    public String getClassTeacher(){return this.classTeacher;}

    public void setDataCreate(java.time.LocalDateTime dataCreate){this.dataCreate = dataCreate;}

    public java.time.LocalDateTime getDataCreate(){return this.dataCreate;}

    public void setDataModified(java.time.LocalDateTime dataModified){this.dataModified = dataModified;}

    public java.time.LocalDateTime getDataModified(){return this.dataModified;}
    @Override
    public String toString() {
        return "StudentCourse{" +
                "id='" + id + '\'' +
                "courseId='" + courseId + '\'' +
                "studentNum='" + studentNum + '\'' +
                "className='" + className + '\'' +
                "classTeacher='" + classTeacher + '\'' +
                "dataCreate='" + dataCreate + '\'' +
                "dataModified='" + dataModified + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private StudentCourse set;

        private ConditionBuilder where;

        public UpdateBuilder set(StudentCourse set){
            this.set = set;
            return this;
        }

        public StudentCourse getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends StudentCourse{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<Long> courseIdList;

        public List<Long> getCourseIdList(){return this.courseIdList;}

        private Long courseIdSt;

        private Long courseIdEd;

        public Long getCourseIdSt(){return this.courseIdSt;}

        public Long getCourseIdEd(){return this.courseIdEd;}

        private List<Integer> studentNumList;

        public List<Integer> getStudentNumList(){return this.studentNumList;}

        private Integer studentNumSt;

        private Integer studentNumEd;

        public Integer getStudentNumSt(){return this.studentNumSt;}

        public Integer getStudentNumEd(){return this.studentNumEd;}

        private List<String> classNameList;

        public List<String> getClassNameList(){return this.classNameList;}


        private List<String> fuzzyClassName;

        public List<String> getFuzzyClassName(){return this.fuzzyClassName;}

        private List<String> rightFuzzyClassName;

        public List<String> getRightFuzzyClassName(){return this.rightFuzzyClassName;}
        private List<String> classTeacherList;

        public List<String> getClassTeacherList(){return this.classTeacherList;}


        private List<String> fuzzyClassTeacher;

        public List<String> getFuzzyClassTeacher(){return this.fuzzyClassTeacher;}

        private List<String> rightFuzzyClassTeacher;

        public List<String> getRightFuzzyClassTeacher(){return this.rightFuzzyClassTeacher;}
        private List<java.time.LocalDateTime> dataCreateList;

        public List<java.time.LocalDateTime> getDataCreateList(){return this.dataCreateList;}

        private java.time.LocalDateTime dataCreateSt;

        private java.time.LocalDateTime dataCreateEd;

        public java.time.LocalDateTime getDataCreateSt(){return this.dataCreateSt;}

        public java.time.LocalDateTime getDataCreateEd(){return this.dataCreateEd;}

        private List<java.time.LocalDateTime> dataModifiedList;

        public List<java.time.LocalDateTime> getDataModifiedList(){return this.dataModifiedList;}

        private java.time.LocalDateTime dataModifiedSt;

        private java.time.LocalDateTime dataModifiedEd;

        public java.time.LocalDateTime getDataModifiedSt(){return this.dataModifiedSt;}

        public java.time.LocalDateTime getDataModifiedEd(){return this.dataModifiedEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Long idSt,Long idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Long idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Long idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Long id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Long ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Long> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder courseIdBetWeen(Long courseIdSt,Long courseIdEd){
            this.courseIdSt = courseIdSt;
            this.courseIdEd = courseIdEd;
            return this;
        }

        public QueryBuilder courseIdGreaterEqThan(Long courseIdSt){
            this.courseIdSt = courseIdSt;
            return this;
        }
        public QueryBuilder courseIdLessEqThan(Long courseIdEd){
            this.courseIdEd = courseIdEd;
            return this;
        }


        public QueryBuilder courseId(Long courseId){
            setCourseId(courseId);
            return this;
        }

        public QueryBuilder courseIdList(Long ... courseId){
            this.courseIdList = solveNullList(courseId);
            return this;
        }

        public QueryBuilder courseIdList(List<Long> courseId){
            this.courseIdList = courseId;
            return this;
        }

        public QueryBuilder fetchCourseId(){
            setFetchFields("fetchFields","courseId");
            return this;
        }

        public QueryBuilder excludeCourseId(){
            setFetchFields("excludeFields","courseId");
            return this;
        }

        public QueryBuilder studentNumBetWeen(Integer studentNumSt,Integer studentNumEd){
            this.studentNumSt = studentNumSt;
            this.studentNumEd = studentNumEd;
            return this;
        }

        public QueryBuilder studentNumGreaterEqThan(Integer studentNumSt){
            this.studentNumSt = studentNumSt;
            return this;
        }
        public QueryBuilder studentNumLessEqThan(Integer studentNumEd){
            this.studentNumEd = studentNumEd;
            return this;
        }


        public QueryBuilder studentNum(Integer studentNum){
            setStudentNum(studentNum);
            return this;
        }

        public QueryBuilder studentNumList(Integer ... studentNum){
            this.studentNumList = solveNullList(studentNum);
            return this;
        }

        public QueryBuilder studentNumList(List<Integer> studentNum){
            this.studentNumList = studentNum;
            return this;
        }

        public QueryBuilder fetchStudentNum(){
            setFetchFields("fetchFields","studentNum");
            return this;
        }

        public QueryBuilder excludeStudentNum(){
            setFetchFields("excludeFields","studentNum");
            return this;
        }

        public QueryBuilder fuzzyClassName (List<String> fuzzyClassName){
            this.fuzzyClassName = fuzzyClassName;
            return this;
        }

        public QueryBuilder fuzzyClassName (String ... fuzzyClassName){
            this.fuzzyClassName = solveNullList(fuzzyClassName);
            return this;
        }

        public QueryBuilder rightFuzzyClassName (List<String> rightFuzzyClassName){
            this.rightFuzzyClassName = rightFuzzyClassName;
            return this;
        }

        public QueryBuilder rightFuzzyClassName (String ... rightFuzzyClassName){
            this.rightFuzzyClassName = solveNullList(rightFuzzyClassName);
            return this;
        }

        public QueryBuilder className(String className){
            setClassName(className);
            return this;
        }

        public QueryBuilder classNameList(String ... className){
            this.classNameList = solveNullList(className);
            return this;
        }

        public QueryBuilder classNameList(List<String> className){
            this.classNameList = className;
            return this;
        }

        public QueryBuilder fetchClassName(){
            setFetchFields("fetchFields","className");
            return this;
        }

        public QueryBuilder excludeClassName(){
            setFetchFields("excludeFields","className");
            return this;
        }

        public QueryBuilder fuzzyClassTeacher (List<String> fuzzyClassTeacher){
            this.fuzzyClassTeacher = fuzzyClassTeacher;
            return this;
        }

        public QueryBuilder fuzzyClassTeacher (String ... fuzzyClassTeacher){
            this.fuzzyClassTeacher = solveNullList(fuzzyClassTeacher);
            return this;
        }

        public QueryBuilder rightFuzzyClassTeacher (List<String> rightFuzzyClassTeacher){
            this.rightFuzzyClassTeacher = rightFuzzyClassTeacher;
            return this;
        }

        public QueryBuilder rightFuzzyClassTeacher (String ... rightFuzzyClassTeacher){
            this.rightFuzzyClassTeacher = solveNullList(rightFuzzyClassTeacher);
            return this;
        }

        public QueryBuilder classTeacher(String classTeacher){
            setClassTeacher(classTeacher);
            return this;
        }

        public QueryBuilder classTeacherList(String ... classTeacher){
            this.classTeacherList = solveNullList(classTeacher);
            return this;
        }

        public QueryBuilder classTeacherList(List<String> classTeacher){
            this.classTeacherList = classTeacher;
            return this;
        }

        public QueryBuilder fetchClassTeacher(){
            setFetchFields("fetchFields","classTeacher");
            return this;
        }

        public QueryBuilder excludeClassTeacher(){
            setFetchFields("excludeFields","classTeacher");
            return this;
        }

        public QueryBuilder dataCreateBetWeen(java.time.LocalDateTime dataCreateSt,java.time.LocalDateTime dataCreateEd){
            this.dataCreateSt = dataCreateSt;
            this.dataCreateEd = dataCreateEd;
            return this;
        }

        public QueryBuilder dataCreateGreaterEqThan(java.time.LocalDateTime dataCreateSt){
            this.dataCreateSt = dataCreateSt;
            return this;
        }
        public QueryBuilder dataCreateLessEqThan(java.time.LocalDateTime dataCreateEd){
            this.dataCreateEd = dataCreateEd;
            return this;
        }


        public QueryBuilder dataCreate(java.time.LocalDateTime dataCreate){
            setDataCreate(dataCreate);
            return this;
        }

        public QueryBuilder dataCreateList(java.time.LocalDateTime ... dataCreate){
            this.dataCreateList = solveNullList(dataCreate);
            return this;
        }

        public QueryBuilder dataCreateList(List<java.time.LocalDateTime> dataCreate){
            this.dataCreateList = dataCreate;
            return this;
        }

        public QueryBuilder fetchDataCreate(){
            setFetchFields("fetchFields","dataCreate");
            return this;
        }

        public QueryBuilder excludeDataCreate(){
            setFetchFields("excludeFields","dataCreate");
            return this;
        }

        public QueryBuilder dataModifiedBetWeen(java.time.LocalDateTime dataModifiedSt,java.time.LocalDateTime dataModifiedEd){
            this.dataModifiedSt = dataModifiedSt;
            this.dataModifiedEd = dataModifiedEd;
            return this;
        }

        public QueryBuilder dataModifiedGreaterEqThan(java.time.LocalDateTime dataModifiedSt){
            this.dataModifiedSt = dataModifiedSt;
            return this;
        }
        public QueryBuilder dataModifiedLessEqThan(java.time.LocalDateTime dataModifiedEd){
            this.dataModifiedEd = dataModifiedEd;
            return this;
        }


        public QueryBuilder dataModified(java.time.LocalDateTime dataModified){
            setDataModified(dataModified);
            return this;
        }

        public QueryBuilder dataModifiedList(java.time.LocalDateTime ... dataModified){
            this.dataModifiedList = solveNullList(dataModified);
            return this;
        }

        public QueryBuilder dataModifiedList(List<java.time.LocalDateTime> dataModified){
            this.dataModifiedList = dataModified;
            return this;
        }

        public QueryBuilder fetchDataModified(){
            setFetchFields("fetchFields","dataModified");
            return this;
        }

        public QueryBuilder excludeDataModified(){
            setFetchFields("excludeFields","dataModified");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public StudentCourse build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<Long> courseIdList;

        public List<Long> getCourseIdList(){return this.courseIdList;}

        private Long courseIdSt;

        private Long courseIdEd;

        public Long getCourseIdSt(){return this.courseIdSt;}

        public Long getCourseIdEd(){return this.courseIdEd;}

        private List<Integer> studentNumList;

        public List<Integer> getStudentNumList(){return this.studentNumList;}

        private Integer studentNumSt;

        private Integer studentNumEd;

        public Integer getStudentNumSt(){return this.studentNumSt;}

        public Integer getStudentNumEd(){return this.studentNumEd;}

        private List<String> classNameList;

        public List<String> getClassNameList(){return this.classNameList;}


        private List<String> fuzzyClassName;

        public List<String> getFuzzyClassName(){return this.fuzzyClassName;}

        private List<String> rightFuzzyClassName;

        public List<String> getRightFuzzyClassName(){return this.rightFuzzyClassName;}
        private List<String> classTeacherList;

        public List<String> getClassTeacherList(){return this.classTeacherList;}


        private List<String> fuzzyClassTeacher;

        public List<String> getFuzzyClassTeacher(){return this.fuzzyClassTeacher;}

        private List<String> rightFuzzyClassTeacher;

        public List<String> getRightFuzzyClassTeacher(){return this.rightFuzzyClassTeacher;}
        private List<java.time.LocalDateTime> dataCreateList;

        public List<java.time.LocalDateTime> getDataCreateList(){return this.dataCreateList;}

        private java.time.LocalDateTime dataCreateSt;

        private java.time.LocalDateTime dataCreateEd;

        public java.time.LocalDateTime getDataCreateSt(){return this.dataCreateSt;}

        public java.time.LocalDateTime getDataCreateEd(){return this.dataCreateEd;}

        private List<java.time.LocalDateTime> dataModifiedList;

        public List<java.time.LocalDateTime> getDataModifiedList(){return this.dataModifiedList;}

        private java.time.LocalDateTime dataModifiedSt;

        private java.time.LocalDateTime dataModifiedEd;

        public java.time.LocalDateTime getDataModifiedSt(){return this.dataModifiedSt;}

        public java.time.LocalDateTime getDataModifiedEd(){return this.dataModifiedEd;}


        public ConditionBuilder idBetWeen(Long idSt,Long idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Long idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Long idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Long ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Long> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder courseIdBetWeen(Long courseIdSt,Long courseIdEd){
            this.courseIdSt = courseIdSt;
            this.courseIdEd = courseIdEd;
            return this;
        }

        public ConditionBuilder courseIdGreaterEqThan(Long courseIdSt){
            this.courseIdSt = courseIdSt;
            return this;
        }
        public ConditionBuilder courseIdLessEqThan(Long courseIdEd){
            this.courseIdEd = courseIdEd;
            return this;
        }


        public ConditionBuilder courseIdList(Long ... courseId){
            this.courseIdList = solveNullList(courseId);
            return this;
        }

        public ConditionBuilder courseIdList(List<Long> courseId){
            this.courseIdList = courseId;
            return this;
        }

        public ConditionBuilder studentNumBetWeen(Integer studentNumSt,Integer studentNumEd){
            this.studentNumSt = studentNumSt;
            this.studentNumEd = studentNumEd;
            return this;
        }

        public ConditionBuilder studentNumGreaterEqThan(Integer studentNumSt){
            this.studentNumSt = studentNumSt;
            return this;
        }
        public ConditionBuilder studentNumLessEqThan(Integer studentNumEd){
            this.studentNumEd = studentNumEd;
            return this;
        }


        public ConditionBuilder studentNumList(Integer ... studentNum){
            this.studentNumList = solveNullList(studentNum);
            return this;
        }

        public ConditionBuilder studentNumList(List<Integer> studentNum){
            this.studentNumList = studentNum;
            return this;
        }

        public ConditionBuilder fuzzyClassName (List<String> fuzzyClassName){
            this.fuzzyClassName = fuzzyClassName;
            return this;
        }

        public ConditionBuilder fuzzyClassName (String ... fuzzyClassName){
            this.fuzzyClassName = solveNullList(fuzzyClassName);
            return this;
        }

        public ConditionBuilder rightFuzzyClassName (List<String> rightFuzzyClassName){
            this.rightFuzzyClassName = rightFuzzyClassName;
            return this;
        }

        public ConditionBuilder rightFuzzyClassName (String ... rightFuzzyClassName){
            this.rightFuzzyClassName = solveNullList(rightFuzzyClassName);
            return this;
        }

        public ConditionBuilder classNameList(String ... className){
            this.classNameList = solveNullList(className);
            return this;
        }

        public ConditionBuilder classNameList(List<String> className){
            this.classNameList = className;
            return this;
        }

        public ConditionBuilder fuzzyClassTeacher (List<String> fuzzyClassTeacher){
            this.fuzzyClassTeacher = fuzzyClassTeacher;
            return this;
        }

        public ConditionBuilder fuzzyClassTeacher (String ... fuzzyClassTeacher){
            this.fuzzyClassTeacher = solveNullList(fuzzyClassTeacher);
            return this;
        }

        public ConditionBuilder rightFuzzyClassTeacher (List<String> rightFuzzyClassTeacher){
            this.rightFuzzyClassTeacher = rightFuzzyClassTeacher;
            return this;
        }

        public ConditionBuilder rightFuzzyClassTeacher (String ... rightFuzzyClassTeacher){
            this.rightFuzzyClassTeacher = solveNullList(rightFuzzyClassTeacher);
            return this;
        }

        public ConditionBuilder classTeacherList(String ... classTeacher){
            this.classTeacherList = solveNullList(classTeacher);
            return this;
        }

        public ConditionBuilder classTeacherList(List<String> classTeacher){
            this.classTeacherList = classTeacher;
            return this;
        }

        public ConditionBuilder dataCreateBetWeen(java.time.LocalDateTime dataCreateSt,java.time.LocalDateTime dataCreateEd){
            this.dataCreateSt = dataCreateSt;
            this.dataCreateEd = dataCreateEd;
            return this;
        }

        public ConditionBuilder dataCreateGreaterEqThan(java.time.LocalDateTime dataCreateSt){
            this.dataCreateSt = dataCreateSt;
            return this;
        }
        public ConditionBuilder dataCreateLessEqThan(java.time.LocalDateTime dataCreateEd){
            this.dataCreateEd = dataCreateEd;
            return this;
        }


        public ConditionBuilder dataCreateList(java.time.LocalDateTime ... dataCreate){
            this.dataCreateList = solveNullList(dataCreate);
            return this;
        }

        public ConditionBuilder dataCreateList(List<java.time.LocalDateTime> dataCreate){
            this.dataCreateList = dataCreate;
            return this;
        }

        public ConditionBuilder dataModifiedBetWeen(java.time.LocalDateTime dataModifiedSt,java.time.LocalDateTime dataModifiedEd){
            this.dataModifiedSt = dataModifiedSt;
            this.dataModifiedEd = dataModifiedEd;
            return this;
        }

        public ConditionBuilder dataModifiedGreaterEqThan(java.time.LocalDateTime dataModifiedSt){
            this.dataModifiedSt = dataModifiedSt;
            return this;
        }
        public ConditionBuilder dataModifiedLessEqThan(java.time.LocalDateTime dataModifiedEd){
            this.dataModifiedEd = dataModifiedEd;
            return this;
        }


        public ConditionBuilder dataModifiedList(java.time.LocalDateTime ... dataModified){
            this.dataModifiedList = solveNullList(dataModified);
            return this;
        }

        public ConditionBuilder dataModifiedList(List<java.time.LocalDateTime> dataModified){
            this.dataModifiedList = dataModified;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private StudentCourse obj;

        public Builder(){
            this.obj = new StudentCourse();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder courseId(Long courseId){
            this.obj.setCourseId(courseId);
            return this;
        }
        public Builder studentNum(Integer studentNum){
            this.obj.setStudentNum(studentNum);
            return this;
        }
        public Builder className(String className){
            this.obj.setClassName(className);
            return this;
        }
        public Builder classTeacher(String classTeacher){
            this.obj.setClassTeacher(classTeacher);
            return this;
        }
        public Builder dataCreate(java.time.LocalDateTime dataCreate){
            this.obj.setDataCreate(dataCreate);
            return this;
        }
        public Builder dataModified(java.time.LocalDateTime dataModified){
            this.obj.setDataModified(dataModified);
            return this;
        }
        public StudentCourse build(){return obj;}
    }

}
