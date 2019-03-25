// pages/schedule2/schedule2.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    mainData:[
      { mainIndex: 0, mainTitle: "热门" },
      { mainIndex: 1, mainTitle: "新书" },
      { mainIndex: 2, mainTitle: "热评" },
      { mainIndex: 3, mainTitle: "畅销" },
      { mainIndex: 4, mainTitle: "免费" }
    ],
    navData: [
      { navIndex: 0, navTitle: "全部" },
      { navIndex: 1, navTitle: "经管/励志" },
      { navIndex: 2, navTitle: "人文社科" },
      { navIndex: 3, navTitle: "生活" },
      { navIndex: 4, navTitle: "科技" },
      { navIndex: 5, navTitle: "期刊" }
    ],
    MainBook: [
      { book_id: 0, bookUrl:'../book/book', book_pic: '../../images/mainPic/4.png', book_name: '海风中失落的血色馈赠', book_author: '[加拿大]阿利斯泰尔.麦克劳德', book_star: 5, book_grade: '4.9', book_content: '因为我们知道，那些深埋到眼泪都融发不了的情感，并不是只有能说会道的人才有。' },
      {
        book_id: 1, book_pic: 'http://192.168.43.29:8812/img/book1.png', book_name: '今天将会不一样', book_author: '[美]玛利亚・森普尔', book_star: 5, book_grade: '4.6', book_content: '我是一个好妈妈，我有一段美满的婚姻，过去都是过去的事情了。但是今天，谎言爆炸了，一切都会不一样！' },
      { book_id: 2, book_pic: 'http://192.168.43.29:8812/img/book3.png', book_name: '薛兆丰经济学讲义', book_author: '[中]薛兆丰', book_star: 4, book_grade: '4.2', book_content: '我们每天收到无数纷繁复杂的信息，看到各种光怪陆离的现象，世界是复杂的。' },
      {
        book_id: 3, book_pic: 'http://192.168.43.29:8812/img/book2.png', book_name: '经济学原理', book_author: '[美]曼昆', book_star: 5, book_grade: '4.8', book_content: '从而对这个由海量陌生人连接而成的社会做出恰如其分的反应。' },
        {
          book_id: 4, book_pic: 'http://192.168.43.29:8812/img/book4.png', book_name: '房思琪的初恋乐园', book_author: '[中]林奕含', book_star: 5, book_grade: '4.9', book_content: '妈妈非常生气，叫她去罚站。房思琪说愿陪她罚。刘妈妈口气软下来。'
      },
      {
        book_id: 5, book_pic: 'http://192.168.43.29:8812/img/book5.png', book_name: '失踪的孩子', book_author: '〔意〕埃莱娜·费兰特', book_star: 5, book_grade: '4.9', book_content: '在那个艰难的时刻，她表现出要陪在我身旁，支持我，但我始终无法忘记她对我的鄙夷。'
      },
       {
         book_id: 6, book_pic: 'http://192.168.43.29:8812/img/book6.png', book_name: '聪明的投资者', book_author: '〔美〕本杰明·格雷厄姆', book_star: 5, book_grade: '4.7', book_content: '股神巴菲特特为本书撰写的序言和评论是这个版本的又一个亮点。'
      },
       {
         book_id: 7, book_pic: 'http://192.168.43.29:8812/img/book7.png', book_name: '穷查理宝典', book_author: '〔美〕彼得·考夫曼', book_star: 4, book_grade: '4.3', book_content: '贯穿全书的是芒格展示出来的聪慧、机智，其令人敬服的价值观和深不可测的修辞天赋。'
      }
    ],
    Book: [
      { book_id: 0, book_pic: 'http://192.168.43.29:8812/img/book3.png', book_name: '薛兆丰经济学讲义', book_author: '薛兆丰', book_star: 4, book_grade: '4.2', book_content: '我们每天收到无数纷繁复杂的信息，看到各种光怪陆离的现象，世界是复杂的。' },
      {
        book_id: 1, book_pic: 'http://192.168.43.29:8812/img/book2.png', book_name: '经济学原理', book_author: '[美]曼昆', book_star: 5, book_grade: '4.8', book_content: '从而对这个由海量陌生人连接而成的社会做出恰如其分的反应。'
      },
       {
         book_id: 2, book_pic: 'http://192.168.43.29:8812/img/book6.png', book_name: '聪明的投资者', book_author: '〔美〕本杰明·格雷厄姆', book_star: 5, book_grade: '4.7', book_content: '股神巴菲特特为本书撰写的序言和评论是这个版本的又一个亮点。'
      },
      {
        book_id: 3, book_pic: 'http://192.168.43.29:8812/img/book7.png', book_name: '穷查理宝典', book_author: '〔美〕彼得·考夫曼', book_star: 4, book_grade: '4.3', book_content: '贯穿全书的是芒格展示出来的聪慧、机智，其令人敬服的价值观和深不可测的修辞天赋。'
      }
          ],
    currentTab:0,
    current_tab:0
  },
  mainBarChoose:function(e){
    console.log("e的值",e)
    var currentTab = e.currentTarget.dataset.maincurrent;
    this.setData({
      currentTab:currentTab,
      current_tab:0
    });
  },
  navBarChoose: function (e) {
    console.log("e的值", e)
    var current_tab = e.currentTarget.dataset.navcurrent;
    this.setData({
      current_tab: current_tab
    });
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