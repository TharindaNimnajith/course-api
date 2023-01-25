package org.springframework.boot.actuate.autoconfigure.jdbc;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DataSourceHealthIndicatorProperties}
 */
public class DataSourceHealthIndicatorProperties__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'dataSourceHealthIndicatorProperties'
   */
  public static BeanDefinition getDataSourceHealthIndicatorPropertiesBeanDefinition() {
    Class<?> beanType = DataSourceHealthIndicatorProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(DataSourceHealthIndicatorProperties::new);
    return beanDefinition;
  }
}
