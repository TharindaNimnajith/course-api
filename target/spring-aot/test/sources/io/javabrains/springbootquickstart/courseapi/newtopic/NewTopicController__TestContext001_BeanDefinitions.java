package io.javabrains.springbootquickstart.courseapi.newtopic;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link NewTopicController}
 */
public class NewTopicController__TestContext001_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'newTopicController'.
   */
  private static BeanInstanceSupplier<NewTopicController> getNewTopicControllerInstanceSupplier() {
    return BeanInstanceSupplier.<NewTopicController>forConstructor(NewTopicService.class)
            .withGenerator((registeredBean, args) -> new NewTopicController(args.get(0)));
  }

  /**
   * Get the bean definition for 'newTopicController'
   */
  public static BeanDefinition getNewTopicControllerBeanDefinition() {
    Class<?> beanType = NewTopicController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getNewTopicControllerInstanceSupplier());
    return beanDefinition;
  }
}
