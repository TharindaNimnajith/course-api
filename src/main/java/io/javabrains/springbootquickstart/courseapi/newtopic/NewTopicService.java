package io.javabrains.springbootquickstart.courseapi.newtopic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class NewTopicService {

    private final List<NewTopic> topics = new ArrayList<>(
        Arrays.asList(
            new NewTopic("springboot", "Spring Boot", "Spring Boot Description"),
            new NewTopic("java", "Java", "Java Description"),
            new NewTopic("javascript", "Javascript", "Javascript Description")
        )
    );

    public void addTopic(NewTopic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, NewTopic newTopic) {
        for (int i = 0; i < topics.size(); i++) {
            NewTopic topic = topics.get(i);
            if (topic.getId().equals(id)) {
                topics.set(i, newTopic);
                break;
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(topic -> topic.getId().equals(id));
    }

    public NewTopic getTopic(String id) {
        return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().orElse(null);
    }

    public List<NewTopic> getTopics() {
        return topics;
    }
}
