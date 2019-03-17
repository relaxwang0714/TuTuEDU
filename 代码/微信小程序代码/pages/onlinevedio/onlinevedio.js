// pages/onlinevedio/onlinevedio.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    navDatas: [
      { DataId: 0, navData: '简介' }, { DataId: 1, navData: '目录' },
      { DataId: 3, navData: '评论（99)' }
      
    ],
    isJoin:true,
    currentTab: 0,
  },
  navbarTap: function (e) {
    console.log('picker发送选择改变，携带值为', e)
    this.setData({
      currentTab: e.currentTarget.dataset.current
    })
  },
  getclass1: function() {
    console.log('123');
    wx.navigateTo({
      url: '../class01/class01'
    })
  },
  join_course:function(){
    this.setData({
      isJoin:false
    })
    wx.showToast({
      title: '加入成功',
      icon: 'success',
      duration: 3000
    })
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    console.log(options)
    this.setData({
      isJoin:options.isJoin
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