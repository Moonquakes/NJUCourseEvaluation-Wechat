package nju.hackathon.njucourseevaluation.dataaccess.dao;

import nju.hackathon.njucourseevaluation.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student, Integer> {
    Student findStudentByStudentNumber(String studentNumber);
}
