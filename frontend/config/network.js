var url = 'http://localhost:8080/';

module.exports = {
  GetCourseById(id, successFunction) {
    wx.request({
      url: url + 'GetCourseById',
      method: 'GET',
      data: {
        "id": id
      },
      success: successFunction
    })
  },

  GetCoursesByCatagory(catagory, successFunction) {
    wx.request({
      url: url + 'GetCoursesByCatagory',
      method: 'POST',
      data: {
        "catagory": catagory
      },
      success: successFunction
    })
  },

  InsertCourseByName(Data, successFunction) {
    wx.request({
      url: url + 'InsertCourseByName',
      method: 'POST',
      data: Data,
      success: successFunction
    })
  },

  UpdateCourseByName(Data, successFunction) {
    wx.request({
      url: url + 'UpdateCourseByName',
      method: 'POST',
      data: Data,
      success: successFunction
    })
  }
}