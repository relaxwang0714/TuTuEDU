// pages/main/main.js

Page({
  /**
   * 页面的初始数据
   */
  data: {
    UserName: '夏同学',
    intro:'好好读书大学',
    list:3,
    MainCourse: [
      { course_id: 0, pic: '../../images/mainPic/1.png', name: '计算机二级Office高级应用之文字处理专题', teacher: '小黑课堂小黑老师', star: 5, grade: '4.9' },
      { course_id: 1, pic: '../../images/mainPic/2.png', name: '跟学Excel视频教程-Excel实战1800分钟', teacher: 'ExcelPPT王佩丰', star: 5, grade: '4.9' },
      { course_id: 2, pic: '../../images/mainPic/3.png', name: '跟学Excel视频教程-Excel实战1800分钟', teacher: 'ExcelPPT王佩丰', star: 5, grade: '4.9' }
    ],
    MainBook: [
      { book_id: 0, book_pic: '../../images/mainPic/4.png', book_name: '海风中失落的血色馈赠', book_author: '[加拿大]阿利斯泰尔.麦克劳德', book_star: 5, book_grade: '4.9', book_content: '因为我们知道，那些深埋到眼泪都融发不了的情感，并不是只有能说会道的人才有。' }
    ],
    MainListen: [
      { listen_id: 0, pic: '../../images/mainPic/7.png', name: '听电影原声学英式英语发音', teacher: 'Ian studio', star: 5, grade: '4.9' }
    ],
    MainPopular: [
      { popular_id: 0, popular_pic: '../../images/mainPic/5.png', popular_name: '小黑老师', popular_number: 9890 },
      { popular_id: 1, popular_pic: '../../images/mainPic/6.png', popular_name: '陈萨v', popular_number: 4490 }
    ]
  },
  evaluate: function () {
    console.log("evaluate"),
      wx.navigateTo({
        url: '../evaluate/evaluate'
      })
  }, 
  classrooms: function () {
    console.log("evaluate"),
      wx.navigateTo({
        url: '../myclassroom/myclassroom'
      })
  },
  grade: function () {
    console.log("evaluate"),
      wx.navigateTo({
        url: '../myschedule/myschedule'
      })
  },
  test: function () {
    console.log("evaluate"),
      wx.navigateTo({
        url: '../mytest/mytest'
      })
  },
  course: function () {
    console.log("evaluate"),
      wx.navigateTo({
        url: '../mycourse/mycourse'
      })
  },
  fabu: function () {
      wx.navigateTo({
        url: '../myfabu/myfabu'
      })
  },
  collect: function () {
    console.log("evaluate"),
      wx.navigateTo({
        url: '../mycollect/mycollect'
      })
  },
  attention: function () {
    console.log("evaluate"),
      wx.navigateTo({
        url: '../myattention/myattention'
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