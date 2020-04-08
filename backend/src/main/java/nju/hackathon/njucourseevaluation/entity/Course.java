package nju.hackathon.njucourseevaluation.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "course")
@Getter
@Setter
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "course_number")
    private String course_number;

    @Column(name = "course_name")
    private String courseName;

    //课程类型
    /**
     * 1 专业课
     * 2 通识课
     * 3 通修课
     * 4 阅读
     * 5 公选
     */

    @Column(name = "category")
    private int category;


    @Column(name = "description")
    private String description;

    @Column(name = "rate")
    private float rate;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "courses_id")
    private List<Comment> commentList;

//    class Description {
//
//        private String teacher;
//
//        private String homework;
//
//        private String requirement;
//
//        private String books;
//    }

    public Course(){}

    public Course(Integer id, String course_number, String courseName, int category, float rate, List<Comment> commentList,
                  String description){
        this.id = id;
        this.course_number = course_number;
        this.courseName = courseName;
        this.category = category;
        this.rate = rate;
        this.commentList = commentList;
        this.description = description;
    }
}
