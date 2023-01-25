package org.springframework.boot.autoconfigure.jdbc.metadata;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.jdbc.metadata.DataSourcePoolMetadataProvider;

/**
 * Bean definitions for {@link DataSourcePoolMetadataProvidersConfiguration}
 */
public class DataSourcePoolMetadataProvidersConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'dataSourcePoolMetadataProvidersConfiguration'
   */
  public static BeanDefinition getDataSourcePoolMetadataProvidersConfigurationBeanDefinition() {
    Class<?> beanType = DataSourcePoolMetadataProvidersConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(DataSourcePoolMetadataProvidersConfiguration::new);
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link DataSourcePoolMetadataProvidersConfiguration.HikariPoolDataSourceMetadataProviderConfiguration}
   */
  public static class HikariPoolDataSourceMetadataProviderConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'hikariPoolDataSourceMetadataProviderConfiguration'
     */
    public static BeanDefinition getHikariPoolDataSourceMetadataProviderConfigurationBeanDefinition(
        ) {
      Class<?> beanType = DataSourcePoolMetadataProvidersConfiguration.HikariPoolDataSourceMetadataProviderConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(DataSourcePoolMetadataProvidersConfiguration.HikariPoolDataSourceMetadataProviderConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'hikariPoolDataSourceMetadataProvider'.
     */
    private static BeanInstanceSupplier<DataSourcePoolMetadataProvider> getHikariPoolDataSourceMetadataProviderInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<DataSourcePoolMetadataProvider>forFactoryMethod(DataSourcePoolMetadataProvidersConfiguration.HikariPoolDataSourceMetadataProviderConfiguration.class, "hikariPoolDataSourceMetadataProvider")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(DataSourcePoolMetadataProvidersConfiguration.HikariPoolDataSourceMetadataProviderConfiguration.class).hikariPoolDataSourceMetadataProvider());
    }

    /**
     * Get the bean definition for 'hikariPoolDataSourceMetadataProvider'
     */
    public static BeanDefinition getHikariPoolDataSourceMetadataProviderBeanDefinition() {
      Class<?> beanType = DataSourcePoolMetadataProvider.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getHikariPoolDataSourceMetadataProviderInstanceSupplier());
      return beanDefinition;
    }
  }
}
