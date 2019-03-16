// pages/talk/talk.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    isShow:true,
    isZan:false,
    isCollect:false,
    comment:"",
    comments:[
      { pic: "../../images/mainPic/8.png", name: "卷个浪", comment:" 不过一道题算了一百遍也没有解出来，多少也有些让人沮丧啊。你现在做的论文是你最喜欢的法国作家吗？让我猜一猜，司汤达？",time:"3小时"},
      { pic: "../../images/mainPic/9.png", name: "皮皮", comment: "皮皮就很开心", time: "1分钟" }
    ],
    zan:2,
    collection:3
  },
  comment:function(){
    this.setData({
      isShow:false
    })
  },
  commentInput:function(e){
    console.log("input:",e)
    this.setData({
      comment:e.detail.value
    })
  },
  send: function (e) {
    var comments_new={
      pic: "../../images/mainPic/UserPic.png", 
      name: "Shawn", 
      comment: this.data.comment, 
      time: "1分钟"
    };
    var comments = this.data.comments.concat(comments_new);
    console.log("comments1:"+comments)
    this.setData({
      comments:comments,
      isShow: true
    })
    wx.showToast({
      title: '评论成功',
      icon: 'success',
      duration: 2000,
    })
  },
  zan:function(e){
    console.log(e)
    this.setData({
      zan: this.data.zan + 1,
      isZan:true
    })
  },
  collect: function () {
    this.setData({
      collection: this.data.collection + 1,
      isCollect:true
    })
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    console.log("options:",options)
    var list = JSON.parse(options.list);
    this.setData({
      article:list.content,
      title:list.title
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