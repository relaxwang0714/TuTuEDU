// pages/class_answar/class_answar.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    answers:[
      { id: 0, answer: 'A.图片——格式——裁剪——CTRL+X——背景格式——自动填充' },
      { id: 1, answer: 'B.格式——图片边框——线条'},
      { id: 2, answer: 'C.图片——格式——裁剪——CTRL + X（剪切）——CTRL + X——自动填充'}
      ],
      isToast:false,
      isShowAnswer:false
  },
  choose_answer:function(e){
    console.log(e)
    this.setData({
      current_id:e.currentTarget.dataset.current_id
    })
  },
  answer_commit:function(){
    var that = this
    if(that.data.current_id==0){
      wx.showToast({
        title: '回答正确',
        icon: 'success',
        duration: 2000,
      })
      that.setData({
        isShowAnswer:true
      })
    }
    else{
      that.setData({
        isToast: true,
        isShowAnswer:true
      })
      setTimeout(function(){
        that.setData({
          isToast: false
        })
      },2000)
      
    }
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