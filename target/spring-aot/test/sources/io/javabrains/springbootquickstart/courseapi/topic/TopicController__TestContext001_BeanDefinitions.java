package io.javabrains.springbootquickstart.courseapi.topic;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TopicController}
 */
public class TopicController__TestContext001_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'topicController'.
   */
  private static BeanInstanceSupplier<TopicController> getTopicControllerInstanceSupplier() {
    return BeanInstanceSupplier.<TopicController>forConstructor(TopicService.class)
            .withGenerator((registeredBean, args) -> new TopicController(args.get(0)));
  }

  /**
   * Get the bean definition for 'topicController'
   */
  public static BeanDefinition getTopicControllerBeanDefinition() {
    Class<?> beanType = TopicController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<TopicController> instanceSupplier = getTopicControllerInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(TopicController__TestContext001_Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
