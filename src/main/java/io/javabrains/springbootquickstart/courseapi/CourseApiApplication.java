package io.javabrains.springbootquickstart.courseapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @ComponentScan
// Redundant declaration: @SpringBootApplication already applies given @ComponentScan
// Configures component scanning directives for use with @Configuration classes
// Tells Spring framework to look/scan for Spring-managed components like configurations, controllers, services, and
// other components
//
// @Configuration
// Indicates that a class declares one or more @Bean methods and may be processed by the Spring container to generate
// bean definitions and service requests for those beans at runtime
// Tags the class as a source of bean definitions for the application context
//
// @EnableAutoConfiguration
// Redundant declaration: @SpringBootApplication already applies @EnableAutoConfiguration
// Enables auto-configuration of the Spring Application Context, attempting to guess and configure beans that are
// likely to be needed
// Auto-configuration classes are usually applied based on the classpath and what beans have been defined
//
// @SpringBootApplication
// Indicates a configuration class that declares one or more @Bean methods and also triggers auto-configuration and
// component scanning
// This is a convenience annotation that is equivalent to declaring @Configuration, @EnableAutoConfiguration,
// and @ComponentScan
//
// @SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
// Exclude specific auto-configuration classes so that they will never be applied (Eg: DB related auto-configurations)

@SpringBootApplication
public class CourseApiApplication {

    public static void main(String[] args) {
        // SpringApplication - class that is used to bootstrap and launch a Spring application from a Java main method
        // run - static helper that is used to run SpringApplication from specified source using default settings
        SpringApplication.run(CourseApiApplication.class, args);
    }

}
