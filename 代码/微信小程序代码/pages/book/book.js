// pages/book/book.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    MainBook: [
      { book_id: 0, book_pic: '../../images/mainPic/4.png', book_name: '海风中失落的血色馈赠', book_author: '[加拿大]阿利斯泰尔.麦克劳德', book_star: 5, book_grade: '4.9', book_content: '因为我们知道，那些深埋到眼泪都融发不了的情感，并不是只有能说会道的人才有。', isShoucang: false}
    ], 
    navDatas: [
      { DataId: 0, navData: '简介' }, { DataId: 1, navData: '目录' },
      { DataId: 3, navData: '评论（54)' }

    ],
    isJoin: true,
    currentTab: 0,
  },
  navbarTap: function (e) {
    console.log('picker发送选择改变，携带值为', e)
    this.setData({
      currentTab: e.currentTarget.dataset.current
    })
  },
  getclass1: function () {
    console.log('123');
    wx.navigateTo({
      url: '../class01/class01'
    })
  },
  collect:function(){
    this.data.MainBook[0].isShoucang = true;
    this.setData({
      MainBook: this.data.MainBook
    })
    wx.showToast({
      title: '收藏成功',
      icon: 'success',
      duration: 2000,
    })
  },
  join_course: function () {
    this.setData({
      isJoin: false
    })
    wx.showToast({
      title: '加入成功',
      icon: 'success',
      duration: 3000
    })
  },
  bookpage:function(){
    wx.navigateTo({
      url: '../bookpage/bookpage'
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