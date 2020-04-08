package nju.hackathon.njucourseevaluation.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student")
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "student_number")
    private String studentNumber;

    @Column(name = "terms")
    private int terms;


    public Student(){ }

    public Student(Integer id, String studentName, String studentNumber, int terms){
        this.id = id;
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.terms = terms;
//        this.courseList = courseList;
    }
}
