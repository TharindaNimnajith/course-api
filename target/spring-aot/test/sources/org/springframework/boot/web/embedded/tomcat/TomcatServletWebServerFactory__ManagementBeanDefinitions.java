package org.springframework.boot.web.embedded.tomcat;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TomcatServletWebServerFactory}
 */
public class TomcatServletWebServerFactory__ManagementBeanDefinitions {
  /**
   * Get the bean definition for 'managementContextWebServerFactory'
   */
  public static BeanDefinition getManagementContextWebServerFactoryBeanDefinition() {
    Class<?> beanType = TomcatServletWebServerFactory.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(TomcatServletWebServerFactory::new);
    return beanDefinition;
  }
}
