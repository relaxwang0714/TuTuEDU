// pages/ucDetail/ucDetail.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    choose_page:0,
    isStatus:true
  },
  choose1:function(){
    this.setData({
      choose_page:0
    })
  },
  choose2:function(){
    this.setData({
      choose_page: 1
    })
  },
  join:function(){
    var number = this.data.activityList.number+1
    this.data.activityList.number = number
    this.setData({
      isStatus:false,
      activityList:this.data.activityList
    })
    var activityList = JSON.stringify(activityList);
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var list = JSON.parse(options.activityList)
    console.log(list)
    this.setData({
      activityList:list
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