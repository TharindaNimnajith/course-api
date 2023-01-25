package org.springframework.boot.autoconfigure.jdbc;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link JdbcProperties}
 */
public class JdbcProperties__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'jdbcProperties'
   */
  public static BeanDefinition getJdbcPropertiesBeanDefinition() {
    Class<?> beanType = JdbcProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(JdbcProperties::new);
    return beanDefinition;
  }
}
