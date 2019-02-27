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
public class studentInfo implements Serializable {

    private static final long serialVersionUID = 1551246198057L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long   id;

    /**
    * 
    * isNullAble:0
    */
    private Integer studentNum;

    /**
    * 
    * isNullAble:0
    */
    private String studentName;

    /**
    * 
    * isNullAble:0
    */
    private String studentSex;

    /**
    * 
    * isNullAble:0
    */
    private String studentPhone;

    /**
    * 
    * isNullAble:0
    */
    private Long collegeId;

    /**
    * 
    * isNullAble:0
    */
    private Long specialtyId;

    /**
    * 
    * isNullAble:0
    */
    private Long facultyId;

    /**
    * 
    * isNullAble:0
    */
    private Long classId;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime dataCreate;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime dataModified;


    public void setId(Long   id){this.  id =   id;}

    public Long getId(){return this.  id;}

    public void setStudentNum(Integer studentNum){this.studentNum = studentNum;}

    public Integer getStudentNum(){return this.studentNum;}

    public void setStudentName(String studentName){this.studentName = studentName;}

    public String getStudentName(){return this.studentName;}

    public void setStudentSex(String studentSex){this.studentSex = studentSex;}

    public String getStudentSex(){return this.studentSex;}

    public void setStudentPhone(String studentPhone){this.studentPhone = studentPhone;}

    public String getStudentPhone(){return this.studentPhone;}

    public void setCollegeId(Long collegeId){this.collegeId = collegeId;}

    public Long getCollegeId(){return this.collegeId;}

    public void setSpecialtyId(Long specialtyId){this.specialtyId = specialtyId;}

    public Long getSpecialtyId(){return this.specialtyId;}

    public void setFacultyId(Long facultyId){this.facultyId = facultyId;}

    public Long getFacultyId(){return this.facultyId;}

    public void setClassId(Long classId){this.classId = classId;}

    public Long getClassId(){return this.classId;}

    public void setDataCreate(java.time.LocalDateTime dataCreate){this.dataCreate = dataCreate;}

    public java.time.LocalDateTime getDataCreate(){return this.dataCreate;}

    public void setDataModified(java.time.LocalDateTime dataModified){this.dataModified = dataModified;}

    public java.time.LocalDateTime getDataModified(){return this.dataModified;}
    @Override
    public String toString() {
        return "studentInfo{" +
                "  id='" +   id + '\'' +
                "studentNum='" + studentNum + '\'' +
                "studentName='" + studentName + '\'' +
                "studentSex='" + studentSex + '\'' +
                "studentPhone='" + studentPhone + '\'' +
                "collegeId='" + collegeId + '\'' +
                "specialtyId='" + specialtyId + '\'' +
                "facultyId='" + facultyId + '\'' +
                "classId='" + classId + '\'' +
                "dataCreate='" + dataCreate + '\'' +
                "dataModified='" + dataModified + '\'' +
            '}';
    }
    //构造函数
    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private studentInfo set;

        private ConditionBuilder where;

        public UpdateBuilder set(studentInfo set){
            this.set = set;
            return this;
        }

