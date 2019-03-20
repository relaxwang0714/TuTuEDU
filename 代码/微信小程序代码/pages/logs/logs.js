// pages/logs/logs.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    navDatas: [
      { DataId: 0, navData: '智能推荐' }, { DataId: 1, navData: '我的关注' },{DataId: 2,navData:'同校活动'}
    ],
    Group: [
      { group_id: 0,teamUrl:"../team/team", photo: '../../images/mainPic/8.png', name: '数学自由小组', types: '加入的小组',talkUrl:"../talk/talk", title: '来讨论阴影面积的解决方法', content: '不是30°呀 直角边4斜边8 才是30度 他这个是另外一条直角边8哎',pic:'../../images/mainPic/Pic1.png',answer:499,time:5 },
      { group_id: 1, photo: '../../images/mainPic/9.png', name: '电影鉴赏组', types: '基于“英语电影”推荐', title: '《人工智能》观后感', content: '朗朗是人类创造出来的 人却无法爱他最费力的成长留在树上的只有壳，最狰狞的伤口留在皮肤的只有伤疤。最动人的烟火在空中看...', pic: '../../images/mainPic/Pic2.png', answer: 499, time: 6 },
      { group_id: 2, photo: '../../images/mainPic/10.png', name: '考研必上岸组', types: '热门小组', title: '考研狗的日常', content: '明明是人类创造出来的 人却无法爱他最费力的成长留在树上的只有壳，最狰狞的伤口留在皮肤的只有伤疤。最动人的烟火在空中看...', pic: '../../images/mainPic/Pic3.png', answer: 499, time: 5 }
    ],
    My_team:[
      { team_id: 0, teamUrl: "../team/team", photo: '../../images/mainPic/8.png', name: '数学自由小组', num: 7492 },
      { team_id: 1, photo: '../../images/mainPic/8.png', name: '数学自由小组', num: 7492 },
      { team_id: 2, photo: '../../images/mainPic/8.png', name: '数学自由小组', num: 7492 }
    ],
    My_talk: [
      { talk_id: 0, talkUrl:"../talk/talk",title: '来讨论阴影面积的解决方法', content: '不是30°呀 直角边4斜边8 才是30度 他这个是另外一条直角边8哎', pic: '../../images/mainPic/Pic1.png', answer: 499, time: 5 },
      { talk_id: 1, title: '来讨论阴影面积的解决方法', content: '不是30°呀 直角边4斜边8 才是30度 他这个是另外一条直角边8哎', pic: '../../images/mainPic/Pic1.png', answer: 499, time: 5 }
    ],
    mainData: [{ mainIndex: 0, mainTitle: "全部" }, { mainIndex: 1, mainTitle: "学习" }, { mainIndex: 2, mainTitle: "聚会" }, { mainIndex: 3, mainTitle: "体育" }, { mainIndex: 4, mainTitle: "音乐" }, { mainIndex: 5, mainTitle: "旅行" }, { mainIndex: 6, mainTitle: "讲座"}],
    navData: [{ navIndex: 0, navTitle: "全部" }, { navIndex: 1, navTitle: "今天" }, { navIndex: 2, navTitle: "明天" }, { navIndex: 3, navTitle: "周末" }, { navIndex: 4, navTitle: "最近一周" }, { navIndex: 5, navTitle: "常年" }, { navIndex: 6, navTitle: "最新上架" }],
    boxContent: [
      { id:0, pic:'../../images/mainPic/pic1602.png', title: '周末咖啡馆自律学习小组活动', time: '常年周末13:00-17:00', place: '好好读书大学东区咖啡馆', start: '好好读书Cafe', number: 130 }, 
      { id: 1,pic: '../../images/mainPic/pic644.png',title: '除了读书，其他都不约', time: '常年', place: '好好读书大学自习室', start: '学习自管会', number: 345 },
      { id: 2,pic: '../../images/mainPic/pic1625.png',title: '2019A市展览会', time: '2月19日 9：00-17：00', place: 'A市国际会展中心', start: 'A市会展中心', number: 139 },
    ],
    toView:'red',
    currentTab: 0,
    maintab:0,
    navtab:0,
    scrollLeft: 100
  },
  navbarTap: function (e) {
    // console.log('picker发送选择改变，携带值为', e)
    this.setData({
      currentTab: e.currentTarget.dataset.current
    })
  },
  mainBarChoose:function(e){
    // console.log('picker发送选择改变，携带值为', e)
    var maincurrent = e.currentTarget.dataset.maincurrent;
    this.setData({
      maintab:maincurrent,
      navtab:0
    })
  },
  navBarChoose: function (e) {
    // console.log('picker发送选择改变，携带值为', e)
    var navcurrent = e.currentTarget.dataset.navcurrent;
    this.setData({
      navtab: navcurrent
    })
  },
  todetail:function(e){
    // console.log(e)
    var id = e.currentTarget.dataset.id;
    var activityList = JSON.stringify(this.data.boxContent[id])
    wx.navigateTo({
      url: '../ucDetail/ucDetail?activityList='+activityList
    })
  },
  edit: function () {
    wx.navigateTo({
      url: '../edit/edit',
    })
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
      console.log("options:",options)
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