// pages/mycourse/mycourse.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    mainData: [
      { mainIndex: 0, mainTitle: "全部" },
      { mainIndex: 1, mainTitle: "课程" },
      { mainIndex: 2, mainTitle: "活动" },
    ],
    MainCourse: [
      { course_id: 0, pic: '../../images/mainPic/1.png', name: '计算机二级Office高级应用之文字处理专题', teacher: '小黑课堂小黑老师' },
    ],
    boxContent: [
      { id: 0, pic: '../../images/mainPic/pic1602.png', title: '周末咖啡馆自律学习小组活动', time: '常年周末13:00-17:00', place: '好好读书大学东区咖啡馆', start: '好好读书Cafe', number: 130 }
    ],
    currentTab: 0
  },
  btnclick: function () {
    wx.navigateTo({
      url: '../onlinevedio/onlinevedio?isJoin=false'
    })
  },
  mainBarChoose: function (e) {
    console.log("e的值", e)
    var currentTab = e.currentTarget.dataset.maincurrent;
    this.setData({
      currentTab: currentTab,
    });
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {

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