package nju.hackathon.njucourseevaluation.bl.serviceimpl;

import nju.hackathon.njucourseevaluation.bl.parameter.course.GetCoursesByCatagoryParameter;
import nju.hackathon.njucourseevaluation.bl.parameter.course.InsertCourseByNameParameter;
import nju.hackathon.njucourseevaluation.bl.parameter.course.UpdateCourseByNameParameter;
import nju.hackathon.njucourseevaluation.bl.response.course.GetCourseByIdResponse;
import nju.hackathon.njucourseevaluation.bl.response.course.GetCoursesByCatagoryResponse;
import nju.hackathon.njucourseevaluation.bl.response.course.InsertCourseByNameResponse;
import nju.hackathon.njucourseevaluation.bl.response.course.UpdateCourseByNameResponse;
import nju.hackathon.njucourseevaluation.bl.serviceinterface.CourseblService;
import nju.hackathon.njucourseevaluation.bl.serviceinterface.StudentblService;
import nju.hackathon.njucourseevaluation.dataaccess.serviceinterface.CourseDataAcessService;
import nju.hackathon.njucourseevaluation.dataaccess.serviceinterface.StudentDataAccessService;
import nju.hackathon.njucourseevaluation.entity.Course;
import nju.hackathon.njucourseevaluation.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseblServiceImpl implements CourseblService {
    private final CourseDataAcessService courseDataAcessService;
    @Autowired(required = false)
    public CourseblServiceImpl(CourseDataAcessService courseDataAcessService){
        this.courseDataAcessService = courseDataAcessService;
    }

    @Override
    public GetCourseByIdResponse GetCourseByIdResponse(Integer id) {
        Course objRes = courseDataAcessService.GetCourseById(id);
        return new GetCourseByIdResponse(objRes);
    }

    @Override
    public GetCoursesByCatagoryResponse GetCoursesByCatagoryResponse(GetCoursesByCatagoryParameter parm) {
        List<Course> courseList = courseDataAcessService.GetCoursesByCatagory(parm.getCatagory());
        return new GetCoursesByCatagoryResponse(courseList);
    }

    @Override
    public InsertCourseByNameResponse InsertCourseByNameResponse(InsertCourseByNameParameter parm) {
        Course course = courseDataAcessService.InsertCourse(parm.getId(), parm.getCourse_id(), parm.getCourseName(), parm.getCategory(), parm.getRate(), parm.getCommentList(),
                parm.getDescription());
        return new InsertCourseByNameResponse(course);
    }

    @Override
    public UpdateCourseByNameResponse UpdateCourseByNameResponse(UpdateCourseByNameParameter parm) {
        Course course = courseDataAcessService.UpdateCourseByName(parm.getId(), parm.getCourse_id(), parm.getCourseName(), parm.getCategory(), parm.getRate(), parm.getCommentList(),
                parm.getDescription());
        return new UpdateCourseByNameResponse(course.getCourseName());
    }
}
