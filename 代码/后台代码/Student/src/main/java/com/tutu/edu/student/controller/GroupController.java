package com.tutu.edu.student.controller;

import com.tutu.edu.student.model.StudentInfo;
import com.tutu.edu.student.model.TopicInfo;
import com.tutu.edu.student.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
@author=wang

*/
@RestController
@RequestMapping("/group")
public class GroupController {
    @Autowired
    private GroupService groupService;
    @GetMapping("/inset/topic")
    public int insert(){
        StudentInfo studentinfo = new StudentInfo();
        return 0;
    }

    @GetMapping("/seach/topiclist")
    public ArrayList<TopicInfo> searchtoplist() {

        return groupService.searchlist();
    }
}
