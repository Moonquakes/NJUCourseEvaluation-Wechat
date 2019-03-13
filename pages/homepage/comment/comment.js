const app = getApp();
Page({
  data: {
    class0: true,
    class1: true,
    class2: true,
    class3: true,
    StatusBar: app.globalData.StatusBar,
    CustomBar: app.globalData.CustomBar,
    picker: ['大一上学期', '大一下学期', '大二上学期','大二下学期'],
    classes0:['离散数学','计基'],
    classes1: ['微积分Ⅱ', '软工Ⅰ'],
    classes2: ['计组', '数据结构'],
    classes3: ['计网', '软统'],
    TabCur: 0,
    scrollLeft: 0,
    star: 0,
    starMap: [
      '非常差',
      '差',
      '一般',
      '好',
      '非常好',
    ],
  },
  tabSelect(e) {
    console.log(e);
    this.setData({
      TabCur: e.currentTarget.dataset.id,
      scrollLeft: (e.currentTarget.dataset.id - 1) * 60
    })
  },
  PickerChange(e) {
    console.log(e);
    this.setData({
      index: e.detail.value
    })
    var index=e.detail.value;
    if(index==0){
      this.setData({
        class0: false,
        class1: true,
        class2: true,
        class3: true,
      })
    }else if(index==1){
      this.setData({
        class0: true,
        class1: false,
        class2: true,
        class3: true,
      })
    }else if(index==2){
      this.setData({
        class0: true,
        class1: true,
        class2: false,
        class3: true,
      })
    } else if (index == 3) {
      this.setData({
        class0: true,
        class1: true,
        class2: true,
        class3: false,
      })
    }
  },
  showModal(e) {
    this.setData({
      modalName: e.currentTarget.dataset.target
    })
  },
  hideModal(e) {
    this.setData({
      modalName: null
    })
  },
  myStarChoose(e) {
    let star = parseInt(e.target.dataset.star) || 0;
    this.setData({
      star: star,
    });
  },
  /**
   * 弹窗
   */
  showDialogBtn: function () {

    this.setData({
      showModal: true
    })
  },
  /**
   * 弹出框蒙层截断touchmove事件
   */
  preventTouchMove: function () {
  },
  /**
   * 隐藏模态对话框
   */
  hideModal: function () {
    this.setData({
      showModal: false
    });
  },
  /**
   * 对话框取消按钮点击事件
   */
  onCancel: function () {
    this.hideModal();
  },
  /**
   * 对话框确认按钮点击事件
   */
  onConfirm: function (e) {
    var pages = getCurrentPages();
    var currPage = pages[pages.length - 1];   //当前页面
    var prevPage = pages[pages.length - 2];  //上一个页面

    //直接调用上一个页面的setData()方法，把数据存到上一个页面中去
    prevPage.setData({
      disabled: true
    })
    wx.showToast({
      title: '提交成功',
      icon: 'success',
      duration: 2000
    })
    this.hideModal();
   
  },
})