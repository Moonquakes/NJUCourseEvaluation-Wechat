package nju.hackathon.njucourseevaluation.bl.serviceinterface;

import nju.hackathon.njucourseevaluation.bl.parameter.course.InsertCourseByNameParameter;
import nju.hackathon.njucourseevaluation.bl.parameter.course.UpdateCourseByNameParameter;
import nju.hackathon.njucourseevaluation.bl.response.course.GetCourseByIdResponse;
import nju.hackathon.njucourseevaluation.bl.response.course.GetCoursesByCatagoryResponse;
import nju.hackathon.njucourseevaluation.bl.response.course.InsertCourseByNameResponse;
import nju.hackathon.njucourseevaluation.bl.response.course.UpdateCourseByNameResponse;

public interface CourseblService {
    GetCourseByIdResponse GetCourseByIdResponse(Integer id);
    GetCoursesByCatagoryResponse GetCoursesByCatagoryResponse(int catagory);
    InsertCourseByNameResponse InsertCourseByNameResponse(InsertCourseByNameParameter parm);
    UpdateCourseByNameResponse UpdateCourseByNameResponse(UpdateCourseByNameParameter parm);
}
