// pages/classicsReading/classicsReading.js
const app = getApp()
Page({
  data: {
    readingCourseList: [{
        id: 0,
        type: '文学与艺术',
        course: [{
          id: 0,
          name: "《红楼梦》",
          tutor: "苗怀明",
          pic: "http://study.nju.edu.cn/repositry/coursepic/i/1702/17/934e4435b089456396ace1420be51f1e.jpg"
        }, {
          id: 1,
          name: "《唐诗选》",
          tutor: "莫砺锋",
          pic: "http://study.nju.edu.cn/repositry/coursepic/i/1609/13/e9fed1018ad04396a17ddbaf389cb478.jpg"
        }]
      },
      {
        id: 1,
        type: '历史与文明',
        course: [{
          id: 2,
          name: "《伯罗奔尼撒战争史》",
          tutor: "谭树林",
          pic: "http://study.nju.edu.cn/repositry/coursepic/i/1709/16/070cd5e28e0949178e7ad06ed5e4fc8c.jpg"
        }, {
          id: 3,
          name: "《史记》",
          tutor: "成祖明",
          pic: "http://study.nju.edu.cn/repositry/coursepic/i/1803/3/bcd0f7b766c24d4c832243cf3b8afba1.jpg",
        }]
      },
      {
        id: 2,
        type: '哲学与宗教',
        course: [{
          id: 4,
          name: "《科学革命的结构》",
          tutor: "戴建平",
          pic: "http://study.nju.edu.cn/repositry/coursepic/i/1509/16/bf6af38e1688478b931846cc1b00dc99.jpg"
        }, {
          id: 5,
          name: "《老子注译及评介》",
          tutor: "胡永辉",
          pic: "http://study.nju.edu.cn/repositry/coursepic/i/1709/16/69c4e1b9a5d842c8b7e6482ae79e9f27.jpg"
        }]
      },
      {
        id: 3,
        type: '经济与社会',
        course: [{
          id: 6,
          name: "《国家竞争优势》",
          tutor: "柴忠东",
          pic: "http://study.nju.edu.cn/repositry/coursepic/i/1902/28/5bb93b2227de45f7973a599293876624.jpg"
        }, {
          id: 7,
          name: "《经济发展理论》",
          tutor: "高波",
          pic: "http://study.nju.edu.cn/repositry/coursepic/i/1509/16/9272d847fa8f4367a219eaf7da36ff91.jpg"
        }]
      },
      {
        id: 4,
        type: '自然与生命',
        course: [{
          id: 8,
          name: "《中国自然地理纲要》",
          tutor: "马春梅",
          pic: "http://study.nju.edu.cn/repositry/coursepic/i/1803/5/29da0d5916ca48938edfc66e94672ea6.jpg"
        }, {
          id: 9,
          name: "《物种起源》",
          tutor: "王强",
          pic: "http://study.nju.edu.cn/repositry/coursepic/i/1510/8/41c310354cce4fc9b12277f5d65d6ae6.jpg"
        }]
      },
      {
        id: 5,
        type: '全球化与领导力',
        course: [{
          id: 10,
          name: "《个人与组织的未来》",
          tutor: "程德俊",
          pic: "http://study.nju.edu.cn/repositry/coursepic/i/1903/8/e0c430211a4c4214b230df8d23d6eb3b.jpg"
        }, {
          id: 11,
          name: "《孙子兵法译注》",
          tutor: "贾良定",
          pic: "http://study.nju.edu.cn/repositry/coursepic/i/1509/16/80cadfcc96f34c23862561a65d9f2b9c.jpg"
        }]
      }
    ],

    StatusBar: app.globalData.StatusBar,
    CustomBar: app.globalData.CustomBar,
    Custom: app.globalData.Custom,
    TabCur: 0,
    VerticalNavTop: 0
  },

  onLoad: function() {},

  toCourseDetail: function(e) {
    console.log(e);
    let str = JSON.stringify(e.currentTarget.dataset.index);
    console.log(str);
    wx.navigateTo({
      url: '../courseDetail/courseDetail?course='+str,
    })
  },


  tabSelect(e) {
    this.setData({
      TabCur: e.currentTarget.dataset.id,
      erticalNavTop: (e.currentTarget.dataset.id - 1) * 50
    })
  },
  VerticalMain(e) {
    console.log(e.detail);
  }
})