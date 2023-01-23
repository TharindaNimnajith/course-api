package io.javabrains.springbootquickstart.courseapi.course;

import io.javabrains.springbootquickstart.courseapi.newtopic.NewTopic;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
        course.setNewTopic(new NewTopic(topicId, "", ""));
        courseService.saveCourse(course);
    }

    @PutMapping("topics/{topicId}/courses")
    public void updateCourse(@RequestBody Course course, @PathVariable String topicId) {
        course.setNewTopic(new NewTopic(topicId, "", ""));
        courseService.saveCourse(course);
    }

    @SuppressWarnings("MVCPathVariableInspection")
    @DeleteMapping("topics/{topicId}/courses/{id}")
    public void deleteCourse(@PathVariable String id) {
        courseService.deleteCourse(id);
    }

    @SuppressWarnings("MVCPathVariableInspection")
    @GetMapping("topics/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable String id) {
        return courseService.getCourse(id);
    }

    @GetMapping("courses")
    public List<Course> getCourses() {
        return courseService.getCourses();
    }

    @GetMapping("courses/name/{name}")
    public List<Course> getCoursesByName(@PathVariable String name) {
        return courseService.getCoursesByName(name);
    }

    @GetMapping("courses/description/{description}")
    public List<Course> getCoursesByDescription(@PathVariable String description) {
        return courseService.getCoursesByDescription(description);
    }

    @GetMapping("topics/{topicId}/courses")
    public List<Course> getCoursesByTopicId(@PathVariable String topicId) {
        return courseService.getCoursesByTopicId(topicId);
    }

}
