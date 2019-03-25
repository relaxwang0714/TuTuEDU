// pages/mycollect/mycollect.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    mainData: [
      { mainIndex: 0, mainTitle: "全部" },
      { mainIndex: 1, mainTitle: "老师" },
      { mainIndex: 2, mainTitle: "学生" }
    ],
    MainPopular: [
      { popular_id: 0, popular_pic: '../../images/mainPic/5.png', popular_name: '小黑老师', popular_number: '12万' }],
    currentTab: 0
  },
  mainBarChoose: function (e) {
    console.log("e的值", e)
    var currentTab = e.currentTarget.dataset.maincurrent;
    this.setData({
      currentTab: currentTab,
    });
  },
  totalk: function (e) {
    console.log(e);
    var list_id = e.currentTarget.dataset.id;
    var list_content = JSON.stringify(this.data.My_talk[list_id]);

    wx.navigateTo({
      url: '../talk/talk?list=' + list_content,
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