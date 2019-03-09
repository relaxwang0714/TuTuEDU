// pages/calendar/calendar.js
var util = require('../../utils/util.js');
Page({

  /**
   * 页面的初始数据
   */
  data: {
    weekArr:['日','一','二','三','四','五','六'],
    weekDay:[],
    firstDay:null,
    NowMon:null,
    NowDay:null
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
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    //获取日历日期
    var DATE = util.formatDate(new Date());
    let date = util.getDates(7, DATE);
    console.log(date);

    var str = DATE;
    var Dates = str.split("-");
    var year = parseInt(Dates[0]);
    var month = parseInt(Dates[1]);
    var day = parseInt(Dates[2]);

    var weekDay = [];

 
    for (var i = day; i < day + 7; i++) {
      weekDay.push(i);
    }
    this.setData({
      date: DATE,
      NowMon: month,
      NowDay: day,
      weekDay: weekDay
    })   
    
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {
  
  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {
  
  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {
  
  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {
  
  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {
  
  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {
  
  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {
  
  }
})