package io.javabrains.springbootquickstart.courseapi.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    // Spring Dependency Injection Types:
    //
    // 01. Constructor-based dependency injection - Class constructor is annotated with @Autowired and includes a
    // variable number of arguments with the objects to be injected
    //
    // 02. Setter-based dependency injection - Setter methods are annotated with @Autowired and Spring container will
    // call these setter methods once the Bean is instantiated
    //
    // 03. Field-based dependency injection - Fields/properties are annotated with @Autowired and Spring container will
    // set these fields once the class is instantiated

    // final keyword in Java:
    // If a variable is final, its value cannot be changed (constant)
    // If a method is final, it cannot be overridden
    // If a class is final, it cannot be extended
    private final TopicService topicServiceConstructor;

    // Field-based dependency injection is elegant, avoids the boilerplate code for getters and setters or creating
    // constructors for the class
    // But it has the following drawbacks:
    // 01. Disallows final/immutable field declaration
    // 02. Eases single responsibility principle violation
    // 03. Tightly coupled with dependency injection container
    // 04. Hidden dependencies

    // Field-based dependency injection
    @SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
    @Autowired // Annotation is mandatory
    private TopicService topicService;

    // Field injection is not recommended, because the list of required dependencies are unclear during instance
    // creation which makes testing more difficult and could lead to runtime exceptions when the bean is instantiated
    // without spring
    //
    // To clearly state the required dependencies of the class, they should be added to the constructor that has the
    // @Autowired annotation, so that these dependencies can be provided more easily through Spring's dependency
    // injection mechanism
    //
    // Constructor-based injection is recommended for required dependencies allowing them to be immutable and
    // preventing them to be null
    //
    // Setter-based injection is recommended for optional dependencies
    //
    // As of Spring Framework 4.3, an @Autowired annotation on such a constructor is no longer necessary if the target
    // bean only defines one constructor to begin with
    // However, if several constructors are available, at least one must be annotated to teach the container which one
    // to use

    // Constructor-based dependency injection
    @Autowired // Annotation is optional
    public TopicController(TopicService topicServiceConstructor) {
        this.topicServiceConstructor = topicServiceConstructor;
    }

    @PostMapping("/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @PutMapping("/topics/{id}")
    public void updateTopic(@PathVariable String id, @RequestBody Topic topic) {
        topicService.updateTopic(id, topic);
    }

    @DeleteMapping("/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }

    @GetMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @GetMapping("/topics/foo/{foo}")
    public Topic getTopicFoo(@PathVariable("foo") String id) {
        return topicServiceConstructor.getTopic(id);
    }

    @GetMapping("/topics")
    public List<Topic> getTopics() {
        return topicService.getTopics();
    }

}
