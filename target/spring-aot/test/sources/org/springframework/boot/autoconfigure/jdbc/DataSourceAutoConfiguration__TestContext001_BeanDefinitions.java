package org.springframework.boot.autoconfigure.jdbc;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DataSourceAutoConfiguration}
 */
public class DataSourceAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'dataSourceAutoConfiguration'
   */
  public static BeanDefinition getDataSourceAutoConfigurationBeanDefinition() {
    Class<?> beanType = DataSourceAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(DataSourceAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link DataSourceAutoConfiguration.PooledDataSourceConfiguration}
   */
  public static class PooledDataSourceConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'pooledDataSourceConfiguration'
     */
    public static BeanDefinition getPooledDataSourceConfigurationBeanDefinition() {
      Class<?> beanType = DataSourceAutoConfiguration.PooledDataSourceConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(DataSourceAutoConfiguration.PooledDataSourceConfiguration::new);
      return beanDefinition;
    }
  }
}
