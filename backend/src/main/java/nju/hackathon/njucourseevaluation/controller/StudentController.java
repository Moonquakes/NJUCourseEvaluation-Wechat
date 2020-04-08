package nju.hackathon.njucourseevaluation.controller;

import nju.hackathon.njucourseevaluation.bl.parameter.student.UpdateStudentByIdParameter;
import nju.hackathon.njucourseevaluation.bl.response.student.UpdateStudentByIdResponse;
import nju.hackathon.njucourseevaluation.bl.serviceinterface.StudentblService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    private StudentblService studentblService;

    @Autowired
    public StudentController(StudentblService studentblService){
        this.studentblService = studentblService;
    }

    @RequestMapping(value = "UpdateStudentById", method = RequestMethod.POST)
    public UpdateStudentByIdResponse updateStudentbyId(@RequestBody UpdateStudentByIdParameter parm){
        return studentblService.UpdateStudentByIdResponse(parm);
    }


}
