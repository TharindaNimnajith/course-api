package io.javabrains.springbootquickstart.courseapi.hello;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HelloWorldController}
 */
public class HelloWorldController__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'helloWorldController'
   */
  public static BeanDefinition getHelloWorldControllerBeanDefinition() {
    Class<?> beanType = HelloWorldController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(HelloWorldController::new);
    return beanDefinition;
  }
}
