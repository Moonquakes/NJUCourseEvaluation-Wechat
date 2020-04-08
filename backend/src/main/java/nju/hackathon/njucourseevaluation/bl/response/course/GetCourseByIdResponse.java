package nju.hackathon.njucourseevaluation.bl.response.course;

import lombok.Getter;
import lombok.Setter;
import nju.hackathon.njucourseevaluation.entity.Course;

@Setter
@Getter
public class GetCourseByIdResponse {
    private Course course;
    public GetCourseByIdResponse(Course course){
        this.course = course;
    }
}
