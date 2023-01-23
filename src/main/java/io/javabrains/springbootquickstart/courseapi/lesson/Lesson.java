package io.javabrains.springbootquickstart.courseapi.lesson;

import io.javabrains.springbootquickstart.courseapi.course.Course;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@SuppressWarnings("unused")
@Entity
@Table(name = "Lessons")
public class Lesson {

    @Id
    private String id;
    private String name;
    @ManyToOne
    private Course course;

    public Lesson() {
        super();
        id = "";
        name = "";
        course = null;
    }

    public Lesson(String id, String name, String courseId) {
        super();
        this.id = id;
        this.name = name;
        this.course = new Course(courseId, "", "", "");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
