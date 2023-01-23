package io.javabrains.springbootquickstart.courseapi.lesson;

import io.javabrains.springbootquickstart.courseapi.course.Course;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class LessonController {

    private final LessonService lessonService;

    public LessonController(LessonService lessonService) {
        this.lessonService = lessonService;
    }

    @SuppressWarnings("MVCPathVariableInspection")
    @PostMapping("topics/{topicId}/courses/{courseId}/lessons")
    public void addLesson(@RequestBody Lesson lesson, @PathVariable String courseId) {
        lesson.setCourse(new Course(courseId, "", "", ""));
        lessonService.saveLesson(lesson);
    }

    @SuppressWarnings("MVCPathVariableInspection")
    @PutMapping("topics/{topicId}/courses/{courseId}/lessons")
    public void updateLesson(@RequestBody Lesson lesson, @PathVariable String courseId) {
        lesson.setCourse(new Course(courseId, "", "", ""));
        lessonService.saveLesson(lesson);
    }

    @SuppressWarnings("MVCPathVariableInspection")
    @DeleteMapping("topics/{topicId}/courses/{courseId}/lessons/{id}")
    public void deleteLesson(@PathVariable String id) {
        lessonService.deleteLesson(id);
    }

    @SuppressWarnings("MVCPathVariableInspection")
    @GetMapping("topics/{topicId}/courses/{courseId}/lessons/{id}")
    public Lesson getLesson(@PathVariable String id) {
        return lessonService.getLesson(id);
    }

    @GetMapping("lessons")
    public List<Lesson> getLessons() {
        return lessonService.getLessons();
    }

    @GetMapping("lessons/name/{name}")
    public List<Lesson> getLessonsByName(@PathVariable String name) {
        return lessonService.getLessonsByName(name);
    }

    @SuppressWarnings("MVCPathVariableInspection")
    @GetMapping("topics/{topicId}/courses/{courseId}/lessons")
    public List<Lesson> getLessonsByCourseId(@PathVariable String courseId) {
        return lessonService.getLessonsByCourseId(courseId);
    }

}
