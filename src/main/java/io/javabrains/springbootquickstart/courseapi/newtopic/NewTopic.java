package io.javabrains.springbootquickstart.courseapi.newtopic;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@SuppressWarnings("unused")
@Entity
@Table(name = "Topics")
public class NewTopic {

    @Id
    private String id;
    private String name;
    private String description;

    public NewTopic() {
        super();
        id = "";
        name = "";
        description = "";
    }

    public NewTopic(String id, String name, String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
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

}
