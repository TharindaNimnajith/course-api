package io.javabrains.springbootquickstart.courseapi.newtopic;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link NewTopicService}
 */
public class NewTopicService__TestContext001_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'newTopicService'.
   */
  private static BeanInstanceSupplier<NewTopicService> getNewTopicServiceInstanceSupplier() {
    return BeanInstanceSupplier.<NewTopicService>forConstructor(NewTopicRepository.class)
            .withGenerator((registeredBean, args) -> new NewTopicService(args.get(0)));
  }

  /**
   * Get the bean definition for 'newTopicService'
   */
  public static BeanDefinition getNewTopicServiceBeanDefinition() {
    Class<?> beanType = NewTopicService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getNewTopicServiceInstanceSupplier());
    return beanDefinition;
  }
}
