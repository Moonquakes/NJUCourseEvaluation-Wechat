package nju.hackathon.njucourseevaluation.bl.response.course;

import lombok.Getter;
import lombok.Setter;
import nju.hackathon.njucourseevaluation.entity.Course;

import java.util.List;

@Getter
@Setter
public class GetCoursesByCatagoryResponse {
    //TODO
    private List<Course> courseList;
    public GetCoursesByCatagoryResponse(List<Course> courseList){
        this.courseList = courseList;
    }
}
