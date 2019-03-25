package com.tutu.edu.student.service.impl;

import com.tutu.edu.student.mapper.read.base.TopicInfoBaseReadMapper;
import com.tutu.edu.student.model.TopicInfo;
import com.tutu.edu.student.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private TopicInfoBaseReadMapper topicInfoBaseReadMapper;
    @Override
    public ArrayList<TopicInfo> searchlist() {
        TopicInfo topicInfo = new TopicInfo();
        topicInfo.setId(1L);
        ArrayList<TopicInfo> topic = new ArrayList<TopicInfo>();
        topic.set(0,topicInfo);
        try{
          //  System.out.println(topicInfoBaseReadMapper.queryTopicInfo(topicInfo).get(0).getId());
            topicInfoBaseReadMapper.queryTopicInfo(topicInfo);
            return topicInfoBaseReadMapper.searchPojo();
        }
        catch (Exception e){
            System.out.println(e);
            return topic;
           // e.getCause().getMessage();
          //  e.printStackTrace();
        }
    }
}
