package io.javabrains.springbootquickstart.courseapi.topic;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TopicService}
 */
public class TopicService__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'topicService'
   */
  public static BeanDefinition getTopicServiceBeanDefinition() {
    Class<?> beanType = TopicService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(TopicService::new);
    return beanDefinition;
  }
}
