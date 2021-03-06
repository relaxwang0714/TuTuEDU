// pages/edit/edit.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    tempFilePaths:[],
    title:'',
    content:''
  },
  chooseImg:function(e){
    var that = this;
    wx.chooseImage({
      count:1,
      sizeType: ['original', 'compressed'],//可选择原图或压缩后的图片
      sourceType: ['album', 'camera'],//可选择开放访问相册、相机
      
      success: function(res) {
        wx:wx.showToast({
          title: '正在上传',
          icon: 'loading',
          duration: 1000,
          mask: true,
        })
        // const images = this.data.images.concat(res.tempFilePaths)
        // //限制最多只能留下三张照片
        // this.data.images = images.length <= 3 ? images : images.slice(0, 3)
        let tempFilePaths = res.tempFilePaths;
        var content = that.data.content;
        var title = that.data.title;
        wx.uploadFile({
          url: 'http://192.168.43.29:8812/group/topic/publish',
          filePath: tempFilePaths[0],
          name: 'file1',
          formData: {
            content: content,
            title: title,
            groupId: 1100001,
            userId: 11000001
          },
          success(res) {
            const data = res.data
            console.log("data:",data)
          }
        })
        that.setData({
          tempFilePaths:tempFilePaths
        })

      }
    })
  },
  titleInput:function(e){
    console.log("e:",e)
    this.setData({
      title:e.detail.value
    })
  },
  contentInput: function (e) {
    console.log("e:", e)
    this.setData({
      content:e.detail.value
    })
  },
  submit: function (e) {
    wx.showToast({
      title: '发表成功',
      icon: 'success',
      duration: 2000,
    })
    wx.navigateBack({
      delta: 1,
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