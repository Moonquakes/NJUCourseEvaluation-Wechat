package nju.hackathon.njucourseevaluation.dataaccess.serviceinterface;

import nju.hackathon.njucourseevaluation.entity.Comment;
import nju.hackathon.njucourseevaluation.entity.Student;

public interface StudentDataAccessService {
    Student GetStudentById(int id);
    Student GetStudentByStudent_number(String studentNumber);
    Student InsertStudent(Integer id, String studentName, String studentNumber, int terms);
    Student UpdateStudentById(Integer id, String studentName, String studentNumber, int terms);
}
