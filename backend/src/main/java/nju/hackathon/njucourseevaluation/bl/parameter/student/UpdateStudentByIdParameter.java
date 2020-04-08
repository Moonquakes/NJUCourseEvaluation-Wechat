package nju.hackathon.njucourseevaluation.bl.parameter.student;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UpdateStudentByIdParameter {
    private Integer id;
    private String studentName;
    private int terms;
    private String studentNumber;
}
