package org.springframework.boot.autoconfigure.orm.jpa;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HibernateJpaAutoConfiguration}
 */
public class HibernateJpaAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'hibernateJpaAutoConfiguration'
   */
  public static BeanDefinition getHibernateJpaAutoConfigurationBeanDefinition() {
    Class<?> beanType = HibernateJpaAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(HibernateJpaAutoConfiguration::new);
    return beanDefinition;
  }
}
