// pages/courseDetail/courseDetail.js
const app = getApp()

Page({

  /**
   * 页面的初始数据
   */
  data: {
    StatusBar: app.globalData.StatusBar,
    CustomBar: app.globalData.CustomBar,
    Custom: app.globalData.Custom,

    course: {
      id: 0,
      name: '《红楼梦》',
      tutor: '苗怀明',
      pic: 'http://study.nju.edu.cn/repositry/coursepic/i/1702/17/934e4435b089456396ace1420be51f1e.jpg ',
    },
    courseDetail: {
      name: '《红楼梦》',
      sort: '悦读经典',
      introduction: '  曹雪芹，是中国文学史上最伟大也是最复杂的作家，《红楼梦》也是中国文学史上最伟大而又最复杂的作品。《红楼梦》的语言艺术成就，更代表了我国古典小说语言艺术的高峰。作者往往只需用三言两语，就可以勾画出一个活生生的具有鲜明的个性特征的形象；作者笔下每一个典型形象的语言，都具有自己独特的个性，从而使读者仅仅凭借这些语言就可以判别人物。作者的叙述语言，也具有高度的艺术表现力，包括小说里的诗词曲赋，不仅能与小说的叙事融成一体，而且这些诗词的创作也能为塑造典型性格服务，做到了“诗如其人”。由于以上各方面的卓越的成就，因而使《红楼梦》无论是在思想内容上或是艺术技巧上都具有自己崭新的面貌，具有永久的艺术魅力，使它足以卓立于世界文学之林而毫无逊色。',
      outline: "1、《红楼梦》的作者\n" +
        "2、《红楼梦》的成书\n" +
        "4、《红楼梦》的思想\n" +
        "5、《红楼梦》的人物\n" +
        "6、《红楼梦》的叙事\n" +
        "7、《红楼梦》的续书\n" +
        "8、《红楼梦》的评点\n" +
        "9、《红楼梦》的传播\n" +
        "10、《红楼梦》的研究\n",
      rate: '1',
      goal: '  通过本课程的学习，对《红楼梦》有较为全面、深入的了解，领略这部名著的才情之美、语言之美。',
      require: '1、认真阅读作品及相关著作。\n' +
        '2、按时完成老师布置的作业。',
      test: '平时考察与期末考试相结合。',
      textbook: '1、《话说红楼梦》，苗怀明著，江苏人民出版社2012年版。\n' +
        '2、《红楼梦二十讲》，苗怀明选编，华夏出版社2009年版。\n' +
        '3、《风起红楼》，苗怀明著，中华书局2006年版。',

    },
    courseComment: [{
        firstName: '学',
        name: '学生A',
        content: '每周一篇读书笔记，互评，期末闭卷考试，2次线下，老师讲课很有趣。给分90+。',
        time: '2019年3月4日'
      },
      {
        firstName: '学',
        name: '学生B',
        content: '平时线上做做题目，一次线下活动，期末1200—2000与书有关的小论文！',
        time: '2018年12月4日'
      },
      {
        firstName: '学',
        name: '学生C',
        content: '有三次线下讨论只要去一次就好。老师讲得相当不错。考核方式可以选择做报告或交论文。我选了后者，90。',
        time: '2017年7月4日'
      },
      {
        firstName: '学',
        name: '学生D',
        content: '平时啥事没有，线下不签到，期末1200-1500，大家基本都88分。',
        time: '2017年3月4日'
      },
    ],
  },
  getFirstName: function(str) {
    return str.subString(0, 2);
  },

  toCourseContent: function(e) {
    let str = JSON.stringify(e.currentTarget.dataset.index);
    wx.navigateTo({
      url: '../courseContent/courseContent?courseContent=' + str,
    })
  },


  /**
   * 生命周期函数--监听页面加载
   */


  onLoad: function(options) {
    let item = JSON.parse(options.course);
    this.setData({
      course: item,
    });
    //this.getData(options.id);
  },


  /**
   * 获取课程详情信息
   */
  /*
  getData: function(product_id) { //定义函数名称
    var that = this;
    wx.request({
      url: url, //请求地址
      header: { //请求头
        "Content-Type": ""
      },
      method: "GET", //get为默认方法/POST
      success: function(res) {
        that.setData({
          data: res.data
        }, )
      },
    })
  },
  */

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function() {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function() {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function() {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function() {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function() {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function() {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function() {

  }
})
