package nju.hackathon.njucourseevaluation.bl.serviceimpl;

import nju.hackathon.njucourseevaluation.bl.parameter.course.UpdateCourseByNameParameter;
import nju.hackathon.njucourseevaluation.bl.parameter.student.UpdateStudentByIdParameter;
import nju.hackathon.njucourseevaluation.bl.response.student.UpdateStudentByIdResponse;
import nju.hackathon.njucourseevaluation.bl.serviceinterface.StudentblService;
import nju.hackathon.njucourseevaluation.dataaccess.serviceimpl.StudentDataAccessServiceImpl;
import nju.hackathon.njucourseevaluation.dataaccess.serviceinterface.StudentDataAccessService;
import nju.hackathon.njucourseevaluation.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentblServiceImpl implements StudentblService {
    private StudentDataAccessService studentDataAccessService;

    @Autowired(required = false)
    public StudentblServiceImpl(StudentDataAccessService studentDataAccessService){
        this.studentDataAccessService = studentDataAccessService;
    }

    @Override
    public UpdateStudentByIdResponse UpdateStudentByIdResponse(UpdateStudentByIdParameter parm) {
        Student student = studentDataAccessService.UpdateStudentById(parm.getId(), parm.getStudentName(), parm.getStudentNumber(),parm.getTerms());
        return new UpdateStudentByIdResponse(student.getId());
    }

}
