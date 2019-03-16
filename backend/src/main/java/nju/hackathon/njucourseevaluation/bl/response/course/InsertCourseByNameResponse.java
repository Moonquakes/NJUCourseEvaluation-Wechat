package nju.hackathon.njucourseevaluation.bl.response.course;

import nju.hackathon.njucourseevaluation.bl.response.Response;
import nju.hackathon.njucourseevaluation.entity.Course;

public class InsertCourseByNameResponse extends Response {
    private Course course;
    public InsertCourseByNameResponse(Course course){
        this.course = course;
    }

}
