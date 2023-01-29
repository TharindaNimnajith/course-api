package io.javabrains.springbootquickstart.courseapi.lesson;

import io.javabrains.springbootquickstart.courseapi.course.Course;
import jakarta.persistence.*;

@SuppressWarnings("unused")
@Entity
@Table(name = "Lessons")
public class Lesson {

    // Enum GenerationType
    //
    // TABLE - Indicates that the persistence provider must assign primary keys for the entity using an underlying
    // database table to ensure uniqueness
    //
    // SEQUENCE - Indicates that the persistence provider must assign primary keys for the entity using a database
    // sequence
    //
    // IDENTITY - Indicates that the persistence provider must assign primary keys for the entity using a database
    // identity column
    //
    // UUID - Indicates that the persistence provider must assign primary keys for the entity by generating an RFC 4122
    // Universally Unique Identifier
    //
    // AUTO - Indicates that the persistence provider should pick an appropriate strategy for the particular database.
    // The <code>AUTO</code> generation strategy may expect a database resource to exist, or it may attempt to create
    // one. A vendor may provide documentation on how to create such resources in the event that it does not support
    // schema generation or cannot create the schema resource at runtime.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    @ManyToOne
    private Course course;

    public Lesson() {
        super();
        id = 0;
        name = "";
        description = "";
        course = null;
    }

    public Lesson(long id, String name, String description, String courseId) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.course = new Course(courseId, "", "", "");
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

}
