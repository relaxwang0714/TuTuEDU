// pages/calendar/calendar.js
var util = require('../../utils/util.js');
var weekArr =  ['日', '一', '二', '三', '四', '五', '六'];
var weekDay = [];
var flag = "";
Page({
  /**
   * 页面的初始数据
   */
  data: {
    weekArr:['日','一','二','三','四','五','六'],
    weekDay:[],
    firstDay:null,
    NowMon:null,
    NowDay:null,
    num:1920,
    ka:false,
    Flag: '每天早起读英语十分钟',
    isFlag:false
  },
  bindDateChange(e) {
    console.log('picker发送选择改变，携带值为', e.detail.value)
    var str = e.detail.value;
    var Dates = str.split("-");
    var month = parseInt(Dates[1]);
    var day = parseInt(Dates[2]);
    var weekDay = [];
    console.log('picker发送选择改变，携带值为', month)    
    for(var i=day;i<day+7;i++){
      weekDay.push(i);
    }
    this.setData({
      date: e.detail.value,
      NowMon:month,
      NowDay:day,
      weekDay:weekDay
    })
    console.log('month携带值为', weekDay)
  },
  choose:function(e){
    console.log('choose_e携带值为', e)
    var j = parseInt(e.currentTarget.dataset.id);
    console.log('choose_j携带值为', j)
    this.setData({
      j:j
    })   
  },
  ka:function(){
    this.setData({
      ka:true,
      num:this.data.num+1
    })
  },
  startLearn: function () {
      wx.navigateTo({
        url: '../onlinevedio/onlinevedio?isJoin=false',
      })
    },
  modifyFlag:function(){
    this.setData({
      isFlag:true
    })
  },
  ModifyInputEvent: function (e) {
    console.log("Input:", e)
    flag = e.detail.value
    this.setData({
      Flag: flag
    }) 
  },
  ModifySure:function(e){
    console.log("Flag:",e)
    this.setData({
      Flag:flag,
      isFlag:false
    })
  },
  ModifyCancle:function(){
    this.setData({
      isFlag: false
    })
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    //获取日历日期
    var DATE = util.formatDate(new Date());
    let date = util.getDates(7,DATE );
    console.log(date);

    var month = parseInt(date[0].month);
    var dayFormate = parseInt(date[0].dayFormate);
    var week = date[0].week;
    console.log("dayFormate:",dayFormate);
    var j;
    for(j = 0; j < 7; j++){
      if (week == weekArr[j]){
        console.log("weekArr:", weekArr[j]);
        this.setData({
          j:j
        })   
        break;
      }
    }
    console.log("j:", j); 
    console.log("dayformate:", dayFormate);
    j = this.data.j+1;     
    for (var i = dayFormate; ;i--) {
      j-=1
      weekDay.push(i);      
      if(j==0){
        break;
      }
    }
    weekDay.reverse();
    j = this.data.j+1
    for (var i = dayFormate + 1;; i++) {
      if(j==7){
        break
      }
      j += 1
      weekDay.push(i);
    }
    console.log(weekDay);
    this.setData({
      date: DATE,
      NowMon: month,
      NowDay: dayFormate,
      weekDay: weekDay
    })   
    
  },
})