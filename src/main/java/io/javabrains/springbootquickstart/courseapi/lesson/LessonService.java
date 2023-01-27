package io.javabrains.springbootquickstart.courseapi.lesson;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonService {

    private final LessonRepository lessonRepository;

    public LessonService(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    public void saveLesson(Lesson lesson) {
        lessonRepository.save(lesson);
    }

    public void deleteLesson(String id) {
        lessonRepository.deleteById(id);
    }

    public Lesson getLesson(String id) {
        return lessonRepository.findById(id).orElse(null);
    }

    public List<Lesson> getLessons() {
        return lessonRepository.findAll();
    }

    public List<Lesson> getLessonsByName(String name) {
        return lessonRepository.findByName(name);
    }

    public List<Lesson> getLessonsByCourseId(String courseId) {
        return lessonRepository.findByCourseId(courseId);
    }

}
