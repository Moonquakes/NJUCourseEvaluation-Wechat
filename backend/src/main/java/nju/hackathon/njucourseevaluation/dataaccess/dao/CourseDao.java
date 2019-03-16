package nju.hackathon.njucourseevaluation.dataaccess.dao;

import nju.hackathon.njucourseevaluation.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseDao extends JpaRepository<Course, Integer> {
    public List<Course> findAllByCategory(int catagory);
}
