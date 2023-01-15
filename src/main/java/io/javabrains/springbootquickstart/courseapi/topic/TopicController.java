package io.javabrains.springbootquickstart.courseapi.topic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SuppressWarnings({"CommentedOutCode", "GrazieInspection"})
@RestController
public class TopicController {

    // @Autowired
    // private TopicService topicService;

    private final TopicService topicService;

    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @GetMapping("/topics")
    public List<Topic> getTopics() {
        return topicService.getTopics();
    }

    @GetMapping("/topics/foo/{foo}")
    public Topic getTopicFoo(@PathVariable("foo") String id) {
        return topicService.getTopic(id);
    }

    @GetMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

}
