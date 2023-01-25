package io.javabrains.springbootquickstart.courseapi.lesson;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link LessonService}
 */
public class LessonService__TestContext001_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'lessonService'.
   */
  private static BeanInstanceSupplier<LessonService> getLessonServiceInstanceSupplier() {
    return BeanInstanceSupplier.<LessonService>forConstructor(LessonRepository.class)
            .withGenerator((registeredBean, args) -> new LessonService(args.get(0)));
  }

  /**
   * Get the bean definition for 'lessonService'
   */
  public static BeanDefinition getLessonServiceBeanDefinition() {
    Class<?> beanType = LessonService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getLessonServiceInstanceSupplier());
    return beanDefinition;
  }
}
