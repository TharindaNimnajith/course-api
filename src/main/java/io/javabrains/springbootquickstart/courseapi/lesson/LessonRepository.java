package io.javabrains.springbootquickstart.courseapi.lesson;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LessonRepository extends CrudRepository<Lesson, String> {

    List<Lesson> findByName(String name);

    List<Lesson> findByCourseId(String courseId);

}
