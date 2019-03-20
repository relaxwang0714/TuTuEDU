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
      { book_id: 1, book_pic: '../../images/mainPic/4.png', book_name: '海风中失落的血色馈赠', book_author: '[加拿大]阿利斯泰尔.麦克劳德', book_star: 5, book_grade: '4.9', book_content: '因为我们知道，那些深埋到眼泪都融发不了的情感，并不是只有能说会道的人才有。' },
      { book_id: 2, book_pic: '../../images/mainPic/4.png', book_name: '海风中失落的血色馈赠', book_author: '[加拿大]阿利斯泰尔.麦克劳德', book_star: 5, book_grade: '4.9', book_content: '因为我们知道，那些深埋到眼泪都融发不了的情感，并不是只有能说会道的人才有。' },
      { book_id: 3, book_pic: '../../images/mainPic/4.png', book_name: '海风中失落的血色馈赠', book_author: '[加拿大]阿利斯泰尔.麦克劳德', book_star: 5, book_grade: '4.9', book_content: '因为我们知道，那些深埋到眼泪都融发不了的情感，并不是只有能说会道的人才有。' }
    ],
    Book: [
      { book_id: 0, book_pic: '../../images/mainPic/4.png', book_name: '失落的血色馈赠', book_author: '[加拿大]阿利斯泰尔.麦克劳德', book_star: 5, book_grade: '4.9', book_content: '因为我们知道，那些深埋到眼泪都融发不了的情感，并不是只有能说会道的人才有。' },
      { book_id: 1, book_pic: '../../images/mainPic/4.png', book_name: '海风中血色馈赠', book_author: '[加拿大]阿利斯泰尔.麦克劳德', book_star: 5, book_grade: '4.9', book_content: '因为我们知道，那些深埋到眼泪都融发不了的情感，并不是只有能说会道的人才有。' },
      { book_id: 2, book_pic: '../../images/mainPic/4.png', book_name: '海风中失落的血色', book_author: '[加拿大]阿利斯泰尔.麦克劳德', book_star: 5, book_grade: '4.9', book_content: '因为我们知道，到眼泪都融发不了的情感，并不是只有能说会道的人才有。' },
      { book_id: 3, book_pic: '../../images/mainPic/4.png', book_name: '海风中血色馈赠', book_author: '[加拿大]阿利斯泰尔.麦克劳德', book_star: 5, book_grade: '4.9', book_content: '因为我们知道，那些深埋到眼泪都融发不了的情感，并不是只有能说会道的人才有。' }
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