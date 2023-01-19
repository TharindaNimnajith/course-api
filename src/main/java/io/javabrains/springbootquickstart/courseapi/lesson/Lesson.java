package io.javabrains.springbootquickstart.courseapi.lesson;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@SuppressWarnings("unused")
@Entity
@Table(name = "Lessons")
public class Lesson {

    @Id
    private String id;

}
