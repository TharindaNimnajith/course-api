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

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic newTopic) {
        for (int i = 0; i < topics.size(); i++) {
            Topic topic = topics.get(i);
            if (topic.getId().equals(id)) {
                topics.set(i, newTopic);
                break;
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(topic -> topic.getId().equals(id));
    }

    public Topic getTopic(String id) {
        // return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
        // 'Optional.get()' without 'isPresent()' check
        //
        // The main design goal of Optional is to provide a means for a function returning a value to indicate the
        // absence of a return value
        // This allows the caller to continue a chain of fluent method calls
        //
        // An alternative of throwing NoSuchElementException was replaced by returning an Optional
        // Having Optional enables to do fluent API thingies like:
        // stream.getFirst().orElseThrow(() -> new MyFancyException())

        // orElse(null) -> Returns the value if present, otherwise returns null
        return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().orElse(null);
    }

    public List<Topic> getTopics() {
        return topics;
    }
}
