package io.javabrains.springbootquickstart.courseapi.lesson;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class LessonController {

    private final LessonService lessonService;

    public LessonController(LessonService lessonService) {
        this.lessonService = lessonService;
    }

    @PostMapping("/lessons")
    public void addLesson(@RequestBody Lesson lesson) {
        lessonService.saveLesson(lesson);
    }

    @PutMapping("/lessons")
    public void updateLesson(@RequestBody Lesson lesson) {
        lessonService.saveLesson(lesson);
    }

    @DeleteMapping("/lessons/{id}")
    public void deleteLesson(@PathVariable String id) {
        lessonService.deleteLesson(id);
    }

    @GetMapping("/lessons/{id}")
    public Lesson getLesson(@PathVariable String id) {
        return lessonService.getLesson(id);
    }

    @GetMapping("/lessons")
    public List<Lesson> getLessons() {
        return lessonService.getLessons();
    }

}
