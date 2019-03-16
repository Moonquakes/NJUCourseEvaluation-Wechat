package nju.hackathon.njucourseevaluation.dataaccess.serviceimpl;

import nju.hackathon.njucourseevaluation.dataaccess.dao.CourseDao;
import nju.hackathon.njucourseevaluation.dataaccess.serviceinterface.CourseDataAcessService;
import nju.hackathon.njucourseevaluation.entity.Comment;
import nju.hackathon.njucourseevaluation.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseDataAcessServiceImpl implements CourseDataAcessService {

    private final CourseDao courseDao;

    @Autowired
    public CourseDataAcessServiceImpl(CourseDao courseDao){
        this.courseDao = courseDao;
    }

    @Override
    public Course GetCourseById(int id) {
        return courseDao.findById(id).orElse(null);
    }

    @Override
    public Course InsertCourse(Integer id, String course_id_number, String courseName, int category, float rate, List<Comment> commentList, String description) {
        return courseDao.save(new Course(id, course_id_number, courseName, category, rate, commentList, description));
    }

    @Override
    public Course UpdateCourseByName(Integer id, String course_id_number, String courseName, int category, float rate, List<Comment> commentList, String description) {
        return courseDao.save(new Course(id, course_id_number, courseName, category, rate, commentList, description));
    }

    @Override
    public List<Course> GetCoursesByCatagory(int category) {
        return courseDao.findAllByCategory(category);
    }
}
