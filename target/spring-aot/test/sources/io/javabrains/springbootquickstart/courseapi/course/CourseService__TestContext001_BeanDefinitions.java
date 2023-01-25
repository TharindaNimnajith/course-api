package io.javabrains.springbootquickstart.courseapi.course;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CourseService}
 */
public class CourseService__TestContext001_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'courseService'.
   */
  private static BeanInstanceSupplier<CourseService> getCourseServiceInstanceSupplier() {
    return BeanInstanceSupplier.<CourseService>forConstructor(CourseRepository.class)
            .withGenerator((registeredBean, args) -> new CourseService(args.get(0)));
  }

  /**
   * Get the bean definition for 'courseService'
   */
  public static BeanDefinition getCourseServiceBeanDefinition() {
    Class<?> beanType = CourseService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getCourseServiceInstanceSupplier());
    return beanDefinition;
  }
}
