package org.springframework.boot.actuate.autoconfigure.metrics.jdbc;

import java.lang.Class;
import java.util.Map;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DataSourcePoolMetricsAutoConfiguration}
 */
public class DataSourcePoolMetricsAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'dataSourcePoolMetricsAutoConfiguration'
   */
  public static BeanDefinition getDataSourcePoolMetricsAutoConfigurationBeanDefinition() {
    Class<?> beanType = DataSourcePoolMetricsAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(DataSourcePoolMetricsAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link DataSourcePoolMetricsAutoConfiguration.HikariDataSourceMetricsConfiguration}
   */
  public static class HikariDataSourceMetricsConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'hikariDataSourceMetricsConfiguration'
     */
    public static BeanDefinition getHikariDataSourceMetricsConfigurationBeanDefinition() {
      Class<?> beanType = DataSourcePoolMetricsAutoConfiguration.HikariDataSourceMetricsConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(DataSourcePoolMetricsAutoConfiguration.HikariDataSourceMetricsConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'hikariDataSourceMeterBinder'.
     */
    private static BeanInstanceSupplier<DataSourcePoolMetricsAutoConfiguration.HikariDataSourceMetricsConfiguration.HikariDataSourceMeterBinder> getHikariDataSourceMeterBinderInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<DataSourcePoolMetricsAutoConfiguration.HikariDataSourceMetricsConfiguration.HikariDataSourceMeterBinder>forFactoryMethod(DataSourcePoolMetricsAutoConfiguration.HikariDataSourceMetricsConfiguration.class, "hikariDataSourceMeterBinder", ObjectProvider.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(DataSourcePoolMetricsAutoConfiguration.HikariDataSourceMetricsConfiguration.class).hikariDataSourceMeterBinder(args.get(0)));
    }

    /**
     * Get the bean definition for 'hikariDataSourceMeterBinder'
     */
    public static BeanDefinition getHikariDataSourceMeterBinderBeanDefinition() {
      Class<?> beanType = DataSourcePoolMetricsAutoConfiguration.HikariDataSourceMetricsConfiguration.HikariDataSourceMeterBinder.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getHikariDataSourceMeterBinderInstanceSupplier());
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link DataSourcePoolMetricsAutoConfiguration.DataSourcePoolMetadataMetricsConfiguration}
   */
  public static class DataSourcePoolMetadataMetricsConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'dataSourcePoolMetadataMetricsConfiguration'
     */
    public static BeanDefinition getDataSourcePoolMetadataMetricsConfigurationBeanDefinition() {
      Class<?> beanType = DataSourcePoolMetricsAutoConfiguration.DataSourcePoolMetadataMetricsConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(DataSourcePoolMetricsAutoConfiguration.DataSourcePoolMetadataMetricsConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'dataSourcePoolMetadataMeterBinder'.
     */
    private static BeanInstanceSupplier<DataSourcePoolMetricsAutoConfiguration.DataSourcePoolMetadataMetricsConfiguration.DataSourcePoolMetadataMeterBinder> getDataSourcePoolMetadataMeterBinderInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<DataSourcePoolMetricsAutoConfiguration.DataSourcePoolMetadataMetricsConfiguration.DataSourcePoolMetadataMeterBinder>forFactoryMethod(DataSourcePoolMetricsAutoConfiguration.DataSourcePoolMetadataMetricsConfiguration.class, "dataSourcePoolMetadataMeterBinder", Map.class, ObjectProvider.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(DataSourcePoolMetricsAutoConfiguration.DataSourcePoolMetadataMetricsConfiguration.class).dataSourcePoolMetadataMeterBinder(args.get(0), args.get(1)));
    }

    /**
     * Get the bean definition for 'dataSourcePoolMetadataMeterBinder'
     */
    public static BeanDefinition getDataSourcePoolMetadataMeterBinderBeanDefinition() {
      Class<?> beanType = DataSourcePoolMetricsAutoConfiguration.DataSourcePoolMetadataMetricsConfiguration.DataSourcePoolMetadataMeterBinder.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getDataSourcePoolMetadataMeterBinderInstanceSupplier());
      return beanDefinition;
    }
  }
}
