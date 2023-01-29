package io.javabrains.springbootquickstart.courseapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// @SpringBootTest that can be specified on a test class that runs Spring Boot based tests
@SpringBootTest
class CourseApiApplicationTests {

    // @Test is used to signal that the annotated method is a test method
    // @Test methods must not be private or static and must not return a value

    @SuppressWarnings("EmptyMethod")
    @Test
    void contextLoads() {
        //
    }

}
