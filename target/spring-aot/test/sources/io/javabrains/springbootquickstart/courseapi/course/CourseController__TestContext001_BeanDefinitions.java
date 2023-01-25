package io.javabrains.springbootquickstart.courseapi.course;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CourseController}
 */
public class CourseController__TestContext001_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'courseController'.
   */
  private static BeanInstanceSupplier<CourseController> getCourseControllerInstanceSupplier() {
    return BeanInstanceSupplier.<CourseController>forConstructor(CourseService.class)
            .withGenerator((registeredBean, args) -> new CourseController(args.get(0)));
  }

  /**
   * Get the bean definition for 'courseController'
   */
  public static BeanDefinition getCourseControllerBeanDefinition() {
    Class<?> beanType = CourseController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getCourseControllerInstanceSupplier());
    return beanDefinition;
  }
}
