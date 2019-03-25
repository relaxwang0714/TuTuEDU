Page({
  data: {
    listData: [
      { "course": "计算机网络", "types": "必修", "xuefen": "3.0","sorce":"78","jidian":"3.3" },
      { "course": "计算机组成原理", "types": "必修", "xuefen": "3.0", "sorce": "90", "jidian": "4.5"},
      { "course": "马克思主义基本原理", "types": "必修", "xuefen": "2.0", "sorce": "87", "jidian": "4.2" },
      { "course": "软件工程", "types": "必修", "xuefen": "2.0", "sorce": "89", "jidian": "4.4"},
      { "course": "形式与政策", "types": "必修", "xuefen": "0.5", "sorce": "92", "jidian": "4.7"},
      { "course": "就业指导I", "types": "课外必修", "xuefen": "1.0", "sorce": "90", "jidian": "4.5" },
      { "course": "创新创业实践I", "types": "必修", "xuefen": "2.0", "sorce": "良好", "jidian": "4.0" }
    ]
  },
  onLoad: function () {
    console.log('onLoad')
  }
})