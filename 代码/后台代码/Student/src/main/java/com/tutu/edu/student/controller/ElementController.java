package com.tutu.edu.student.controller;

import com.tutu.edu.student.model.StudentInfo;
import com.tutu.edu.student.service.ElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/element")
public class ElementController {
    @Autowired
    private ElementService elementService;
    @GetMapping("search/list")
    public ArrayList<StudentInfo> elementStudentListSearch(){
        return elementService.QueryAllList();
    }
    @GetMapping("/insert")
    public int insert(){
        StudentInfo studentinfo = new StudentInfo();
        return elementService.insertstudentInfo(studentinfo);
    }

//    @GetMapping("/all")
//    @Cacheable(value = "business")
//    public ArrayList<Business> searchAll(){
//
//        return businessService.searchAll();
//
//    }
//    @PostMapping("/searchbySelect")
//    // @Cacheable(value = "business")
//    public ArrayList<Business> searchBySelect(@RequestBody Business business){
//
//        return businessService.searchBySelect(business);
//
//    }

}
