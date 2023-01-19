package io.javabrains.springbootquickstart.courseapi.course;

import io.javabrains.springbootquickstart.courseapi.newtopic.NewTopic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@SuppressWarnings("unused")
@Entity
@Table(name = "Courses")
public class Course {

    @Id
    private String id;
    private String name;
    private String description;
    @ManyToOne
    private NewTopic newTopic;

    public Course() {
        super();
        id = "";
        name = "";
        description = "";
        newTopic = null;
    }

    public Course(String id, String name, String description, String topicId) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.newTopic = new NewTopic(topicId, "", "");
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NewTopic getNewTopic() {
        return newTopic;
    }

    public void setNewTopic(NewTopic newTopic) {
        this.newTopic = newTopic;
    }

}
