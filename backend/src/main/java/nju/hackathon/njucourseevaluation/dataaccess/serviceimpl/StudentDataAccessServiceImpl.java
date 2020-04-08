package nju.hackathon.njucourseevaluation.dataaccess.serviceimpl;

import nju.hackathon.njucourseevaluation.dataaccess.dao.StudentDao;
import nju.hackathon.njucourseevaluation.dataaccess.serviceinterface.StudentDataAccessService;
import nju.hackathon.njucourseevaluation.entity.Comment;
import nju.hackathon.njucourseevaluation.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentDataAccessServiceImpl implements StudentDataAccessService {

    public final StudentDao studentDao;
    @Autowired
    public StudentDataAccessServiceImpl(StudentDao studentDao){
        this.studentDao = studentDao;
    }

    @Override
    public Student GetStudentById(int id) {
        return studentDao.findById(id).orElse(null);
    }

    @Override
    public Student GetStudentByStudent_number(String studentNumber) {
        return studentDao.findStudentByStudentNumber(studentNumber);
    }

    @Override
    public Student InsertStudent(Integer id, String studentName, String studentNumber, int terms) {
        return studentDao.save(new Student(id, studentName, studentNumber,  terms));
    }

    @Override
    public Student UpdateStudentById(Integer id, String studentName, String studentNumber, int terms) {
        return studentDao.save(new Student(id, studentName, studentNumber, terms));
    }
}
