package io.javabrains.springbootquickstart.courseapi.newtopic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewTopicService {

    private final NewTopicRepository newTopicRepository;

    public NewTopicService(NewTopicRepository newTopicRepository) {
        this.newTopicRepository = newTopicRepository;
    }

    public void saveTopic(NewTopic newTopic) {
        newTopicRepository.save(newTopic);
    }

    public void deleteTopic(String id) {
        newTopicRepository.deleteById(id);
    }

    public NewTopic getTopic(String id) {
        return newTopicRepository.findById(id).orElse(null);
    }

    public List<NewTopic> getTopics() {
        List<NewTopic> newTopics = new ArrayList<>();
        newTopicRepository.findAll().forEach(newTopics::add);
        return newTopics;
    }

}
