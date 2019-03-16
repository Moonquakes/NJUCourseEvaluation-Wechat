package nju.hackathon.njucourseevaluation.bl.parameter.course;

import lombok.Getter;
import lombok.Setter;
import nju.hackathon.njucourseevaluation.entity.Comment;

import java.util.List;

@Getter
@Setter
public class UpdateCourseByNameParameter { //添加评论和评分
    private int id;
    private String course_id;
    private int category;
    private float rate;
    private List<Comment> commentList;
    private String description;
    private String courseName;
}
