package nju.hackathon.njucourseevaluation.controller;

import nju.hackathon.njucourseevaluation.bl.parameter.course.InsertCourseByNameParameter;
import nju.hackathon.njucourseevaluation.bl.parameter.course.UpdateCourseByNameParameter;
import nju.hackathon.njucourseevaluation.bl.response.course.GetCourseByIdResponse;
import nju.hackathon.njucourseevaluation.bl.response.course.GetCoursesByCatagoryResponse;
import nju.hackathon.njucourseevaluation.bl.response.course.InsertCourseByNameResponse;
import nju.hackathon.njucourseevaluation.bl.response.course.UpdateCourseByNameResponse;
import nju.hackathon.njucourseevaluation.bl.serviceinterface.CourseblService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CourseController {
    private CourseblService courseblService;

    @Autowired
    public CourseController(CourseblService courseblService){
        this.courseblService = courseblService;
    }

    @RequestMapping(value = "GetCourseById", method = RequestMethod.GET)
    public GetCourseByIdResponse getCourseByIdResponse(@RequestParam(name = "id", defaultValue = "0") int id){
        return courseblService.GetCourseByIdResponse(id);
    }

    @RequestMapping(value = "GetCoursesByCatagory", method = RequestMethod.POST)
    public GetCoursesByCatagoryResponse getCoursesByCatagoryResponse(@RequestParam(name = "catagory", defaultValue = "1") int catagory){
        return courseblService.GetCoursesByCatagoryResponse(catagory);
    }

    @RequestMapping(value = "InsertCourseByName", method = RequestMethod.POST)
    public InsertCourseByNameResponse insertCourseByNameResponse(@RequestBody InsertCourseByNameParameter parm){
        return courseblService.InsertCourseByNameResponse(parm);
    }

    @RequestMapping(value = "UpdateCourseByName", method = RequestMethod.POST)
    public UpdateCourseByNameResponse updateCourseByNameResponse(@RequestBody UpdateCourseByNameParameter para){
        return courseblService.UpdateCourseByNameResponse(para);
    }

}
