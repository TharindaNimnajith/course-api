package io.javabrains.springbootquickstart.courseapi.newtopic;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class NewTopicController {

    private final NewTopicService newTopicService;

    public NewTopicController(NewTopicService topicService) {
        this.newTopicService = topicService;
    }

    @PostMapping("/topics")
    public void addTopic(@RequestBody NewTopic topic) {
        newTopicService.addTopic(topic);
    }

    @PutMapping("/topics/{id}")
    public void updateTopic(@PathVariable String id, @RequestBody NewTopic topic) {
        newTopicService.updateTopic(id, topic);
    }

    @DeleteMapping("/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        newTopicService.deleteTopic(id);
    }

    @GetMapping("/topics/{id}")
    public NewTopic getTopic(@PathVariable String id) {
        return newTopicService.getTopic(id);
    }

    @GetMapping("/topics")
    public List<NewTopic> getTopics() {
        return newTopicService.getTopics();
    }

}
