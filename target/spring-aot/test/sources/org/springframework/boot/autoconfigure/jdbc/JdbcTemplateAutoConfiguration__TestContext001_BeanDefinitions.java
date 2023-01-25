package org.springframework.boot.autoconfigure.jdbc;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link JdbcTemplateAutoConfiguration}
 */
public class JdbcTemplateAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'jdbcTemplateAutoConfiguration'
   */
  public static BeanDefinition getJdbcTemplateAutoConfigurationBeanDefinition() {
    Class<?> beanType = JdbcTemplateAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(JdbcTemplateAutoConfiguration::new);
    return beanDefinition;
  }
}
