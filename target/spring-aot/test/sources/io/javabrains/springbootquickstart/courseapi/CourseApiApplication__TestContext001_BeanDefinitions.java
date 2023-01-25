package io.javabrains.springbootquickstart.courseapi;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link CourseApiApplication}
 */
public class CourseApiApplication__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'courseApiApplication'
   */
  public static BeanDefinition getCourseApiApplicationBeanDefinition() {
    Class<?> beanType = CourseApiApplication.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(CourseApiApplication.class);
    beanDefinition.setInstanceSupplier(CourseApiApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
