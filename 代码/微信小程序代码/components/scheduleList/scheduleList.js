// components/scheduleList/scheduleList.js
Component({
  /**
   * 组件的属性列表
   */
  properties: {
    types:{
      type: String,
      value:""
    },
    time:{
      type: String,
      value: ""
    },
    course: {
      type: String,
      value: ""
    },
    place:{
      type:String,
      value:""
    },
    teacher:{
      type:String,
      value:""
    },
    isStatus: {
      type: Number,
      value: 0
    },
    kaTime: {
      type: String,
      value: ""
    }
  },

  /**
   * 组件的初始数据
   */
  data: {

  },

  /**
   * 组件的方法列表
   */
  methods: {
    courseDetail:function(){
      wx.navigateTo({
        url: '../../pages/course/course',
      })
    },
    startLearn: function () {
      wx.navigateTo({
        url: '../../pages/onlinevedio/onlinevedio',
      })
    }
  },

  lifetimes:{
    attached:function(){
      
    }
  }
})
