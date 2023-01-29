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
    public Lesson addLesson(@RequestBody Lesson lesson, @PathVariable String courseId) {
        lesson.setCourse(new Course(courseId, "", "", ""));
        return lessonService.saveLesson(lesson);
    }

    @SuppressWarnings("MVCPathVariableInspection")
    @PostMapping("topics/{topicId}/courses/{courseId}/lessons/bulk")
    public List<Lesson> addAllLessons(@RequestBody List<Lesson> lessons, @PathVariable String courseId) {
        lessons.forEach(lesson -> lesson.setCourse(new Course(courseId, "", "", "")));
        return lessonService.saveAllLessons(lessons);
    }

    @SuppressWarnings("MVCPathVariableInspection")
    @PutMapping("topics/{topicId}/courses/{courseId}/lessons")
    public Lesson updateLesson(@RequestBody Lesson lesson, @PathVariable String courseId) {
        lesson.setCourse(new Course(courseId, "", "", ""));
        return lessonService.saveLesson(lesson);
    }

    @SuppressWarnings("MVCPathVariableInspection")
    @DeleteMapping("topics/{topicId}/courses/{courseId}/lessons/{id}")
    public void deleteLessonById(@PathVariable String id) {
        lessonService.deleteLessonById(id);
    }

    @SuppressWarnings("MVCPathVariableInspection")
    @DeleteMapping("topics/{topicId}/courses/{courseId}/lessons")
    public void deleteLesson(@RequestBody Lesson lesson) {
        lessonService.deleteLesson(lesson);
    }

    @DeleteMapping("lessons")
    public void deleteLessonsById(@RequestBody List<String> ids) {
        lessonService.deleteLessonsById(ids);
    }

    @DeleteMapping("lessons/bulk")
    public void deleteLessons(@RequestBody List<Lesson> lessons) {
        lessonService.deleteLessons(lessons);
    }

    @DeleteMapping("lessons/all")
    public void deleteAllLesson() {
        lessonService.deleteAllLesson();
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

    @PostMapping("lessons")
    public List<Lesson> getLessonsByIds(@RequestBody List<String> ids) {
        return lessonService.getLessonsByIds(ids);
    }

    @GetMapping("lessons/exists/{id}")
    public boolean hasLesson(@PathVariable String id) {
        return lessonService.hasLesson(id);
    }

    @GetMapping("lessons/count")
    public long countLessons() {
        return lessonService.countLessons();
    }

}
