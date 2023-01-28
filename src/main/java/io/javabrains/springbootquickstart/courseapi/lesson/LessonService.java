package io.javabrains.springbootquickstart.courseapi.lesson;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonService {

    private final LessonRepository lessonRepository;

    public LessonService(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    public Lesson saveLesson(Lesson lesson) {
        return lessonRepository.save(lesson);
    }

    public List<Lesson> saveAllLessons(List<Lesson> lessons) {
        return lessonRepository.saveAll(lessons);
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

    public List<Lesson> getLessonsByIds(List<String> ids) {
        return lessonRepository.findAllById(ids);
    }

    public boolean hasLesson(String id) {
        return lessonRepository.existsById(id);
    }

    public long countLessons() {
        return lessonRepository.count();
    }

}
