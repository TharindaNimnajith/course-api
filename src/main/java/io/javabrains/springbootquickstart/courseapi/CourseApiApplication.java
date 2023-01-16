package io.javabrains.springbootquickstart.courseapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EntityScan
@EnableJpaRepositories
public class CourseApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseApiApplication.class, args);
    }

}
