package io.javabrains.springbootquickstart.courseapi.course;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public void saveCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }

    public Course getCourse(String id) {
        return courseRepository.findById(id).orElse(null);
    }

    @SuppressWarnings("CommentedOutCode")
    public List<Course> getCourses() {
        // List<Course> courses = new ArrayList<>();
        // courseRepository.findAll().forEach(courses::add);
        // return courses;

        return (List<Course>) courseRepository.findAll();
    }

    public List<Course> getCoursesByName(String name) {
        return courseRepository.findByName(name);
    }

    public List<Course> getCoursesByDescription(String description) {
        return courseRepository.findByDescription(description);
    }

    public List<Course> getCoursesByTopicId(String topicId) {
        return courseRepository.findByNewTopicId(topicId);
    }

}
