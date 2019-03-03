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
public class StudentExam implements Serializable {

    private static final long serialVersionUID = 1551254484189L;


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
    private Long studentId;

    /**
    * 
    * isNullAble:0
    */
    private Integer score;

    /**
    * 
    * isNullAble:0
    */
    private java.time.LocalDateTime dataCreate;

    /**
    * 
    * isNullAble:0
    */
    private java.time.LocalDateTime dataModified;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setCourseId(Long courseId){this.courseId = courseId;}

    public Long getCourseId(){return this.courseId;}

    public void setStudentId(Long studentId){this.studentId = studentId;}

    public Long getStudentId(){return this.studentId;}

    public void setScore(Integer score){this.score = score;}

    public Integer getScore(){return this.score;}

    public void setDataCreate(java.time.LocalDateTime dataCreate){this.dataCreate = dataCreate;}

    public java.time.LocalDateTime getDataCreate(){return this.dataCreate;}

    public void setDataModified(java.time.LocalDateTime dataModified){this.dataModified = dataModified;}

    public java.time.LocalDateTime getDataModified(){return this.dataModified;}
    @Override
    public String toString() {
        return "StudentExam{" +
                "id='" + id + '\'' +
                "courseId='" + courseId + '\'' +
                "studentId='" + studentId + '\'' +
                "score='" + score + '\'' +
                "dataCreate='" + dataCreate + '\'' +
                "dataModified='" + dataModified + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private StudentExam set;

        private ConditionBuilder where;

        public UpdateBuilder set(StudentExam set){
            this.set = set;
            return this;
        }

        public StudentExam getSet(){
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

    public static class QueryBuilder extends StudentExam{
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

        private List<Long> studentIdList;

        public List<Long> getStudentIdList(){return this.studentIdList;}

        private Long studentIdSt;

        private Long studentIdEd;

        public Long getStudentIdSt(){return this.studentIdSt;}

        public Long getStudentIdEd(){return this.studentIdEd;}

        private List<Integer> scoreList;

        public List<Integer> getScoreList(){return this.scoreList;}

        private Integer scoreSt;

        private Integer scoreEd;

        public Integer getScoreSt(){return this.scoreSt;}

        public Integer getScoreEd(){return this.scoreEd;}

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

        public QueryBuilder studentIdBetWeen(Long studentIdSt,Long studentIdEd){
            this.studentIdSt = studentIdSt;
            this.studentIdEd = studentIdEd;
            return this;
        }

        public QueryBuilder studentIdGreaterEqThan(Long studentIdSt){
            this.studentIdSt = studentIdSt;
            return this;
        }
        public QueryBuilder studentIdLessEqThan(Long studentIdEd){
            this.studentIdEd = studentIdEd;
            return this;
        }


        public QueryBuilder studentId(Long studentId){
            setStudentId(studentId);
            return this;
        }

        public QueryBuilder studentIdList(Long ... studentId){
            this.studentIdList = solveNullList(studentId);
            return this;
        }

        public QueryBuilder studentIdList(List<Long> studentId){
            this.studentIdList = studentId;
            return this;
        }

        public QueryBuilder fetchStudentId(){
            setFetchFields("fetchFields","studentId");
            return this;
        }

        public QueryBuilder excludeStudentId(){
            setFetchFields("excludeFields","studentId");
            return this;
        }

        public QueryBuilder scoreBetWeen(Integer scoreSt,Integer scoreEd){
            this.scoreSt = scoreSt;
            this.scoreEd = scoreEd;
            return this;
        }

        public QueryBuilder scoreGreaterEqThan(Integer scoreSt){
            this.scoreSt = scoreSt;
            return this;
        }
        public QueryBuilder scoreLessEqThan(Integer scoreEd){
            this.scoreEd = scoreEd;
            return this;
        }


        public QueryBuilder score(Integer score){
            setScore(score);
            return this;
        }

        public QueryBuilder scoreList(Integer ... score){
            this.scoreList = solveNullList(score);
            return this;
        }

        public QueryBuilder scoreList(List<Integer> score){
            this.scoreList = score;
            return this;
        }

        public QueryBuilder fetchScore(){
            setFetchFields("fetchFields","score");
            return this;
        }

        public QueryBuilder excludeScore(){
            setFetchFields("excludeFields","score");
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

        public StudentExam build(){return this;}
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

        private List<Long> studentIdList;

        public List<Long> getStudentIdList(){return this.studentIdList;}

        private Long studentIdSt;

        private Long studentIdEd;

        public Long getStudentIdSt(){return this.studentIdSt;}

        public Long getStudentIdEd(){return this.studentIdEd;}

        private List<Integer> scoreList;

        public List<Integer> getScoreList(){return this.scoreList;}

        private Integer scoreSt;

        private Integer scoreEd;

        public Integer getScoreSt(){return this.scoreSt;}

        public Integer getScoreEd(){return this.scoreEd;}

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

        public ConditionBuilder studentIdBetWeen(Long studentIdSt,Long studentIdEd){
            this.studentIdSt = studentIdSt;
            this.studentIdEd = studentIdEd;
            return this;
        }

        public ConditionBuilder studentIdGreaterEqThan(Long studentIdSt){
            this.studentIdSt = studentIdSt;
            return this;
        }
        public ConditionBuilder studentIdLessEqThan(Long studentIdEd){
            this.studentIdEd = studentIdEd;
            return this;
        }


        public ConditionBuilder studentIdList(Long ... studentId){
            this.studentIdList = solveNullList(studentId);
            return this;
        }

        public ConditionBuilder studentIdList(List<Long> studentId){
            this.studentIdList = studentId;
            return this;
        }

        public ConditionBuilder scoreBetWeen(Integer scoreSt,Integer scoreEd){
            this.scoreSt = scoreSt;
            this.scoreEd = scoreEd;
            return this;
        }

        public ConditionBuilder scoreGreaterEqThan(Integer scoreSt){
            this.scoreSt = scoreSt;
            return this;
        }
        public ConditionBuilder scoreLessEqThan(Integer scoreEd){
            this.scoreEd = scoreEd;
            return this;
        }


        public ConditionBuilder scoreList(Integer ... score){
            this.scoreList = solveNullList(score);
            return this;
        }

        public ConditionBuilder scoreList(List<Integer> score){
            this.scoreList = score;
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

        private StudentExam obj;

        public Builder(){
            this.obj = new StudentExam();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder courseId(Long courseId){
            this.obj.setCourseId(courseId);
            return this;
        }
        public Builder studentId(Long studentId){
            this.obj.setStudentId(studentId);
            return this;
        }
        public Builder score(Integer score){
            this.obj.setScore(score);
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
        public StudentExam build(){return obj;}
    }

}
