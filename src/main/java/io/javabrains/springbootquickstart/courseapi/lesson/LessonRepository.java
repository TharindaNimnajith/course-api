package io.javabrains.springbootquickstart.courseapi.lesson;

import org.springframework.data.repository.CrudRepository;

public interface LessonRepository extends CrudRepository<Lesson, String> {
    //
}
