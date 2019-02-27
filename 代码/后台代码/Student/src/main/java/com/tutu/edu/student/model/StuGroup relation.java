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
public class StuGroup relation implements Serializable {

    private static final long serialVersionUID = 1551254498019L;


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
    private Long userId;

    /**
    * 
    * isNullAble:0
    */
    private Integer time;

    /**
    * 
    * isNullAble:0
    */
    private String reason;

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

    public void setUserId(Long userId){this.userId = userId;}

    public Long getUserId(){return this.userId;}

    public void setTime(Integer time){this.time = time;}

    public Integer getTime(){return this.time;}

    public void setReason(String reason){this.reason = reason;}

    public String getReason(){return this.reason;}

    public void setDataCreate(java.time.LocalDateTime dataCreate){this.dataCreate = dataCreate;}

    public java.time.LocalDateTime getDataCreate(){return this.dataCreate;}

    public void setDataModified(java.time.LocalDateTime dataModified){this.dataModified = dataModified;}

    public java.time.LocalDateTime getDataModified(){return this.dataModified;}
    @Override
    public String toString() {
        return "StuGroup relation{" +
                "id='" + id + '\'' +
                "userId='" + userId + '\'' +
                "time='" + time + '\'' +
                "reason='" + reason + '\'' +
                "dataCreate='" + dataCreate + '\'' +
                "dataModified='" + dataModified + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private StuGroup relation set;

        private ConditionBuilder where;

        public UpdateBuilder set(StuGroup relation set){
            this.set = set;
            return this;
        }

        public StuGroup relation getSet(){
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

    public static class QueryBuilder extends StuGroup relation{
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

        private List<Long> userIdList;

        public List<Long> getUserIdList(){return this.userIdList;}

        private Long userIdSt;

        private Long userIdEd;

        public Long getUserIdSt(){return this.userIdSt;}

        public Long getUserIdEd(){return this.userIdEd;}

        private List<Integer> timeList;

        public List<Integer> getTimeList(){return this.timeList;}

        private Integer timeSt;

        private Integer timeEd;

        public Integer getTimeSt(){return this.timeSt;}

        public Integer getTimeEd(){return this.timeEd;}

        private List<String> reasonList;

        public List<String> getReasonList(){return this.reasonList;}


        private List<String> fuzzyReason;

        public List<String> getFuzzyReason(){return this.fuzzyReason;}

        private List<String> rightFuzzyReason;

        public List<String> getRightFuzzyReason(){return this.rightFuzzyReason;}
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

        public QueryBuilder userIdBetWeen(Long userIdSt,Long userIdEd){
            this.userIdSt = userIdSt;
            this.userIdEd = userIdEd;
            return this;
        }

        public QueryBuilder userIdGreaterEqThan(Long userIdSt){
            this.userIdSt = userIdSt;
            return this;
        }
        public QueryBuilder userIdLessEqThan(Long userIdEd){
            this.userIdEd = userIdEd;
            return this;
        }


        public QueryBuilder userId(Long userId){
            setUserId(userId);
            return this;
        }

        public QueryBuilder userIdList(Long ... userId){
            this.userIdList = solveNullList(userId);
            return this;
        }

        public QueryBuilder userIdList(List<Long> userId){
            this.userIdList = userId;
            return this;
        }

        public QueryBuilder fetchUserId(){
            setFetchFields("fetchFields","userId");
            return this;
        }

        public QueryBuilder excludeUserId(){
            setFetchFields("excludeFields","userId");
            return this;
        }

        public QueryBuilder timeBetWeen(Integer timeSt,Integer timeEd){
            this.timeSt = timeSt;
            this.timeEd = timeEd;
            return this;
        }

        public QueryBuilder timeGreaterEqThan(Integer timeSt){
            this.timeSt = timeSt;
            return this;
        }
        public QueryBuilder timeLessEqThan(Integer timeEd){
            this.timeEd = timeEd;
            return this;
        }


        public QueryBuilder time(Integer time){
            setTime(time);
            return this;
        }

        public QueryBuilder timeList(Integer ... time){
            this.timeList = solveNullList(time);
            return this;
        }

        public QueryBuilder timeList(List<Integer> time){
            this.timeList = time;
            return this;
        }

        public QueryBuilder fetchTime(){
            setFetchFields("fetchFields","time");
            return this;
        }

        public QueryBuilder excludeTime(){
            setFetchFields("excludeFields","time");
            return this;
        }

        public QueryBuilder fuzzyReason (List<String> fuzzyReason){
            this.fuzzyReason = fuzzyReason;
            return this;
        }

        public QueryBuilder fuzzyReason (String ... fuzzyReason){
            this.fuzzyReason = solveNullList(fuzzyReason);
            return this;
        }

        public QueryBuilder rightFuzzyReason (List<String> rightFuzzyReason){
            this.rightFuzzyReason = rightFuzzyReason;
            return this;
        }

        public QueryBuilder rightFuzzyReason (String ... rightFuzzyReason){
            this.rightFuzzyReason = solveNullList(rightFuzzyReason);
            return this;
        }

        public QueryBuilder reason(String reason){
            setReason(reason);
            return this;
        }

        public QueryBuilder reasonList(String ... reason){
            this.reasonList = solveNullList(reason);
            return this;
        }

        public QueryBuilder reasonList(List<String> reason){
            this.reasonList = reason;
            return this;
        }

        public QueryBuilder fetchReason(){
            setFetchFields("fetchFields","reason");
            return this;
        }

        public QueryBuilder excludeReason(){
            setFetchFields("excludeFields","reason");
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

        public StuGroup relation build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<Long> userIdList;

        public List<Long> getUserIdList(){return this.userIdList;}

        private Long userIdSt;

        private Long userIdEd;

        public Long getUserIdSt(){return this.userIdSt;}

        public Long getUserIdEd(){return this.userIdEd;}

        private List<Integer> timeList;

        public List<Integer> getTimeList(){return this.timeList;}

        private Integer timeSt;

        private Integer timeEd;

        public Integer getTimeSt(){return this.timeSt;}

        public Integer getTimeEd(){return this.timeEd;}

        private List<String> reasonList;

        public List<String> getReasonList(){return this.reasonList;}


        private List<String> fuzzyReason;

        public List<String> getFuzzyReason(){return this.fuzzyReason;}

        private List<String> rightFuzzyReason;

        public List<String> getRightFuzzyReason(){return this.rightFuzzyReason;}
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

        public ConditionBuilder userIdBetWeen(Long userIdSt,Long userIdEd){
            this.userIdSt = userIdSt;
            this.userIdEd = userIdEd;
            return this;
        }

        public ConditionBuilder userIdGreaterEqThan(Long userIdSt){
            this.userIdSt = userIdSt;
            return this;
        }
        public ConditionBuilder userIdLessEqThan(Long userIdEd){
            this.userIdEd = userIdEd;
            return this;
        }


        public ConditionBuilder userIdList(Long ... userId){
            this.userIdList = solveNullList(userId);
            return this;
        }

        public ConditionBuilder userIdList(List<Long> userId){
            this.userIdList = userId;
            return this;
        }

        public ConditionBuilder timeBetWeen(Integer timeSt,Integer timeEd){
            this.timeSt = timeSt;
            this.timeEd = timeEd;
            return this;
        }

        public ConditionBuilder timeGreaterEqThan(Integer timeSt){
            this.timeSt = timeSt;
            return this;
        }
        public ConditionBuilder timeLessEqThan(Integer timeEd){
            this.timeEd = timeEd;
            return this;
        }


        public ConditionBuilder timeList(Integer ... time){
            this.timeList = solveNullList(time);
            return this;
        }

        public ConditionBuilder timeList(List<Integer> time){
            this.timeList = time;
            return this;
        }

        public ConditionBuilder fuzzyReason (List<String> fuzzyReason){
            this.fuzzyReason = fuzzyReason;
            return this;
        }

        public ConditionBuilder fuzzyReason (String ... fuzzyReason){
            this.fuzzyReason = solveNullList(fuzzyReason);
            return this;
        }

        public ConditionBuilder rightFuzzyReason (List<String> rightFuzzyReason){
            this.rightFuzzyReason = rightFuzzyReason;
            return this;
        }

        public ConditionBuilder rightFuzzyReason (String ... rightFuzzyReason){
            this.rightFuzzyReason = solveNullList(rightFuzzyReason);
            return this;
        }

        public ConditionBuilder reasonList(String ... reason){
            this.reasonList = solveNullList(reason);
            return this;
        }

        public ConditionBuilder reasonList(List<String> reason){
            this.reasonList = reason;
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

        private StuGroup relation obj;

        public Builder(){
            this.obj = new StuGroup relation();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder userId(Long userId){
            this.obj.setUserId(userId);
            return this;
        }
        public Builder time(Integer time){
            this.obj.setTime(time);
            return this;
        }
        public Builder reason(String reason){
            this.obj.setReason(reason);
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
        public StuGroup relation build(){return obj;}
    }

}
