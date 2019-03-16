package nju.hackathon.njucourseevaluation.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.apachecommons.CommonsLog;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "comment")
@Setter
@Getter
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    //对应的课程
    @Column(name = "course")
    private String course;

    @Column(name = "date")
    private Date date;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "courses_id")
    private int courseId;


    //TODO 头像显示

    public Comment(){}
    public Comment(Integer id, String course, Date date, String studentName){
        this.id = id;
        this.course = course;
        this.date = date;
        this.studentName = studentName;
    }

}