        public studentInfo getSet(){
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

    public static class QueryBuilder extends studentInfo{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Long>   idList;

        public List<Long> getIdList(){return this.  idList;}

        private Long   idSt;

        private Long   idEd;

        public Long getIdSt(){return this.  idSt;}

        public Long getIdEd(){return this.  idEd;}

        private List<Integer> studentNumList;

        public List<Integer> getStudentNumList(){return this.studentNumList;}

        private Integer studentNumSt;

        private Integer studentNumEd;

        public Integer getStudentNumSt(){return this.studentNumSt;}

        public Integer getStudentNumEd(){return this.studentNumEd;}

        private List<String> studentNameList;

        public List<String> getStudentNameList(){return this.studentNameList;}


        private List<String> fuzzyStudentName;

        public List<String> getFuzzyStudentName(){return this.fuzzyStudentName;}

        private List<String> rightFuzzyStudentName;

        public List<String> getRightFuzzyStudentName(){return this.rightFuzzyStudentName;}
        private List<String> studentSexList;

        public List<String> getStudentSexList(){return this.studentSexList;}


        private List<String> fuzzyStudentSex;

        public List<String> getFuzzyStudentSex(){return this.fuzzyStudentSex;}

        private List<String> rightFuzzyStudentSex;

        public List<String> getRightFuzzyStudentSex(){return this.rightFuzzyStudentSex;}
        private List<String> studentPhoneList;

        public List<String> getStudentPhoneList(){return this.studentPhoneList;}


        private List<String> fuzzyStudentPhone;

        public List<String> getFuzzyStudentPhone(){return this.fuzzyStudentPhone;}

        private List<String> rightFuzzyStudentPhone;

        public List<String> getRightFuzzyStudentPhone(){return this.rightFuzzyStudentPhone;}
        private List<Long> collegeIdList;

        public List<Long> getCollegeIdList(){return this.collegeIdList;}

        private Long collegeIdSt;

        private Long collegeIdEd;

        public Long getCollegeIdSt(){return this.collegeIdSt;}

        public Long getCollegeIdEd(){return this.collegeIdEd;}

        private List<Long> specialtyIdList;

        public List<Long> getSpecialtyIdList(){return this.specialtyIdList;}

        private Long specialtyIdSt;

        private Long specialtyIdEd;

        public Long getSpecialtyIdSt(){return this.specialtyIdSt;}

        public Long getSpecialtyIdEd(){return this.specialtyIdEd;}

        private List<Long> facultyIdList;

        public List<Long> getFacultyIdList(){return this.facultyIdList;}

        private Long facultyIdSt;

        private Long facultyIdEd;

        public Long getFacultyIdSt(){return this.facultyIdSt;}

        public Long getFacultyIdEd(){return this.facultyIdEd;}

        private List<Long> classIdList;

        public List<Long> getClassIdList(){return this.classIdList;}

        private Long classIdSt;

        private Long classIdEd;

        public Long getClassIdSt(){return this.classIdSt;}

        public Long getClassIdEd(){return this.classIdEd;}

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

        public QueryBuilder   idBetWeen(Long   idSt,Long   idEd){
            this.  idSt =   idSt;
            this.  idEd =   idEd;
            return this;
        }

        public QueryBuilder   idGreaterEqThan(Long   idSt){
            this.  idSt =   idSt;
            return this;
        }
        public QueryBuilder   idLessEqThan(Long   idEd){
            this.  idEd =   idEd;
            return this;
        }


        public QueryBuilder   id(Long   id){
            setId(  id);
            return this;
        }

        public QueryBuilder   idList(Long ...   id){
            this.  idList = solveNullList(  id);
            return this;
        }

        public QueryBuilder   idList(List<Long>   id){
            this.  idList =   id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","  id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","  id");
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

        public QueryBuilder fuzzyStudentName (List<String> fuzzyStudentName){
            this.fuzzyStudentName = fuzzyStudentName;
            return this;
        }

        public QueryBuilder fuzzyStudentName (String ... fuzzyStudentName){
            this.fuzzyStudentName = solveNullList(fuzzyStudentName);
            return this;
        }

        public QueryBuilder rightFuzzyStudentName (List<String> rightFuzzyStudentName){
            this.rightFuzzyStudentName = rightFuzzyStudentName;
            return this;
        }

        public QueryBuilder rightFuzzyStudentName (String ... rightFuzzyStudentName){
            this.rightFuzzyStudentName = solveNullList(rightFuzzyStudentName);
            return this;
        }

        public QueryBuilder studentName(String studentName){
            setStudentName(studentName);
            return this;
        }

        public QueryBuilder studentNameList(String ... studentName){
            this.studentNameList = solveNullList(studentName);
            return this;
        }

        public QueryBuilder studentNameList(List<String> studentName){
            this.studentNameList = studentName;
            return this;
        }

        public QueryBuilder fetchStudentName(){
            setFetchFields("fetchFields","studentName");
            return this;
        }

        public QueryBuilder excludeStudentName(){
            setFetchFields("excludeFields","studentName");
            return this;
        }

        public QueryBuilder fuzzyStudentSex (List<String> fuzzyStudentSex){
            this.fuzzyStudentSex = fuzzyStudentSex;
            return this;
        }

        public QueryBuilder fuzzyStudentSex (String ... fuzzyStudentSex){
            this.fuzzyStudentSex = solveNullList(fuzzyStudentSex);
            return this;
        }

        public QueryBuilder rightFuzzyStudentSex (List<String> rightFuzzyStudentSex){
            this.rightFuzzyStudentSex = rightFuzzyStudentSex;
            return this;
        }

        public QueryBuilder rightFuzzyStudentSex (String ... rightFuzzyStudentSex){
            this.rightFuzzyStudentSex = solveNullList(rightFuzzyStudentSex);
            return this;
        }

        public QueryBuilder studentSex(String studentSex){
            setStudentSex(studentSex);
            return this;
        }

        public QueryBuilder studentSexList(String ... studentSex){
            this.studentSexList = solveNullList(studentSex);
            return this;
        }

        public QueryBuilder studentSexList(List<String> studentSex){
            this.studentSexList = studentSex;
            return this;
        }

        public QueryBuilder fetchStudentSex(){
            setFetchFields("fetchFields","studentSex");
            return this;
        }

        public QueryBuilder excludeStudentSex(){
            setFetchFields("excludeFields","studentSex");
            return this;
        }

        public QueryBuilder fuzzyStudentPhone (List<String> fuzzyStudentPhone){
            this.fuzzyStudentPhone = fuzzyStudentPhone;
            return this;
        }

        public QueryBuilder fuzzyStudentPhone (String ... fuzzyStudentPhone){
            this.fuzzyStudentPhone = solveNullList(fuzzyStudentPhone);
            return this;
        }

        public QueryBuilder rightFuzzyStudentPhone (List<String> rightFuzzyStudentPhone){
            this.rightFuzzyStudentPhone = rightFuzzyStudentPhone;
            return this;
        }

        public QueryBuilder rightFuzzyStudentPhone (String ... rightFuzzyStudentPhone){
            this.rightFuzzyStudentPhone = solveNullList(rightFuzzyStudentPhone);
            return this;
        }

        public QueryBuilder studentPhone(String studentPhone){
            setStudentPhone(studentPhone);
            return this;
        }

        public QueryBuilder studentPhoneList(String ... studentPhone){
            this.studentPhoneList = solveNullList(studentPhone);
            return this;
        }

        public QueryBuilder studentPhoneList(List<String> studentPhone){
            this.studentPhoneList = studentPhone;
            return this;
        }

        public QueryBuilder fetchStudentPhone(){
            setFetchFields("fetchFields","studentPhone");
            return this;
        }

        public QueryBuilder excludeStudentPhone(){
            setFetchFields("excludeFields","studentPhone");
            return this;
        }

        public QueryBuilder collegeIdBetWeen(Long collegeIdSt,Long collegeIdEd){
            this.collegeIdSt = collegeIdSt;
            this.collegeIdEd = collegeIdEd;
            return this;
        }

        public QueryBuilder collegeIdGreaterEqThan(Long collegeIdSt){
            this.collegeIdSt = collegeIdSt;
            return this;
        }
        public QueryBuilder collegeIdLessEqThan(Long collegeIdEd){
            this.collegeIdEd = collegeIdEd;
            return this;
        }


        public QueryBuilder collegeId(Long collegeId){
            setCollegeId(collegeId);
            return this;
        }

        public QueryBuilder collegeIdList(Long ... collegeId){
            this.collegeIdList = solveNullList(collegeId);
            return this;
        }

        public QueryBuilder collegeIdList(List<Long> collegeId){
            this.collegeIdList = collegeId;
            return this;
        }

        public QueryBuilder fetchCollegeId(){
            setFetchFields("fetchFields","collegeId");
            return this;
        }

        public QueryBuilder excludeCollegeId(){
            setFetchFields("excludeFields","collegeId");
            return this;
        }

        public QueryBuilder specialtyIdBetWeen(Long specialtyIdSt,Long specialtyIdEd){
            this.specialtyIdSt = specialtyIdSt;
            this.specialtyIdEd = specialtyIdEd;
            return this;
        }

        public QueryBuilder specialtyIdGreaterEqThan(Long specialtyIdSt){
            this.specialtyIdSt = specialtyIdSt;
            return this;
        }
        public QueryBuilder specialtyIdLessEqThan(Long specialtyIdEd){
            this.specialtyIdEd = specialtyIdEd;
            return this;
        }


        public QueryBuilder specialtyId(Long specialtyId){
            setSpecialtyId(specialtyId);
            return this;
        }

        public QueryBuilder specialtyIdList(Long ... specialtyId){
            this.specialtyIdList = solveNullList(specialtyId);
            return this;
        }

        public QueryBuilder specialtyIdList(List<Long> specialtyId){
            this.specialtyIdList = specialtyId;
            return this;
        }

        public QueryBuilder fetchSpecialtyId(){
            setFetchFields("fetchFields","specialtyId");
            return this;
        }

        public QueryBuilder excludeSpecialtyId(){
            setFetchFields("excludeFields","specialtyId");
            return this;
        }

        public QueryBuilder facultyIdBetWeen(Long facultyIdSt,Long facultyIdEd){
            this.facultyIdSt = facultyIdSt;
            this.facultyIdEd = facultyIdEd;
            return this;
        }

        public QueryBuilder facultyIdGreaterEqThan(Long facultyIdSt){
            this.facultyIdSt = facultyIdSt;
            return this;
        }
        public QueryBuilder facultyIdLessEqThan(Long facultyIdEd){
            this.facultyIdEd = facultyIdEd;
            return this;
        }


        public QueryBuilder facultyId(Long facultyId){
            setFacultyId(facultyId);
            return this;
        }

        public QueryBuilder facultyIdList(Long ... facultyId){
            this.facultyIdList = solveNullList(facultyId);
            return this;
        }

        public QueryBuilder facultyIdList(List<Long> facultyId){
            this.facultyIdList = facultyId;
            return this;
        }

        public QueryBuilder fetchFacultyId(){
            setFetchFields("fetchFields","facultyId");
            return this;
        }

        public QueryBuilder excludeFacultyId(){
            setFetchFields("excludeFields","facultyId");
            return this;
        }

        public QueryBuilder classIdBetWeen(Long classIdSt,Long classIdEd){
            this.classIdSt = classIdSt;
            this.classIdEd = classIdEd;
            return this;
        }

        public QueryBuilder classIdGreaterEqThan(Long classIdSt){
            this.classIdSt = classIdSt;
            return this;
        }
        public QueryBuilder classIdLessEqThan(Long classIdEd){
            this.classIdEd = classIdEd;
            return this;
        }


        public QueryBuilder classId(Long classId){
            setClassId(classId);
            return this;
        }

        public QueryBuilder classIdList(Long ... classId){
            this.classIdList = solveNullList(classId);
            return this;
        }

        public QueryBuilder classIdList(List<Long> classId){
            this.classIdList = classId;
            return this;
        }

        public QueryBuilder fetchClassId(){
            setFetchFields("fetchFields","classId");
            return this;
        }

        public QueryBuilder excludeClassId(){
            setFetchFields("excludeFields","classId");
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

        public studentInfo build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long>   idList;

        public List<Long> getIdList(){return this.  idList;}

        private Long   idSt;

        private Long   idEd;

        public Long getIdSt(){return this.  idSt;}

        public Long getIdEd(){return this.  idEd;}

        private List<Integer> studentNumList;

        public List<Integer> getStudentNumList(){return this.studentNumList;}

        private Integer studentNumSt;

        private Integer studentNumEd;

        public Integer getStudentNumSt(){return this.studentNumSt;}

        public Integer getStudentNumEd(){return this.studentNumEd;}

        private List<String> studentNameList;

        public List<String> getStudentNameList(){return this.studentNameList;}


        private List<String> fuzzyStudentName;

        public List<String> getFuzzyStudentName(){return this.fuzzyStudentName;}

        private List<String> rightFuzzyStudentName;

        public List<String> getRightFuzzyStudentName(){return this.rightFuzzyStudentName;}
        private List<String> studentSexList;

        public List<String> getStudentSexList(){return this.studentSexList;}


        private List<String> fuzzyStudentSex;

        public List<String> getFuzzyStudentSex(){return this.fuzzyStudentSex;}

        private List<String> rightFuzzyStudentSex;

        public List<String> getRightFuzzyStudentSex(){return this.rightFuzzyStudentSex;}
        private List<String> studentPhoneList;

        public List<String> getStudentPhoneList(){return this.studentPhoneList;}


        private List<String> fuzzyStudentPhone;

        public List<String> getFuzzyStudentPhone(){return this.fuzzyStudentPhone;}

        private List<String> rightFuzzyStudentPhone;

        public List<String> getRightFuzzyStudentPhone(){return this.rightFuzzyStudentPhone;}
        private List<Long> collegeIdList;

        public List<Long> getCollegeIdList(){return this.collegeIdList;}

        private Long collegeIdSt;

        private Long collegeIdEd;

        public Long getCollegeIdSt(){return this.collegeIdSt;}

        public Long getCollegeIdEd(){return this.collegeIdEd;}

        private List<Long> specialtyIdList;

        public List<Long> getSpecialtyIdList(){return this.specialtyIdList;}

        private Long specialtyIdSt;

        private Long specialtyIdEd;

        public Long getSpecialtyIdSt(){return this.specialtyIdSt;}

        public Long getSpecialtyIdEd(){return this.specialtyIdEd;}

        private List<Long> facultyIdList;

        public List<Long> getFacultyIdList(){return this.facultyIdList;}

        private Long facultyIdSt;

        private Long facultyIdEd;

        public Long getFacultyIdSt(){return this.facultyIdSt;}

        public Long getFacultyIdEd(){return this.facultyIdEd;}

        private List<Long> classIdList;

        public List<Long> getClassIdList(){return this.classIdList;}

        private Long classIdSt;

        private Long classIdEd;

        public Long getClassIdSt(){return this.classIdSt;}

        public Long getClassIdEd(){return this.classIdEd;}

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


        public ConditionBuilder   idBetWeen(Long   idSt,Long   idEd){
            this.  idSt =   idSt;
            this.  idEd =   idEd;
            return this;
        }

        public ConditionBuilder   idGreaterEqThan(Long   idSt){
            this.  idSt =   idSt;
            return this;
        }
        public ConditionBuilder   idLessEqThan(Long   idEd){
            this.  idEd =   idEd;
            return this;
        }


        public ConditionBuilder   idList(Long ...   id){
            this.  idList = solveNullList(  id);
            return this;
        }

        public ConditionBuilder   idList(List<Long>   id){
            this.  idList =   id;
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

        public ConditionBuilder fuzzyStudentName (List<String> fuzzyStudentName){
            this.fuzzyStudentName = fuzzyStudentName;
            return this;
        }

        public ConditionBuilder fuzzyStudentName (String ... fuzzyStudentName){
            this.fuzzyStudentName = solveNullList(fuzzyStudentName);
            return this;
        }

        public ConditionBuilder rightFuzzyStudentName (List<String> rightFuzzyStudentName){
            this.rightFuzzyStudentName = rightFuzzyStudentName;
            return this;
        }

        public ConditionBuilder rightFuzzyStudentName (String ... rightFuzzyStudentName){
            this.rightFuzzyStudentName = solveNullList(rightFuzzyStudentName);
            return this;
        }

        public ConditionBuilder studentNameList(String ... studentName){
            this.studentNameList = solveNullList(studentName);
            return this;
        }

        public ConditionBuilder studentNameList(List<String> studentName){
            this.studentNameList = studentName;
            return this;
        }

        public ConditionBuilder fuzzyStudentSex (List<String> fuzzyStudentSex){
            this.fuzzyStudentSex = fuzzyStudentSex;
            return this;
        }

        public ConditionBuilder fuzzyStudentSex (String ... fuzzyStudentSex){
            this.fuzzyStudentSex = solveNullList(fuzzyStudentSex);
            return this;
        }

        public ConditionBuilder rightFuzzyStudentSex (List<String> rightFuzzyStudentSex){
            this.rightFuzzyStudentSex = rightFuzzyStudentSex;
            return this;
        }

        public ConditionBuilder rightFuzzyStudentSex (String ... rightFuzzyStudentSex){
            this.rightFuzzyStudentSex = solveNullList(rightFuzzyStudentSex);
            return this;
        }

        public ConditionBuilder studentSexList(String ... studentSex){
            this.studentSexList = solveNullList(studentSex);
            return this;
        }

        public ConditionBuilder studentSexList(List<String> studentSex){
            this.studentSexList = studentSex;
            return this;
        }

        public ConditionBuilder fuzzyStudentPhone (List<String> fuzzyStudentPhone){
            this.fuzzyStudentPhone = fuzzyStudentPhone;
            return this;
        }

        public ConditionBuilder fuzzyStudentPhone (String ... fuzzyStudentPhone){
            this.fuzzyStudentPhone = solveNullList(fuzzyStudentPhone);
            return this;
        }

        public ConditionBuilder rightFuzzyStudentPhone (List<String> rightFuzzyStudentPhone){
            this.rightFuzzyStudentPhone = rightFuzzyStudentPhone;
            return this;
        }

        public ConditionBuilder rightFuzzyStudentPhone (String ... rightFuzzyStudentPhone){
            this.rightFuzzyStudentPhone = solveNullList(rightFuzzyStudentPhone);
            return this;
        }

        public ConditionBuilder studentPhoneList(String ... studentPhone){
            this.studentPhoneList = solveNullList(studentPhone);
            return this;
        }

        public ConditionBuilder studentPhoneList(List<String> studentPhone){
            this.studentPhoneList = studentPhone;
            return this;
        }

        public ConditionBuilder collegeIdBetWeen(Long collegeIdSt,Long collegeIdEd){
            this.collegeIdSt = collegeIdSt;
            this.collegeIdEd = collegeIdEd;
            return this;
        }

        public ConditionBuilder collegeIdGreaterEqThan(Long collegeIdSt){
            this.collegeIdSt = collegeIdSt;
            return this;
        }
        public ConditionBuilder collegeIdLessEqThan(Long collegeIdEd){
            this.collegeIdEd = collegeIdEd;
            return this;
        }


        public ConditionBuilder collegeIdList(Long ... collegeId){
            this.collegeIdList = solveNullList(collegeId);
            return this;
        }

        public ConditionBuilder collegeIdList(List<Long> collegeId){
            this.collegeIdList = collegeId;
            return this;
        }

        public ConditionBuilder specialtyIdBetWeen(Long specialtyIdSt,Long specialtyIdEd){
            this.specialtyIdSt = specialtyIdSt;
            this.specialtyIdEd = specialtyIdEd;
            return this;
        }

        public ConditionBuilder specialtyIdGreaterEqThan(Long specialtyIdSt){
            this.specialtyIdSt = specialtyIdSt;
            return this;
        }
        public ConditionBuilder specialtyIdLessEqThan(Long specialtyIdEd){
            this.specialtyIdEd = specialtyIdEd;
            return this;
        }


        public ConditionBuilder specialtyIdList(Long ... specialtyId){
            this.specialtyIdList = solveNullList(specialtyId);
            return this;
        }

        public ConditionBuilder specialtyIdList(List<Long> specialtyId){
            this.specialtyIdList = specialtyId;
            return this;
        }

        public ConditionBuilder facultyIdBetWeen(Long facultyIdSt,Long facultyIdEd){
            this.facultyIdSt = facultyIdSt;
            this.facultyIdEd = facultyIdEd;
            return this;
        }

        public ConditionBuilder facultyIdGreaterEqThan(Long facultyIdSt){
            this.facultyIdSt = facultyIdSt;
            return this;
        }
        public ConditionBuilder facultyIdLessEqThan(Long facultyIdEd){
            this.facultyIdEd = facultyIdEd;
            return this;
        }


        public ConditionBuilder facultyIdList(Long ... facultyId){
            this.facultyIdList = solveNullList(facultyId);
            return this;
        }

        public ConditionBuilder facultyIdList(List<Long> facultyId){
            this.facultyIdList = facultyId;
            return this;
        }

        public ConditionBuilder classIdBetWeen(Long classIdSt,Long classIdEd){
            this.classIdSt = classIdSt;
            this.classIdEd = classIdEd;
            return this;
        }

        public ConditionBuilder classIdGreaterEqThan(Long classIdSt){
            this.classIdSt = classIdSt;
            return this;
        }
        public ConditionBuilder classIdLessEqThan(Long classIdEd){
            this.classIdEd = classIdEd;
            return this;
        }


        public ConditionBuilder classIdList(Long ... classId){
            this.classIdList = solveNullList(classId);
            return this;
        }

        public ConditionBuilder classIdList(List<Long> classId){
            this.classIdList = classId;
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

        private studentInfo obj;

        public Builder(){
            this.obj = new studentInfo();
        }

        public Builder   id(Long   id){
            this.obj.setId(  id);
            return this;
        }
        public Builder studentNum(Integer studentNum){
            this.obj.setStudentNum(studentNum);
            return this;
        }
        public Builder studentName(String studentName){
            this.obj.setStudentName(studentName);
            return this;
        }
        public Builder studentSex(String studentSex){
            this.obj.setStudentSex(studentSex);
            return this;
        }
        public Builder studentPhone(String studentPhone){
            this.obj.setStudentPhone(studentPhone);
            return this;
        }
        public Builder collegeId(Long collegeId){
            this.obj.setCollegeId(collegeId);
            return this;
        }
        public Builder specialtyId(Long specialtyId){
            this.obj.setSpecialtyId(specialtyId);
            return this;
        }
        public Builder facultyId(Long facultyId){
            this.obj.setFacultyId(facultyId);
            return this;
        }
        public Builder classId(Long classId){
            this.obj.setClassId(classId);
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
        public studentInfo build(){return obj;}
    }

}
