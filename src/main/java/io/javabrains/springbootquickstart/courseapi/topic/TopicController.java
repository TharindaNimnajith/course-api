package io.javabrains.springbootquickstart.courseapi.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicController {

    private final TopicService topicService1;
    @SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
    @Autowired
    private TopicService topicService;

    public TopicController(TopicService topicService) {
        this.topicService1 = topicService;
    }

    @GetMapping("/topics")
    public List<Topic> getTopics() {
        return topicService.getTopics();
    }

    @GetMapping("/topics/foo/{foo}")
    public Topic getTopicFoo(@PathVariable("foo") String id) {
        return topicService1.getTopic(id);
    }

    @GetMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

}
