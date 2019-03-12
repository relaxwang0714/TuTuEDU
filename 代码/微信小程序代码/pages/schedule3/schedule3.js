// pages/schedule2/schedule2.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    mainData: [
      { mainIndex: 0, mainTitle: "热门" },
      { mainIndex: 1, mainTitle: "新书" },
      { mainIndex: 2, mainTitle: "热评" },
      { mainIndex: 3, mainTitle: "畅销" },
      { mainIndex: 4, mainTitle: "免费" }
    ],
    navData: [
      { navIndex: 0, navTitle: "全部" },
      { navIndex: 1, navTitle: "经管/励志" },
      { navIndex: 2, navTitle: "人文社科" },
      { navIndex: 3, navTitle: "生活" },
      { navIndex: 4, navTitle: "科技" },
      { navIndex: 5, navTitle: "期刊" }
    ],
    MainListen: [
      { listen_id: 0, pic: '../../images/mainPic/7.png', name: '听电影原声学英式英语发音', teacher: 'Ian studio', star: 5, grade: '4.9' },
      { listen_id: 1, pic: '../../images/mainPic/pic.png', name: '早安英语-早起学习计划正在进行中ing', teacher: '早安英语', star: 5, grade: '4.9' },
      { listen_id: 2, pic: '../../images/mainPic/pic14252.png', name: '【有声读物】追风筝的人', teacher: 'wa wa ya ya', star: 5, grade: '4.9' },
      { listen_id: 3, pic: '../../images/mainPic/pic141252.png', name: '乔布斯的故事', teacher: '令狐睿', star: 5, grade: '4.8' }
    ],
    Listen: [
      { listen_id: 0, pic: '../../images/mainPic/7.png', name: '听电影英语发音', teacher: 'Ian studio', star: 5, grade: '4.9' }
    ],
    currentTab: 0,
    current_tab: 0
  },
  mainBarChoose: function (e) {
    console.log("e的值", e)
    var currentTab = e.currentTarget.dataset.maincurrent;
    this.setData({
      currentTab: currentTab,
      current_tab: 0
    });
  },
  navBarChoose: function (e) {
    console.log("e的值", e)
    var current_tab = e.currentTarget.dataset.navcurrent;
    this.setData({
      current_tab: current_tab
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