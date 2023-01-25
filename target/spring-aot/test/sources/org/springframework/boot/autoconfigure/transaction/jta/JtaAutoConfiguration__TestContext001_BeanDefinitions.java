package org.springframework.boot.autoconfigure.transaction.jta;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link JtaAutoConfiguration}
 */
public class JtaAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'jtaAutoConfiguration'
   */
  public static BeanDefinition getJtaAutoConfigurationBeanDefinition() {
    Class<?> beanType = JtaAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(JtaAutoConfiguration::new);
    return beanDefinition;
  }
}
