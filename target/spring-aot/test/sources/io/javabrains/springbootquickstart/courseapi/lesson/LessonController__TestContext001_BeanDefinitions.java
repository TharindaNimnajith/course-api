package io.javabrains.springbootquickstart.courseapi.lesson;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link LessonController}
 */
public class LessonController__TestContext001_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'lessonController'.
   */
  private static BeanInstanceSupplier<LessonController> getLessonControllerInstanceSupplier() {
    return BeanInstanceSupplier.<LessonController>forConstructor(LessonService.class)
            .withGenerator((registeredBean, args) -> new LessonController(args.get(0)));
  }

  /**
   * Get the bean definition for 'lessonController'
   */
  public static BeanDefinition getLessonControllerBeanDefinition() {
    Class<?> beanType = LessonController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getLessonControllerInstanceSupplier());
    return beanDefinition;
  }
}
