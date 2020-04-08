package nju.hackathon.njucourseevaluation.dataaccess.serviceinterface;

import nju.hackathon.njucourseevaluation.entity.Comment;
import nju.hackathon.njucourseevaluation.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CourseDataAcessService {
    Course GetCourseById(int id);
    Course InsertCourse(Integer id, String course_id_number, String courseName, int category, float rate, List<Comment> commentList, String description);
    Course UpdateCourseByName(Integer id, String course_id_number, String courseName, int category, float rate, List<Comment> commentList, String description);
    List<Course> GetCoursesByCatagory(int catagory);
}
