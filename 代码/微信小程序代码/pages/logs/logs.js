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
      { group_id: 0,teamUrl:"../team/team", photo: '../../images/mainPic/8.png', name: '数学自由小组', types: '加入的小组',talkUrl:"../talk/talk", title: '来讨论阴影面积的解决方法', content: '不是30°呀 直角边4斜边8 才是30度 他这个是另外一条直角边8哎',pic:'../../images/mainPic/Pic1.png',answer:49,time:5 },
      { group_id: 1, photo: '../../images/mainPic/9.png', name: '电影鉴赏组', types: '基于“英语电影”推荐', title: '《人工智能》观后感', content: '朗朗是人类创造出来的 人却无法爱他最费力的成长留在树上的只有壳，最狰狞的伤口留在皮肤的只有伤疤。最动人的烟火在空中看...', pic: '../../images/mainPic/Pic2.png', answer: 4, time: 6 },
      { group_id: 2, photo: '../../images/mainPic/10.png', name: '考研必上岸组', types: '热门小组', title: '考研狗的日常', content: '明明是人类创造出来的 人却无法爱他最费力的成长留在树上的只有壳，最狰狞的伤口留在皮肤的只有伤疤。最动人的烟火在空中看...', pic: '../../images/mainPic/Pic3.png', answer: 99, time: 5 }
    ],
    My_team:[
      { team_id: 0, teamUrl: "../team/team", photo: '../../images/mainPic/8.png', name: '数学自由小组', num: 8492 },
      { team_id: 1, photo: '../../images/mainPic/9.png', name: '艺术鉴赏小组', num: 7492 },
      { team_id: 2, photo: '../../images/mainPic/10.png', name: '金融小组', num: 7492 }
    ],
    My_talk: [
      {talk_id: 0, talkUrl: "../talk/talk", title: '不亚于陀思妥耶夫斯基的数学', content: ' 宫崎学长预约巴黎93省Bobigny长居3个月以后，终于来到了警察局的27号窗口前，整个流程在1分钟内结束，像是他从日超买好了食材，花了3个小时准备丰盛的料理，然后一个人5分钟内吃完了便当，看着灶台上没有成就感的尖头筷子。\n 93省是巴黎郊区的移民大省，难民，黑户，按照萨科齐的说法：社会渣滓，让这里成了恐袭和骚乱的代名词。尽管预约时间是当天早上十点，宫崎依然等到下午四点才挪到窗口前，这期间他百无聊赖地看着大屏幕上滚动的传唤数字，警局改造后如何高效便捷的好评，撩开胸脯给孩子喂奶的撒哈拉以南，捧着可兰经不知道嘀咕什么的撒哈拉以北。\n 六个小时后，他贴着玻璃对着像在坐监的工作人员，听口音像是外省来的法国中年妇女喊话，递材料那一刻，他不知道谁的手里瘫痪着谁的自由。“想干的事还多得很，不想死。不过，肯定不行了！明天早晨就没命喽！这回可是运算错误。” \n 据说这是冈洁的遗言。我不知道冈洁是怎样的人，但他看起来真真像个白痴，高中时因为想看看不刷牙有什么后果，索性整个三年都没刷过牙。福楼拜能写出《庸见词典》在于相比那些“半吊子的白痴”，他是真真“家庭的白痴”。世上真真有梅什金公爵这样的人吗？读者一度以为他是个基督式的人物，无条件地娶纳斯塔霞为妻，直到他领悟到基督的爱对这个世界也毫无作用。', answer: 2, time: '1分钟前' },
      { talk_id: 1, talkUrl:"../talk/talk",title: '来讨论阴影面积的解决方法', content: '不是30°呀 直角边4斜边8 才是30度 他这个是另外一条直角边8哎', pic: '../../images/mainPic/Pic1.png', answer: 49, time: '5分钟前' },
      {
        talk_id: 2, title: '美丽的空间几何雕塑', content: '德国艺术家Peter Dahmen将折纸与剪纸结合创作出美丽的空间几何雕塑', pic: 'http://192.168.43.29:8812/img/Pic14.png', answer: 23, time: '15分钟前' },
      {
        talk_id: 3, title: '求问这题怎么做？', content: '如图，求教！', pic: 'http://192.168.43.29:8812/img/Pic11.png', answer: 3, time: '19分钟前'
      }
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
  changeMyData: function (num) {
    this.data.boxContent[0].number = num
    console.log('this.data.boxContent', this.data.boxContent)
    this.setData({
      boxContent: this.data.boxContent
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