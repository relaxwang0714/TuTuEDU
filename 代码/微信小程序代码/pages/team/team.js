// pages/team/team.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    My_talk: [
      {
        talk_id: 0, talkUrl:"../talk/talk", title: '不亚于陀思妥耶夫斯基的数学', content: ' 宫崎学长预约巴黎93省Bobigny长居3个月以后，终于来到了警察局的27号窗口前，整个流程在1分钟内结束，像是他从日超买好了食材，花了3个小时准备丰盛的料理，然后一个人5分钟内吃完了便当，看着灶台上没有成就感的尖头筷子。\n 93省是巴黎郊区的移民大省，难民，黑户，按照萨科齐的说法：社会渣滓，让这里成了恐袭和骚乱的代名词。尽管预约时间是当天早上十点，宫崎依然等到下午四点才挪到窗口前，这期间他百无聊赖地看着大屏幕上滚动的传唤数字，警局改造后如何高效便捷的好评，撩开胸脯给孩子喂奶的撒哈拉以南，捧着可兰经不知道嘀咕什么的撒哈拉以北。\n 六个小时后，他贴着玻璃对着像在坐监的工作人员，听口音像是外省来的法国中年妇女喊话，递材料那一刻，他不知道谁的手里瘫痪着谁的自由。“想干的事还多得很，不想死。不过，肯定不行了！明天早晨就没命喽！这回可是运算错误。” \n 据说这是冈洁的遗言。我不知道冈洁是怎样的人，但他看起来真真像个白痴，高中时因为想看看不刷牙有什么后果，索性整个三年都没刷过牙。福楼拜能写出《庸见词典》在于相比那些“半吊子的白痴”，他是真真“家庭的白痴”。世上真真有梅什金公爵这样的人吗？读者一度以为他是个基督式的人物，无条件地娶纳斯塔霞为妻，直到他领悟到基督的爱对这个世界也毫无作用。', answer: 499, time: 1 },
      { talk_id: 1, title: '来讨论阴影面积的解决方法', content: '不是30°呀 直角边4斜边8 才是30度 他这个是另外一条直角边8哎', pic: '../../images/mainPic/Pic1.png', answer: 499, time: 5 },
      { talk_id: 2, title: '来讨论阴影面积的解决方法', content: '不是30°呀 直角边4斜边8 才是30度 他这个是另外一条直角边8哎',answer: 499, time: 6 },
      { talk_id: 3, title: '来讨论阴影面积的解决方法', content: '不是30°呀 直角边4斜边8 才是30度 他这个是另外一条直角边8哎', pic: '../../images/mainPic/Pic2.png', answer: 499, time: 7 }, 
      { talk_id: 4, title: '来讨论阴影面积的解决方法', content: '不是30°呀 直角边4斜边8 才是30度 他这个是另外一条直角边8哎', pic: '../../images/mainPic/Pic3.png', answer: 499, time: 10 }
    ],
  },
  totalk:function(e){
    console.log(e);
    var list_id = e.currentTarget.dataset.id;
    var list_content = JSON.stringify(this.data.My_talk[list_id]);
    
    wx.navigateTo({
      url: '../talk/talk?list='+list_content,
    })
  },
  edit:function(){
    wx.navigateTo({
      url: '../edit/edit',
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