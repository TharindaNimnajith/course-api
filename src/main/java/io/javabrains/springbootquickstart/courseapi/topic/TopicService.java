package io.javabrains.springbootquickstart.courseapi.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private final List<Topic> topics = new ArrayList<>(
            Arrays.asList(
                    new Topic("springboot", "Spring Boot", "Spring Boot Description"),
                    new Topic("java", "Java", "Java Description"),
                    new Topic("javascript", "Javascript", "Javascript Description")
            )
    );

    public List<Topic> getTopics() {
        return topics;
    }

}
