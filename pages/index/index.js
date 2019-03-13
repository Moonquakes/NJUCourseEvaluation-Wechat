//index.js
//获取应用实例
const app = getApp()


Component({
  data: {
    elements: [{
      title: '研讨课',
      name: 'seminar',
      color: 'cyan',
      icon: 'newsfill'
    },
    {
      title: '通识课',
      name: 'generalCourse',
      color: 'blue',
      icon: 'colorlens'
    },
    {
      title: '公选课',
      name: 'publicCourse',
      color: 'purple',
      icon: 'font'
    },
    {
      title: '悦读经典',
      name: 'classicsReading',
      color: 'mauve',
      icon: 'icon'
    },
    {
      title: '体育',
      name: 'PECourse',
      color: 'pink',
      icon: 'btn'
    },
    {
      title: '通修课',
      name: 'RequiredCourse',
      color: 'brown',
      icon: 'tagfill'
    },
  ],
    StatusBar: app.globalData.StatusBar,
    CustomBar: app.globalData.CustomBar,
    userInfo: {},
    hasUserInfo: false,
    canIUse: wx.canIUse('button.open-type.getUserInfo')
  },
  //事件处理函数
  bindViewTap: function() {
    wx.navigateTo({
      url: '../logs/logs'
    })
  },
  searchCourse(e) {
    /*
    let key = e.detail.value.toLowerCase();
    let list = this.data.icon;
    for (let i = 0; i < list.length; i++) {
      let a = key;
      let b = list[i].name.toLowerCase();
      if (b.search(a) != -1) {
        list[i].isShow = true
      } else {
        list[i].isShow = false
      }
    }
    this.setData({
      icon: list
    })
    */
  }
  
})
