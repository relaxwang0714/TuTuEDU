// pages/logs/logs.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    navDatas: [
      { DataId: 0, navData: '智能推荐' }, { DataId: 1, navData: '我的关注' }
    ],
    Group: [
      { group_id: 0, photo: '../../images/mainPic/8.png', name: '数学自由小组', type: '加入的小组', title: '来讨论阴影面积的解决方法', content: '不是30°呀 直角边4斜边8 才是30度 他这个是另外一条直角边8哎',pic:'../../images/mainPic/Pic1.png',answer:499,time:5 },
      { group_id: 1, photo: '../../images/mainPic/9.png', name: '电影鉴赏组', type: '基于“英语电影”推荐', title: '《人工智能》观后感', content: '朗朗是人类创造出来的 人却无法爱他最费力的成长留在树上的只有壳，最狰狞的伤口留在皮肤的只有伤疤。最动人的烟火在空中看...', pic: '../../images/mainPic/Pic2.png', answer: 499, time: 6 },
      { group_id: 2, photo: '../../images/mainPic/10.png', name: '考研必上岸组', type: '热门小组', title: '考研狗的日常', content: '明明是人类创造出来的 人却无法爱他最费力的成长留在树上的只有壳，最狰狞的伤口留在皮肤的只有伤疤。最动人的烟火在空中看...', pic: '../../images/mainPic/Pic3.png', answer: 499, time: 5 }
    ],
    currentTab: 0,
    navScrollLeft: 0
  },
  navbarTap: function (e) {
    console.log('picker发送选择改变，携带值为', e)
    this.setData({
      currentTab: e.currentTarget.dataset.current
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