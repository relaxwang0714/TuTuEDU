// pages/evaluate_detail/evaluate_detail.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    evaluates: [
      {id: '1', evaluate: '很满意'},
      {id: '2', evaluate: '满意'},
      {id: '3', evaluate: '一般'},
      {id: '4', evaluate: '不满意'}
    ],
    isChoose: -1
  },
    // evaluates_box: [
    //   {
    //   mid:'0',
    //   title: '1对教学工作有热情，讲课认真、投入',
    //   evaluates: [
    //     {
    //       id: '0',
    //       evaluate: '很满意'
    //     },
    //     {
    //       id: '1',
    //       evaluate: '满意'
    //     },
    //     {
    //       id: '2',
    //       evaluate: '一般'
    //     },
    //     {
    //       id: '3',
    //       evaluate: '不满意'
    //     }
    //   ]
    // },
    //   {
    //     mid:'1',
    //     title: '2讲课思路清晰，阐述准确',
    //     evaluates: [{
    //       id: 0,
    //       evaluate: '很满意'
    //     },
    //     {
    //       id: '1',
    //       evaluate: '满意'
    //     },
    //     {
    //       id: '2',
    //       evaluate: '一般'
    //     },
    //     {
    //       id: '3',
    //       evaluate: '不满意'
    //     }
    //     ]
    //   },
    // ],
  // },
  choose1: function(e) {
    console.log(e)
    var str = e.currentTarget.dataset.currentchoose
    this.setData({
      isChoose: str
    })
    console.log(this.data.isChoose)
  },
  choose2: function (e) {
    console.log(e)
    var str = e.currentTarget.dataset.currentchoose
    this.setData({
      isChoose2: str
    })
    console.log(this.data.isChoose2)
  },
  choose3: function (e) {
    console.log(e)
    var str = e.currentTarget.dataset.currentchoose
    this.setData({
      isChoose3: str
    })
  },
  choose4: function (e) {
    console.log(e)
    var str = e.currentTarget.dataset.currentchoose
    this.setData({
      isChoose4: str
    })
  },
  choose5: function (e) {
    console.log(e)
    var str = e.currentTarget.dataset.currentchoose
    this.setData({
      isChoose5: str
    })
  },
  choose6: function (e) {
    console.log(e)
    var str = e.currentTarget.dataset.currentchoose
    this.setData({
      isChoose6: str
    })
  },
  choose7: function (e) {
    console.log(e)
    var str = e.currentTarget.dataset.currentchoose
    this.setData({
      isChoose7: str
    })
  },
  submit:function(){
    wx.showToast({
      title: '提交成功',
      icon: 'success',
      duration: 8000
    })
    setTimeout(function () {
      wx.navigateBack({
        delta: 3,
      })
    }, 2000)
  
  },
  // choose2: function(e) {
  //   console.log(e)
  //   this.setData({
  //     isChoose: e.currentTarget.dataset.currentchoose2
  //   })
  // },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function(options) {

  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function() {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function() {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function() {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function() {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function() {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function() {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function() {

  }
})