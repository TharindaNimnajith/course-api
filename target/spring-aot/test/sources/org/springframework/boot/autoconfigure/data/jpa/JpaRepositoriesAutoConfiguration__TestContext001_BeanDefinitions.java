package org.springframework.boot.autoconfigure.data.jpa;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link JpaRepositoriesAutoConfiguration}
 */
public class JpaRepositoriesAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'jpaRepositoriesAutoConfiguration'
   */
  public static BeanDefinition getJpaRepositoriesAutoConfigurationBeanDefinition() {
    Class<?> beanType = JpaRepositoriesAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(JpaRepositoriesAutoConfiguration::new);
    return beanDefinition;
  }
}
