// pages/schedule/schedule.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    navDatas:[
      { DataId: 0, navData: '热门' }, { DataId: 1, navData: 'TED' }, { DataId: 2, navData: '世界名校' }, { DataId: 3, navData: '可汗学院' }, {DataId:4,navData:'计算机'}
    ],
    MainCourse: [
      { course_id: 0, pic: '../../images/mainPic/1.png', name: '计算机二级Office高级应用之文字处理专题', teacher: '小黑课堂小黑老师', star: 5, grade: '4.9' },
      { course_id: 1, pic: '../../images/mainPic/2.png', name: '跟学Excel视频教程-Excel实战1800分钟', teacher: 'ExcelPPT王佩丰', star: 5, grade: '4.9' },
      { course_id: 2, pic: '../../images/mainPic/3.png', name: '跟学Excel视频教程-Excel实战1800分钟', teacher: 'ExcelPPT王佩丰', star: 5, grade: '4.9' },
      { course_id: 3 , pic: '../../images/mainPic/3.png', name: '跟学Excel视频教程-Excel实战1800分钟', teacher: 'ExcelPPT王佩丰', star: 5, grade: '4.9' }
    ],
    currentTab: 0,
    navScrollLeft:0
  },
  navbarTap: function (e) {
    console.log('picker发送选择改变，携带值为', e)
    this.setData({
      currentTab: e.currentTarget.dataset.current
    })
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